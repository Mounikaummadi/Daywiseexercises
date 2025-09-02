package com.wipro.anonymus;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierRunner {

	public static void main(String[] args) {
		Supplier<String> nxtday=()->{return LocalDate.now().plusDays(1).getDayOfWeek().toString();};
		System.out.println(nxtday.get());
	}
	

}
