import { Component, OnInit } from '@angular/core';
import { Iproduct } from '../iproduct';
import { Product } from '../product';
import { Router, RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-productlist',
  standalone: true,
  imports: [RouterLink,CommonModule,FormsModule],
  templateUrl: './productlist.html',
  styleUrl: './productlist.css'
})
export class Productlist implements OnInit{
  constructor(private productService:Product,private router:Router) { }

  products: Iproduct[] = [];


  ngOnInit() {
    this.productService.getProducts().subscribe({
      next: (data) => this.products = data,
      error: (err) => console.error('Error fetching products:', err)
    });

}

  addProduct() {
    this.router.navigate(['/productadd']);
    // Logic to navigate to the user add page
  }
}

