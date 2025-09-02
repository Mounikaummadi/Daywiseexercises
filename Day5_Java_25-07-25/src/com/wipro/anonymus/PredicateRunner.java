package com.wipro.anonymus;

import java.util.function.Predicate;

public class PredicateRunner {

	public static void main(String[] args) {
//		Predicate<String> p=(s)->{
//			return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
//		};
//		System.out.println(p.test("Madam"));
		Predicate<String> op=(str)->{if(str.equals(str.toUpperCase()))? return true:return false;};
	}
	

}
