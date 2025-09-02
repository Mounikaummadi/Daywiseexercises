package com.wipro.oop;

public class Gpay implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println(amount+" Payment Successfully Done using Gpay");

	}

}
