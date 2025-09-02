package com.ecommerce.controller;


import com.ecommerce.Dto.UserDto;
import com.ecommerce.entity.Cart;
import com.ecommerce.entity.Order;
import com.ecommerce.feign.UserService;
import com.ecommerce.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {


    private  final OrderService orderService;
    private final UserService userService;

    // 1. Create order
    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(@RequestBody Cart cart,
                                             @RequestHeader("Authorization") String authHeader) {
        String token = authHeader.substring(7).trim();
        Order order = orderService.createOrder(cart, authHeader);
        return ResponseEntity.ok(order);
    }

    // 2. Cancel order
    @PutMapping("/{orderId}")
    public ResponseEntity<Order> cancelOrder(@PathVariable Long orderId,
                                             @RequestHeader("Authorization") String authHeader) {
        String token = authHeader.substring(7).trim();
        Order order = orderService.cancelOrder(orderId, authHeader);
        return ResponseEntity.ok(order);
    }

    // 4. Get all orders (Admin only)
    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders(@RequestHeader("Authorization") String authHeader) {
        String token = authHeader.substring(7).trim();
        List<Order> orders = orderService.getAllOrders(authHeader);
        return ResponseEntity.ok(orders);
    }

    // 5. Get orders for a user
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Order>> getOrdersByUser(@PathVariable Long userId,
                                                       @RequestHeader("Authorization") String authHeader) {
        String token = authHeader.substring(7).trim();
        List<Order> orders = orderService.getOrdersByUserId(userId, authHeader);
        return ResponseEntity.ok(orders);
    }

    // 6. Order details
    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long orderId,
                                              @RequestHeader("Authorization") String authHeader) {
        String token = authHeader.substring(7).trim();
        Order order = orderService.getOrderById(orderId, authHeader);
        return ResponseEntity.ok(order);
    }

}
