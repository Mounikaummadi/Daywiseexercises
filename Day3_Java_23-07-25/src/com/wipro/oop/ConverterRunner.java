package com.wipro.oop;

public class ConverterRunner {

	public static void main(String[] args) {
		Converter converter=new Converter();
		System.out.println(converter.convert(1));
		System.out.println(converter.convert(1,2));
		System.out.println(converter.convert(2));
	}

}
