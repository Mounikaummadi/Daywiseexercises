package com.wipro.order_ms.controller;


import com.wipro.order_ms.entity.Order;
import com.wipro.order_ms.service.OrderService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping
	void save(@RequestBody Order order)
	{
		
		orderService.save(order);
		
		
	}

	@GetMapping
	List<Order> findAll()
	{
		return orderService.findAll();
	}
}