import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, ReactiveFormsModule } from '@angular/forms';
import { MatStepperModule } from '@angular/material/stepper';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { CommonModule } from '@angular/common';
import { Reactive1 } from './reactive1/reactive1';
import { Reactive2 } from './reactive2/reactive2';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [Reactive2,
    ReactiveFormsModule,
    MatStepperModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,CommonModule
  ],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class App implements OnInit {
  nameForm: any;
  ageForm: any;
  emailForm: any;

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {
    this.nameForm = this.fb.group({
      name: ['', Validators.required],
    });

    this.ageForm = this.fb.group({
      age: ['', [Validators.required, Validators.min(1)]],
    });

    this.emailForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]],
    });
  }

  onSubmit() {
    console.log({
      name: this.nameForm.value.name,
      age: this.ageForm.value.age,
      email: this.emailForm.value.email
    });
    alert('Form submitted successfully!');
  }
}
