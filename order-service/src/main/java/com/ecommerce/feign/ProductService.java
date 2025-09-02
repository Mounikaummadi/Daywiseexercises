package com.ecommerce.feign;


import com.ecommerce.Dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "product-service", url = "http://localhost:8082")
public interface ProductService {

    @GetMapping("/api/products/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id,
                                                     @RequestHeader("Authorization") String authHeader);
}
