import { Component } from '@angular/core';

import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { Iproduct } from '../iproduct';
import { Product } from '../product';

@Component({
  selector: 'app-purchase',
  imports: [FormsModule],
  templateUrl: './ordercomp.html',
  styleUrl: './ordercomp.css'
})
export class Ordercomp {
  // Ex3
  products: Iproduct[] = [];
  selectedId?: number;
  purchaseQty = 1;
  error = '';

  constructor(private productService: Product, private router: Router) {}

  ngOnInit() {
    this.productService.getProducts().subscribe(data => this.products = data);
  }

valid() {
  const id = Number(this.selectedId); 
  const p = this.products.find(prod => prod.id === this.selectedId);
  console.log('Selected product:', p);
  console.log('Qty entered:', this.purchaseQty);
  if (!p) return false;
  return this.purchaseQty > 0 && this.purchaseQty <= p.qty;
}

  placeOrder() {
    if (!this.valid()) {
      this.error = 'Invalid quantity';
      return;
    }
    this.productService.purchase({
      productId: this.selectedId!,
      quantity: this.purchaseQty
    }).subscribe({
      next: () => this.router.navigate(['/orders']),
      error: err => this.error = err.error || 'Purchase failed'
    });
  }
}