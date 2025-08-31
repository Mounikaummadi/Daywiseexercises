import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-searchcomp',
  imports: [FormsModule],
  templateUrl: './searchcomp.html',
  styleUrl: './searchcomp.css'
})
export class Searchcomp {
  searchText: string = '';
  names:string[]=["Badari","Nitheesh","Narayana","Arjun"];
  get filteredNames(): string[] {
    const query = this.searchText.toLowerCase();
    return this.names.filter(name => name.toLowerCase().startsWith(query));
  }


}
