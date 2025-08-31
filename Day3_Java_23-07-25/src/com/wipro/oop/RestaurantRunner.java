package com.wipro.oop;


public class RestaurantRunner {

	public static void main(String[] args) {
		Restaurant restaurant=new Restaurant("BabaiHotel","1-Ab");
		System.out.print(restaurant.getRestuarantId()+" ");
		System.out.println(restaurant.getRestuarantName());
		

	}

}
