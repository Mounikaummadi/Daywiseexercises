package com.wipro.oop;

public class PaymentMethodRunner {

	public static void main(String[] args) {
		PaymentMethod gPay=new Gpay();
		gPay.pay(2000);
		gPay=new PhonePay();
		gPay.pay(3000);

	}

}
