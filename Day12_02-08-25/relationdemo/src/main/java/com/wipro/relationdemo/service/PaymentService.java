package com.wipro.relationdemo.service;


import java.util.List;
import java.util.Optional;

import com.wipro.relationdemo.entity.Payment;

public interface PaymentService {

    Payment savePayment(Payment payment);

    List<Payment> getAllPayments();

    Optional<Payment> getPaymentById(Long id);

    Payment updatePayment(Long id, Payment updatedPayment);

    void deletePayment(Long id);
}
