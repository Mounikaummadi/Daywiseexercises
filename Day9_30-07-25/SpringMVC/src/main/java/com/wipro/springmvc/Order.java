package com.wipro.springmvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Order {
	@GetMapping("/order")
	String showOrderList(Model model)
	{
		return "orderlist";
		
	}

}
