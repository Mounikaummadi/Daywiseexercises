import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-reactive1',
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './reactive1.html',
  styleUrl: './reactive1.css'
})
export class Reactive1 {
  textCtrl = new FormControl('', { nonNullable: true });

  get reversed(): string {
    const v = this.textCtrl.value ?? '';
    return v.split('').reverse().join('');
  }

}
