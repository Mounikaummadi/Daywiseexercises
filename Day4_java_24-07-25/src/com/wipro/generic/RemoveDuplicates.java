package com.wipro.generic;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		Set<Integer> set=new HashSet<>();
		set.addAll(list);
		System.out.println(set);

	}

}
