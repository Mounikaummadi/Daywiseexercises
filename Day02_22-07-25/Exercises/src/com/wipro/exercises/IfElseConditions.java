package com.wipro.exercises;

public class IfElseConditions {

	public static void main(String[] args) {
		char shape='R';
//		if(shape=='R') {
//			System.out.println("Rectangle");
//		}else if(shape=='C') {
//			System.out.println("Circle");
//		}else if(shape=='C') {
//			System.out.println("Square");
//		}else{
//			System.out.println("UnKnown");
//		}
		switch(shape) {
		case 'R':System.out.println("Rectangle");
				break;
		case 'C':System.out.println("Circle");
				break;		
		case 'S':System.out.println("Square");
				break;
		default:System.out.println("Unknown");
		}
	}

}
