import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ivehicle } from './ivehicle';

@Injectable({
  providedIn: 'root'  
})
export class VehicleService {
  private apiUrl = 'http://localhost:3000/vehicles';
  constructor(private http: HttpClient) {}

  getVehicles():  Observable<Ivehicle[]> {
    return this.http.get<Ivehicle[]>(this.apiUrl);
  }
  getVehicleById(id: number): Observable<Ivehicle> {
  return this.http.get<Ivehicle>(`${this.apiUrl}/${id}`);
  }

  addVehicle(vehicle: Partial<Ivehicle>): Observable<Ivehicle> {
    return this.http.post<Ivehicle>(this.apiUrl, vehicle);
  }


  updateVehicle(vehicle: Ivehicle): Observable<Ivehicle> {
    return this.http.put<Ivehicle>(`${this.apiUrl}/${vehicle.id}`, vehicle);
  }

  deleteVehicle(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }

}

