import { Component } from '@angular/core';
import { Conditionalcomp } from '../conditionalcomp/conditionalcomp';

@Component({
  selector: 'app-listcomp',
  imports: [Conditionalcomp],
  templateUrl: './listcomp.html',
  styleUrl: './listcomp.css'
})
export class Listcomp {
  nameList:string[]=["Badari","Vijay","Vinay","Nitheesh","Narayana"]

}
