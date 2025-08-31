package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FoodItemRunner {

	public static void main(String[] args) {
		 List<FoodItem> menu = Arrays.asList(
		            new FoodItem("Spring Rolls", "Veg", "Chinese", 150),
		            new FoodItem("Chicken Manchurian", "Non Veg", "Chinese", 200),
		            new FoodItem("Pad Thai", "Non Veg", "Thai", 220),
		            new FoodItem("Veg Hakka Noodles", "Veg", "Chinese", 180));
		 List<FoodItem> chineseFood=menu.stream()
				 .filter(item->item.getVegCuisine().equalsIgnoreCase("Chinese")&&item.getPrice())
				 .reduce(a1,a2) -> a1.getPrice()>a2.getPrice()?a1:a2;
//				 .collect(Collectors.toList());
		 System.out.println(chineseFood);


	}

}
