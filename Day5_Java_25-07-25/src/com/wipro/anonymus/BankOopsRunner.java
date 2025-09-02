package com.wipro.anonymus;

public class BankOopsRunner {

	public static void main(String[] args) {
		BankOops savingsAc=new BankOops() {

			@Override
			public void deposit(double amount) {
				System.out.println("Your savings"+amount);
				
			}
		};
		savingsAc.deposit(2000);
		BankOops currentAc=new BankOops() {
			public void deposit(double amount) {
				System.out.println("Your currentAc Balance"+amount);
			}

		};
		currentAc.deposit(2000);
		

	}
}
