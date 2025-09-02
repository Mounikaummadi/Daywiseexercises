import { Component, OnInit } from '@angular/core';
import { FoodService } from '../service/food-service';
import { Router } from '@angular/router';
import { IUser } from '../iuser';
import { FormsModule, NgModel } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { LoginService } from '../service/login-service';
import { TokenData } from '../token-data';

@Component({
  selector: 'app-login',
  standalone:true,
  imports: [FormsModule,CommonModule],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {
 user: IUser = { email: '', name: '', passWord: '' };
  jwttoken: TokenData = { token: '' };

  constructor(private userService: LoginService, private router: Router) {}

  login() {
    this.userService.login(this.user).subscribe((data) => {
      this.jwttoken = data;
      localStorage.setItem('token', this.jwttoken.token);
      this.router.navigate(['/foodlist']);     // <— was /movielist
    });
  }
}