import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { Product } from '../product';


@Component({
  selector: 'app-productadd',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './productadd.html',
  styleUrl: './productadd.css'
})
export class Productadd {

  constructor(private productService: Product, private router: Router) {}

  name = '';
  category = '';
  price: number | null = null;
  qty:number |null=null;

  submit() {
    if (!this.name || !this.category || this.price === null) return;

    this.productService.addProduct({
      name: this.name,
      category: this.category,
      price: Number(this.price),
      qty:Number(this.qty)

    }).subscribe({
      next: () => {
        this.name = '';
        this.category = '';
        this.price = null;
        this.qty=null;
        this.router.navigate(['/productlist']);
      },
      error: (err) => console.error('Error adding product:', err)
    });
  }
}