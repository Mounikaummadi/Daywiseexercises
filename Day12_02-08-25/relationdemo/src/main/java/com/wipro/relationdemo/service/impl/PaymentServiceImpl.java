package com.wipro.relationdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.relationdemo.entity.Payment;
import com.wipro.relationdemo.repo.PaymentRepository;
import com.wipro.relationdemo.service.PaymentService;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository repository;

    @Override
    public Payment savePayment(Payment payment) {
        return repository.save(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return repository.findAll();
    }

    @Override
    public Optional<Payment> getPaymentById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Payment updatePayment(Long id, Payment updatedPayment) {
        return repository.findById(id).map(payment -> {
            payment.setPaymentMode(updatedPayment.getPaymentMode());
            payment.setAmount(updatedPayment.getAmount());
            payment.setDescription(updatedPayment.getDescription());
            return repository.save(payment);
        }).orElseThrow(() -> new RuntimeException("Payment not found"));
    }

    @Override
    public void deletePayment(Long id) {
        repository.deleteById(id);
    }
}
