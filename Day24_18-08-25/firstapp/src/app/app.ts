import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
// import { Secondcomp } from './secondcomp/secondcomp';
import { Logincomp } from './logincomp/logincomp';

@Component({
  selector: 'app-logincomp',
  imports: [Logincomp],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('firstapp');
}
