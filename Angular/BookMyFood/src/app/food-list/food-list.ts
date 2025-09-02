import { ChangeDetectorRef, Component } from '@angular/core';
import { FoodService } from '../service/food-service';
import { IFood } from '../ifood';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import { OrderService } from '../service/order-service';
import { IOrder } from '../iorder';


@Component({
  selector: 'app-food-list',
  imports: [CommonModule],
  templateUrl: './food-list.html',
  styleUrl: './food-list.css'
})
export class FoodList {
  foodList: IFood[] = [];
  quantity: number = 1;          
  foodMap: Map<number, number> = new Map();

  constructor(
    private foodService: FoodService,
    private cdr: ChangeDetectorRef,
    private router: Router,
    private orderService: OrderService
  ) {}

  ngOnInit() {
    const tokendata: any = localStorage.getItem('token');

    this.foodService.getAllFoods().subscribe((data) => {
      this.foodList = data;
      this.foodList.forEach((f) => this.foodMap.set(f.id!, 0));
      this.cdr.markForCheck();
    });
  }

  async save(foodId: number) {
    const orderData: IOrder = {
      foodId: foodId,           
      quantity: this.quantity
    };

    (await this.orderService.save(orderData)).subscribe((result: IOrder) => {
      // assumes backend returns id + totalOrderPrice like before
      this.router.navigate(['/payment/' + result.id + '/' + result.totalOrderPrice]);
    });
  }

  changeTicketNumber(foodId: number) {
    this.foodMap.set(foodId, this.quantity);
  }
}