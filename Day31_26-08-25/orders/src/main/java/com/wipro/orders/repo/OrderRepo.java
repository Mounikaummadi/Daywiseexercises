package com.wipro.orders.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.orders.entity.OrderEntity;

 

@Repository
public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {

}