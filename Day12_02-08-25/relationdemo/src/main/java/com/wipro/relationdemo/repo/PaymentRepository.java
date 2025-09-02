package com.wipro.relationdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.relationdemo.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
