package com.wipro.anonymus;

public class MultiplyRunner {

	public static void main(String[] args) {
		Multiply multiplynums=(a,b)->{return a*b;};
		int x=multiplynums.multiply(2, 3);
		System.out.println(x);
	}
}
