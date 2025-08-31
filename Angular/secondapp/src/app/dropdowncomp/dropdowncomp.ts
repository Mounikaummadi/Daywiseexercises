
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Searchcomp } from '../searchcomp/searchcomp';

@Component({
  selector: 'app-dropdowncomp',
  imports: [FormsModule,Searchcomp],
  templateUrl: './dropdowncomp.html',
  styleUrl: './dropdowncomp.css'
})
export class Dropdowncomp {
  color:string="default";
}
