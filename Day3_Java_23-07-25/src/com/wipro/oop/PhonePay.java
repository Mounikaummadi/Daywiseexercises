package com.wipro.oop;

public class PhonePay implements PaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println(amount+" Payment Successfully Done using Phonepay");
	}

}
