package com.wipro.productmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import com.wipro.productmgmt.entity.ProductDetails;
import com.wipro.productmgmt.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductManagementController {

    @Autowired
    private ProductService productService;

    // Create
    @PostMapping
    public void save(@RequestBody ProductDetails productDetails) {
        productService.save(productDetails);
    }

    // Read all
    @GetMapping
    public List<ProductDetails> findAll() {
        return productService.findAll();
    }

    // Read by ID
    @GetMapping("/{id}")
    public ProductDetails findById(@PathVariable int id) {
        return productService.findById(id);
    }

    // Update
    @PutMapping
    public void update(@RequestBody ProductDetails productDetails) {
        productService.save(productDetails);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        productService.deleteById(id);
    }

    // Find by productName using query param
    @GetMapping("/productMake")
    public List<ProductDetails> findByProductName(@RequestParam String productName) {
        return productService.findByProductNameOrderByProductNameDesc(productName);
    }

    // Find by productName using path variable
    @GetMapping("/namepath/{productName}")
    public List<ProductDetails> findByProductNamePath(@PathVariable String productName) {
        return productService.findByProductNameOrderByProductNameDesc(productName);
    }

    // Find by productName and productMake
    @GetMapping("/namepath/{productName}/{productMake}")
    public List<ProductDetails> findByProductNameAndProductMake(@PathVariable String productName, @PathVariable String productMake) {
        return productService.findByProductNameAndProductMakeOrderByProductNameDesc(productName, productMake);
    }

    // Pagination and sorting by productPrice
    @GetMapping("/page/{pageNum}/{pageSize}/{sortOrder}")
    public Page<ProductDetails> findAllPage(@PathVariable int pageNum,
                                            @PathVariable int pageSize,
                                            @PathVariable int sortOrder) {
        Pageable p;
        if (sortOrder == 0) {
            p = PageRequest.of(pageNum, pageSize, Sort.by("productPrice").descending());
        } else {
            p = PageRequest.of(pageNum, pageSize, Sort.by("productPrice").ascending());
        }
        return productService.findAll(p);
    }
}
