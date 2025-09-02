package com.wipro.orders.service;

import java.util.List;

import com.wipro.orders.dto.Payment;
import com.wipro.orders.entity.OrderEntity;

 

public interface OrderService {
	List<OrderEntity> findAll();
	OrderEntity findById(int id);
	OrderEntity save(OrderEntity orderEntity,String token);
	void deleteById(int id);
	void pay(Payment payment);
}