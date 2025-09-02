package com.wipro.stream;

public class FoodItem {
	String foodName;
	String foodType;
	String vegCuisine;
	double price;
	public FoodItem(String foodName, String foodType, String vegCuisine, double price) {
		this.foodName=foodName;
		this.foodType=foodType;
		this.vegCuisine=vegCuisine;
		this.price=price;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getVegCuisine() {
		return vegCuisine;
	}
	public void setVegCuisine(String vegCuisine) {
		this.vegCuisine = vegCuisine;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodItem [foodName=" + foodName + ", foodType=" + foodType + ", vegCuisine=" + vegCuisine + ", price="
				+ price + "]";
	}
}
 