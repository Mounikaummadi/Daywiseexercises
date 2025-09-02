package com.ecommerce.service;


import com.ecommerce.entity.Product;
import com.ecommerce.feign.UserService;
import com.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final UserService userService;

    public Product createProduct(Product product, String requestRole) {
        if(!requestRole.equalsIgnoreCase(   "ADMIN")){
            throw new RuntimeException("Only admin can create products");
        }
        return productRepository.save(product);
    }


    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    public void deleteProduct(Long id, String requestRole) {
        if(!requestRole.equalsIgnoreCase(   "ADMIN")){
            throw new RuntimeException("Only admin can delete products");
        }
        productRepository.deleteById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public Product updateProduct(Long id, Product updatedProduct, String requestRole) {
        // Check if requester is admin
        if (requestRole.equalsIgnoreCase("ADMIN")) {
            Product existingProduct = getProductById(id);

            if (updatedProduct.getName() != null) {
                existingProduct.setName(updatedProduct.getName());
            }
            if (updatedProduct.getDescription() != null) {
                existingProduct.setDescription(updatedProduct.getDescription());
            }
            if (updatedProduct.getPrice() != null) {
                existingProduct.setPrice(updatedProduct.getPrice());
            }
            if (updatedProduct.getCategory() != null) {
                existingProduct.setCategory(updatedProduct.getCategory());
            }
            if (updatedProduct.getProductRating() != null) {
                existingProduct.setProductRating(updatedProduct.getProductRating());
            }
            if (updatedProduct.getAvailableStock() != null) {
                existingProduct.setAvailableStock(updatedProduct.getAvailableStock());
            }
            if (updatedProduct.getImageUrl() != null) {
                existingProduct.setImageUrl(updatedProduct.getImageUrl());
            }
            if (updatedProduct.getUom() != null) {
                existingProduct.setUom(updatedProduct.getUom());
            }

            return productRepository.save(existingProduct);
        } else {
            throw new RuntimeException("Only admin can update products");
        }
    }





}
