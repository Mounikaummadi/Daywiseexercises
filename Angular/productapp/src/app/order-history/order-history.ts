import { Component, OnInit } from '@angular/core';
import { Iorder } from '../iorder';
import { Product } from '../product';

@Component({
  selector: 'app-order-history',
  imports: [],
  templateUrl: './order-history.html',
  styleUrl: './order-history.css'
})
export class OrderHistory implements OnInit {
   orders: Iorder[] = [];
  constructor(private productService: Product) {}
  ngOnInit() {
    this.productService.getOrders().subscribe(data => this.orders = data);
  }
}

