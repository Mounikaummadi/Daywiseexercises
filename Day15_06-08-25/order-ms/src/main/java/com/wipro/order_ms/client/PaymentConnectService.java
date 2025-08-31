package com.wipro.order_ms.client;

import com.wipro.order_ms.dto.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.wipro.order_ms.config.PaymentFeignConfig;

@FeignClient(name = "payment", configuration = PaymentFeignConfig.class)
public interface PaymentConnectService {

    @PostMapping("/payment")
    ResponseEntity<Payment> savePaymentData(@RequestBody Payment payment);
}