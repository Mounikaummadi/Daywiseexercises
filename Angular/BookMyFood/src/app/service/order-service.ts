import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';

import { IOrder } from '../iorder';
import { BASE_URL } from './util/appmstant';

@Injectable({ providedIn: 'root' })
export class OrderService {
  constructor(private http: HttpClient) {}

  async save(order: IOrder): Promise<Observable<IOrder>> {
    const token = localStorage.getItem('token') ?? '';
    const headers = new HttpHeaders()
      .set('Content-Type', 'application/json')
      .set('Authorization', `Bearer ${token}`);

    const url = `${BASE_URL}/order`;
    return this.http.post<IOrder>(url, order, { headers });
  }
}
