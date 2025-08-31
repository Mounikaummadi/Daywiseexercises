package com.wipro.exercises;

public class EnumDemo {

	public static void main(String[] args) {
		enum Day {
			JANUARY,
			FEBRUARY,
			MARCH,
			APRIL,
			MAY,
			JUNE,
			JULY,
			AUGUST,
			SEPTEMBER,
			NOVEMBER,
			DECEMBER
		}
		String month="FEBRUARY";
		
//		Day day=Day.Mon;
//		if(day==Day.Mon)
//		{
//			System.out.println("Monday");
//		}
		Day day=Day.FEBRUARY;
		if(month==Day.FEBRUARY)
		{
			System.out.println("Month is FEBRUARY");
		}
		
	}

}
