package com.wipro.oop;

public class BankOopsRunner {

	public static void main(String[] args) {
		Hdfc hdfc=new Hdfc();
		hdfc.deposit(3000,"37108");
		hdfc.withDraw(1500,"37108");
		CitiBank citiBank=new CitiBank();
		citiBank.deposit(5000,"37108143");
		citiBank.withDraw(1000,"37108143");
		

	}

}
