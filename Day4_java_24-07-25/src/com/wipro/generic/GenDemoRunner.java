package com.wipro.generic;

public class GenDemoRunner {

	public static void main(String[] args) {
		GenDemo<Integer> demo=new GenDemo(1);
		System.out.println(demo);
		GenDemo<String> demo1=new GenDemo("2");
		System.out.println(demo1);
		

	}

}
