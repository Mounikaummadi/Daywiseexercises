package com.ecommerce.controller;

import com.ecommerce.Dto.UserDto;
import com.ecommerce.entity.Product;
import com.ecommerce.feign.UserService;
import com.ecommerce.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;
    private final UserService userService;



    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product,
                                                 @RequestHeader("Authorization") String authHeader) {
        String role =authHeader.substring(7).trim();
        ResponseEntity<UserDto> userDtoResponse = userService.getUserProfile("Bearer " + role);
        UserDto userDto = userDtoResponse.getBody();
        if (userDto == null){
            throw new RuntimeException("User not found");
        }
        return ResponseEntity.ok(productService.createProduct(product, String.valueOf(userDto.getRole())));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id,
                                                  @RequestHeader("Authorization") String authHeader) {
        String role =authHeader.substring(7).trim();
        UserDto userDto = userService.getUserProfile("Bearer " + role).getBody();
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id,
                                             @RequestHeader("Authorization") String authHeader) {
        String role =authHeader.substring(7).trim();
        ResponseEntity<UserDto> userDtoResponse = userService.getUserProfile("Bearer " +
                role);
        UserDto userDto = userDtoResponse.getBody();
        if (userDto == null){
            throw new RuntimeException("User not found");
        }
        productService.deleteProduct(id, String.valueOf(userDto.getRole()));
        return ResponseEntity.ok("Product deleted successfully");
    }

    @GetMapping("")
    public ResponseEntity<?> getAllProducts(@RequestHeader("Authorization") String authHeader) {
        String role =authHeader.substring(7).trim();
        UserDto userDto = userService.getUserProfile("Bearer " + role).getBody();
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<?> getProductsByCategory(@PathVariable String category,
                                                   @RequestHeader("Authorization") String authHeader)  {
        String role =authHeader.substring(7).trim();
        UserDto userDto = userService.getUserProfile("Bearer " + role).getBody();
        return ResponseEntity.ok(productService.getProductsByCategory(category));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id,
                                                 @RequestBody Product updatedProduct,
                                                 @RequestHeader("Authorization") String authHeader) {
        String role =authHeader.substring(7).trim();
        ResponseEntity<UserDto> userDtoResponse = userService.getUserProfile("Bearer " +
                role);
        UserDto userDto = userDtoResponse.getBody();
        if (userDto == null){
            throw new RuntimeException("User not found");
        }
        return ResponseEntity.ok(productService.updateProduct(id, updatedProduct, String.valueOf(userDto.getRole())));
    }
}
