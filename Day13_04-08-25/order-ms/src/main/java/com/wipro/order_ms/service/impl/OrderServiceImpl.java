package com.wipro.order_ms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.wipro.order_ms.dto.Payment;
import com.wipro.order_ms.entity.Order;
import com.wipro.order_ms.repo.OrderRepo;
import com.wipro.order_ms.service.OrderService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import com.wipro.order_ms.client.PaymentConnectService;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private PaymentConnectService paymentConnectService;

    @Override
    @CircuitBreaker(name = "order-cb", fallbackMethod = "handleFallBack")
    public void save(Order order) {
        order.setOrderStatus("I");
        orderRepo.save(order);

        Payment payment = new Payment();
        payment.setOrderId(order.getId());
        payment.setPaymentAmount(order.getOrderValue());
        payment.setPaymentStatus(true);

        ResponseEntity<Payment> response = paymentConnectService.savePaymentData(payment);

        if (response.getStatusCode().is2xxSuccessful()) {
            order.setOrderStatus("P");
        } else {
            order.setOrderStatus("C");
        }

        orderRepo.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    public String handleFallBack(Order order, Throwable t) {
        System.out.println("--System is down--");
        order.setOrderStatus("C");
        orderRepo.save(order);
        return "System is down";
    }
}