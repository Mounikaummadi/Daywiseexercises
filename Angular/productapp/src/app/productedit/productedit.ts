import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';


import { Iproduct } from '../iproduct';
import { Product } from '../product';

@Component({
  selector: 'app-productedit',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './productedit.html',
  styleUrl: './productedit.css'
})
export class Productedit implements OnInit {

  constructor(
    private activatedRoute: ActivatedRoute,
    private productService: Product,
    private router: Router
  ) {}

  id: string | null = null;
  products: Iproduct = { name: '', category: '', price: 0, qty:0};

  ngOnInit(): void {
    this.id = this.activatedRoute.snapshot.paramMap.get('id');
    if (this.id) {
      this.productService.findProduct(this.id).subscribe({
        next: (product) => this.products = product,
        error: (err) => console.error('Error loading product:', err)
      });
    }
  }

  save() {
    this.products.price = Number(this.products.price);
    this.productService.updateProduct(this.products).subscribe({
      next: () => this.router.navigate(['/productlist']),
      error: (err) => console.error('Error saving product:', err)
    });
  }
}