import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Secondcomp } from './app/secondcomp/secondcomp';
import { Logincomp } from './app/logincomp/logincomp';

bootstrapApplication(Logincomp, appConfig)
  .catch((err) => console.error(err));
