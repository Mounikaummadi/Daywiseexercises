import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-conditionalcomp',
  
  imports: [CommonModule],
  templateUrl: './conditionalcomp.html',
  styleUrl: './conditionalcomp.css'
})
export class Conditionalcomp {
  showMsg:boolean=false;
  toggle(){
    this.showMsg=!this.showMsg
  }
  allCountries: string[] = ['India', 'USA', 'Germany', 'Japan', 'Australia', 'Brazil'];
  loadedCountries: string[] = [];

  loadCountries(){
    this.loadedCountries = [...this.allCountries];
  }

}
