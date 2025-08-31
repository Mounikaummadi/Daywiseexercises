package com.wipro.anonymus;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;

public class ConsumerRunner {

	public static void main(String[] args) {
//		Consumer<Integer> iseven=(n)->{
//			if(n%2==0) {
//				System.out.println(n+2);
//			}else {
//				System.out.println(n+1);
//			}
//		};
//		iseven.accept(7);
		 Consumer<ZonedDateTime> londonTime = time -> {
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
	            System.out.println("Current time in London: " + time.format(formatter));
	     };
	     ZonedDateTime londonTime1 = ZonedDateTime.now(ZoneId.of("Europe/London"));
	     londonTime.accept(londonTime1);

	}

}
