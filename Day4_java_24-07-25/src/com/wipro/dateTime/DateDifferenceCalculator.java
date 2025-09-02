package com.wipro.dateTime;

import java.time.LocalDate;

public class DateDifferenceCalculator {
	public static int  getDateDifference(LocalDate startDate,LocalDate endDate) {
		int years=startDate.getYear()-endDate.getYear();
		int month=startDate.getMonthValue()-endDate.getMonthValue();
		int day=startDate.getDayOfMonth()-endDate.getDayOfMonth();
		int diff=;
		return diff; 
	}

	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2020, 5, 15);
        LocalDate endDate = LocalDate.of(2024, 7, 24);
        System.out.println(getDateDifference(startDate,endDate));

	}

}
