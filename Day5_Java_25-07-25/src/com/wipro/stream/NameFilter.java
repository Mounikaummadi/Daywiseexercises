package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameFilter {

	public static void main(String[] args) {
//        List<String> names = Arrays.asList("Narayana","Basheer","Badari");
//        List<String> filteredNames = names.stream()
//            .filter(name -> name.toLowerCase().contains("ba"))
//            .collect(Collectors.toList());
//
//        System.out.println("Names with 'ba' consecutively: " + filteredNames);
		List<Integer> list=Arrays.asList(1,2,3,4);
		double sum =list.stream()
                .reduce(0, (a, b) -> a + b); 
		long count =list.stream().count();
		double average = count > 0 ? (double) sum / count : 0.0;
		System.out.println("Average: " + average);


	}

}
