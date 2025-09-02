import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { IPayment } from '../ipayment';
import { PaymentService } from '../service/payment-service';

@Component({
  selector: 'app-payment',
  imports: [],
  templateUrl: './payment.html',
  styleUrl: './payment.css'
})
export class Payment {
  constructor(
    private activatedRoute: ActivatedRoute,
    private paymentService: PaymentService,
    private router: Router
  ) {}

  totalPrice: any = '';
  orderId: any = '';

  ngOnInit() {
    this.orderId = this.activatedRoute.snapshot.paramMap.get('orderId');
    const price = this.activatedRoute.snapshot.paramMap.get('totalPrice')?.toString();
    this.totalPrice = price;
  }

  async pay() {
    const payment: IPayment = {
      orderId: this.orderId,
      totalOrderPrice: this.totalPrice,
      accountNumber: '123-45-678',
      cvv: 234,
      modeOfPayment: 'card'
    };

    // // (await this.paymentService.save(payment)).subscribe(() => {
    //   this.router.navigate(['paymentsub']);
    // });
  }
}