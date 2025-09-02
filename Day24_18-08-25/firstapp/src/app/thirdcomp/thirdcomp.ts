import { Component } from '@angular/core';

@Component({
  selector: 'app-thirdcomp',
  imports: [],
  template: `<marquee behavior="scroll" direction="left" scrollamount="5">
      Third component
    </marquee>`,
  styleUrl: './thirdcomp.css'
})
export class Thirdcomp {

}
