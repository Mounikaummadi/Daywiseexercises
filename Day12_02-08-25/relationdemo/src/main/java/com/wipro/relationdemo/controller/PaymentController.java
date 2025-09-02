package com.wipro.relationdemo.controller;


import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.wipro.relationdemo.entity.Payment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private Map<Long, Payment> paymentRepo = new HashMap<>();

    // POST: Create Payment
    @PostMapping
    public ResponseEntity<String> createPayment(@RequestBody Payment payment) {
        paymentRepo.put(payment.getId(), payment);

        HttpHeaders headers = new HttpHeaders();
        headers.add("created-at", LocalDate.now().toString());

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .headers(headers)
                .body("Data Saved Successfully");
    }

    // PUT: Update Payment
    @PutMapping("/{id}")
    public ResponseEntity<String> updatePayment(@PathVariable Long id, @RequestBody Payment payment) {
        if (paymentRepo.containsKey(id)) {
            paymentRepo.put(id, payment);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Data Modified Successfully");
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Payment Not Found");
        }
    }

    // DELETE: Delete Payment
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePayment(@PathVariable Long id) {
        if (paymentRepo.containsKey(id)) {
            paymentRepo.remove(id);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Data Deleted Successfully");
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Payment Not Found");
        }
    }

    // GET: Find Payment by ID
    @GetMapping("/{id}")
    public ResponseEntity<Object> getPaymentById(@PathVariable Long id) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("search-time", LocalDateTime.now().toString());

        Payment payment = paymentRepo.get(id);
        if (payment != null) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .headers(headers)
                    .body(payment);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body("Payment Not Found");
        }
    }

    // GET: Find All Payments
    @GetMapping
    public ResponseEntity<Object> getAllPayments() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("search-time", LocalDateTime.now().toString());

        List<Payment> payments = new ArrayList<>(paymentRepo.values());
        if (!payments.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .headers(headers)
                    .body(payments);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .headers(headers)
                    .body("No Payments Found");
        }
    }
}
