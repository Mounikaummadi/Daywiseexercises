package com.wipro.orders.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.orders.entity.OrderEntity;
import com.wipro.orders.entity.OrderMaster;

 

@Repository
public interface OrderMasterRepo extends JpaRepository<OrderMaster, Integer> {

}