import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, tap } from 'rxjs';
import { IUser } from '../iuser';
import { TokenData } from '../token-data';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private apiUrl = 'http://localhost:9000/user/login'; 

  constructor(private http: HttpClient) {}

  login(loginData: IUser): Observable<TokenData> {
    return this.http.post<TokenData>(this.apiUrl, loginData).pipe(
      tap((res: TokenData) => {
       
        localStorage.setItem('token', res.token);
      
        localStorage.setItem('userEmail', loginData.email);
      })
    );
  }


  getToken(): string | null {
    return localStorage.getItem('token');
  }


  isLoggedIn(): boolean {
    return !!this.getToken();
  }


  logout(): void {
    localStorage.removeItem('token');
    localStorage.removeItem('userEmail');
  }
}
