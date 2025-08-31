import { Routes } from '@angular/router';
import { Login } from './login/login';
import { FoodList } from './food-list/food-list';

export const routes: Routes = [
    { path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: 'login', component: Login },
  { path: 'foodList', component: FoodList }
];

