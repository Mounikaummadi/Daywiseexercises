package com.ecommerce.controller;

import com.ecommerce.entity.Cart;
import com.ecommerce.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @PostMapping("/addProd")
    public ResponseEntity<Cart> addProductToCart(@RequestParam Long userId,
                                                 @RequestParam Long productId,
                                                 @RequestParam Long quantity,
                                                 @RequestHeader("Authorization") String authHeader) {
        Cart cart = new Cart();
        Cart savedCart = cartService.addProductToCart(cart, userId, productId, quantity, authHeader);
        return ResponseEntity.ok(savedCart);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Cart>> getCartByUser(@PathVariable Long userId,
                                                    @RequestHeader("Authorization") String authHeader) {
        List<Cart> cartList = cartService.getCartByUser(userId);
        return ResponseEntity.ok(cartList);
    }


    @DeleteMapping("/clear/{userId}")
    public ResponseEntity<String> clearCart(@PathVariable Long userId,
                                            @RequestHeader("Authorization") String authHeader) {
        cartService.clearCart(userId);
        return ResponseEntity.ok("Cart cleared successfully for userId: " + userId);
    }

    @PutMapping("/update")
    public ResponseEntity<Cart> updateCart(@RequestParam Long cartId,
                                           @RequestParam Long quantity,
                                           @RequestHeader("Authorization") String authHeader) {
        Cart updatedCart = cartService.uupdateCart(cartId, quantity, authHeader);
        return ResponseEntity.ok(updatedCart);
    }


}
