package com.wipro.order_ms.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentFeignConfig {

    @Bean(name = "paymentRequestInterceptor")
    public RequestInterceptor paymentRequestInterceptor() {
        return template -> {
            template.header("Content-Type", "application/json");
        };
    }
}