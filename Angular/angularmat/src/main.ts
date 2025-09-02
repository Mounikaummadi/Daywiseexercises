import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { provideAnimations } from '@angular/platform-browser/animations';
import { importProvidersFrom } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { MatStepperModule } from '@angular/material/stepper';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import 'zone.js'; 
bootstrapApplication(App, {
  providers: [
    
    importProvidersFrom(
      ReactiveFormsModule,
      MatStepperModule,
      MatFormFieldModule,
      MatInputModule,
      MatButtonModule
    ),
  ],
});