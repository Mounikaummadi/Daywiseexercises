import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IFood } from '../../interfaces/food';
import { BASE_URL } from './util/appmstant';

@Injectable({ providedIn: 'root' })
export class FoodService {
  constructor(private http: HttpClient) {}

  getAllFoods(): Observable<IFood[]> {
    const token = localStorage.getItem('token') ?? '';
    const headers = new HttpHeaders()
      .set('Content-Type', 'application/json')
      .set('Authorization', `Bearer ${token}`);   // IMPORTANT: add "Bearer "

    const url = `${BASE_URL}/foodList`;
    return this.http.get<IFood[]>(url, { headers });
  }
}
