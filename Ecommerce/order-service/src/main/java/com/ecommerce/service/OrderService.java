package com.ecommerce.service;

import com.ecommerce.Dto.ProductDto;
import com.ecommerce.entity.Cart;
import com.ecommerce.entity.Order;
import com.ecommerce.feign.ProductService;
import com.ecommerce.repository.CartRepository;
import com.ecommerce.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final CartRepository cartRepository;
    private final ProductService productService;

    public Order createOrder(Cart cart,String authHeader){
        ResponseEntity<ProductDto> productResponse = productService.getProductById(cart.getProductId(),authHeader);
        double price=0;

        Order order= new Order();
        order.setUserId(cart.getUserId());
        order.setProductId(cart.getProductId());
        order.setPrice(price* cart.getQuantity());
        order.setOrderStatus("PLACED");
        order.setOrderDate(LocalDateTime.now());

        return orderRepository.save(order);
    }

    public Order cancelOrder(Long orderId,String authHeader){
        Order order= orderRepository.findById(orderId)
                .orElseThrow(()-> new RuntimeException("Order not found"));
        order.setOrderStatus("CANCELLED");
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders(String authHeader){
        return orderRepository.findAll();
    }

    public List<Order> getOrdersByUserId(Long userId,String authHeader){
        return orderRepository.findByUserId(userId);
    }

    public Order getOrderById(Long orderId,String authHeader){
        return orderRepository.findById(orderId)
                .orElseThrow(()-> new RuntimeException("Order not found"));
    }
}
