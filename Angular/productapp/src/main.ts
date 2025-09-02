import { bootstrapApplication } from '@angular/platform-browser';
// import { appConfig } from './app/app.config';

import { provideRouter } from '@angular/router';
import { provideHttpClient } from '@angular/common/http';
import { routes } from './app/app.routes';
import { App } from './app/app';
import 'zone.js';
bootstrapApplication(App, {
  // Ex1
  providers: [
    provideRouter(routes),
    provideHttpClient()
  ]
});