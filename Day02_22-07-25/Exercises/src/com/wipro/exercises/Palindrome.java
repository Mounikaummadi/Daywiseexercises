package com.wipro.exercises;

public class Palindrome {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("madam");
		if(str.equals(str.reverse())) {
			System.out.println("Is Palindrome");
		}
	
	}

}
