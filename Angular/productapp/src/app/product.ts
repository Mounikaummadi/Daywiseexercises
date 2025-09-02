import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Iproduct } from './iproduct';
import { Iorder } from './iorder';

@Injectable({
  providedIn: 'root'
})
export class Product {
  // EX1
  private url = 'http://localhost:9000/products';
  constructor(private http: HttpClient) { }
  
  getProducts(): Observable<Iproduct[]> {
    return this.http.get<Iproduct[]>(this.url);
  }

  addProduct(product: Iproduct): Observable<Iproduct> {
    return this.http.post<Iproduct>(this.url, product);
  }

  findProduct(id: string): Observable<Iproduct> {
    return this.http.get<Iproduct>(`${this.url}/${id}`);
  }

  updateProduct(product: Iproduct): Observable<Iproduct> {
    return this.http.put<Iproduct>(`${this.url}/${product.id}`, product);
  }

  deleteProduct(id: string): Observable<void> {
    return this.http.delete<void>(`${this.url}/${id}`);
  }

  purchase(body: {productId: number, quantity: number}): Observable<void> {
  return this.http.post<void>(`${this.url}/purchase`, body);
  }
  getOrders(): Observable<Iorder[]> {
  return this.http.get<Iorder[]>(`${this.url}/orders`);
}
}