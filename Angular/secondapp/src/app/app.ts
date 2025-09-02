import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { Listcomp } from './listcomp/listcomp';
import { Dropdowncomp } from './dropdowncomp/dropdowncomp';
import { Home } from './home/home';

@Component({
  selector: 'app-home',
  imports: [Home,FormsModule],
  templateUrl:'./app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('secondapp');
  name:string="Badarinath";
   greet(){
    console.log(`Hello ${this.name} Welcome to Angular`);
  }
}
