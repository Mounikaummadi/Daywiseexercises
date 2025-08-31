package com.wipro.anonymus;

public class GreetRunner {

	public static void main(String[] args) {
		Greet greet=()->System.out.println("Hello Lamda");
		greet.sayHello();

	}

}
