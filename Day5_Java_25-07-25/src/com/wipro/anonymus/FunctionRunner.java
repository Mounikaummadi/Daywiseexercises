package com.wipro.anonymus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionRunner {

	public static void main(String[] args) {
//		Function<Double, Double> fraction = (n) -> n - Math.floor(n);
//        System.out.println(fraction.apply(123.45));
		List<String> str=Arrays.asList("Badari","Niteesh","Narayana");
		 Function<List<String>, List<Integer>> count = list -> {
	            List<Integer> lengths = new ArrayList<>();
	            for (String i : list) {
	                lengths.add(i.length());
	            }
	            return lengths;
	        };

	        List<Integer> result = count.apply(str);
	        System.out.println(result);
	    }

	

}
