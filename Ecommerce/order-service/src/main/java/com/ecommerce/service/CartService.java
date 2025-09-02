package com.ecommerce.service;

import com.ecommerce.Dto.ProductDto;
import com.ecommerce.entity.Cart;
import com.ecommerce.feign.ProductService;
import com.ecommerce.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartRepository cartRepository;
    private final ProductService productService;

    public Cart addProductToCart(Cart cart, Long userId, Long productId, Long quantity, String authHeader) {
        ResponseEntity<ProductDto> productDtoResponse=productService.getProductById(productId,authHeader);
        ProductDto productDto=productDtoResponse.getBody();

        if(productDto==null){
            throw new RuntimeException("Product not found");
        }
        if(productDto.getAvailableStock()<quantity){
            throw new RuntimeException("Requested quantity not available");
        }

        Cart existingCart = new Cart();
        existingCart.setUserId(userId);
        existingCart.setProductId(productId);
        existingCart.setQuantity(quantity);
        existingCart.setTotalPrice(productDto.getPrice() * quantity);
        return cartRepository.save(existingCart);
    }

    public Cart getCartByUserId(Long userId) {
        return cartRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Cart not found for user id: " + userId));
    }

    public void clearCart(Long userId) {
        Cart cart = getCartByUserId(userId);
        cartRepository.delete(cart);
    }

    public Cart uupdateCart(Long id, Long quantity, String authHeader) {
        Cart existingCart = cartRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cart not found with id: " + id));

        ResponseEntity<ProductDto> productDtoResponse=productService.getProductById(existingCart.getProductId(),authHeader);
        ProductDto productDto=productDtoResponse.getBody();

        if(productDto==null){
            throw new RuntimeException("Product not found");
        }
        if(productDto.getAvailableStock()<quantity){
            throw new RuntimeException("Requested quantity not available");
        }

        existingCart.setQuantity(quantity);
        existingCart.setTotalPrice(productDto.getPrice() * quantity);
        return cartRepository.save(existingCart);
    }

    public List<Cart> getCartByUser(Long userId) {
        return Collections.singletonList(cartRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Cart not found for user id: " + userId)));
    }

}
