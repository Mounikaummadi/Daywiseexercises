package com.wipro.oop;

public class Hdfc implements BankOops{
	
	@Override
	
	public void deposit(double amount, String accNum) {
		System.out.println(amount+" "+accNum);
		
	}

	@Override
	public void withDraw(double amount, String accNum) {
		System.out.println(amount+" "+accNum);
		
	}

}
