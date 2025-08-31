package com.wipro.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
	public static int getAge(LocalDate dt) {
		int birthYear=dt.getYear();
		int currentYear=dt.now().getYear();
		int age=currentYear-birthYear;
		return age;
		
	}


	public static void main(String[] args) {
//		LocalDate date = LocalDate.of(2023,Month.NOVEMBER, 01);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		String formattedDate = date.format(formatter);
//        System.out.println(formattedDate);
//		LocalDateTime dtm1=LocalDateTime.now();
//		System.out.println(dtm1);
//		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
//		System.out.println(dtm1.format(formatter));
//		
//		
//		LocalTime dtm2=LocalTime.now();
//		System.out.println(dtm2);
		LocalDate dt = LocalDate.of(2002,Month.MAY, 03);
		System.out.println(getAge(dt));
        
	}		

}
