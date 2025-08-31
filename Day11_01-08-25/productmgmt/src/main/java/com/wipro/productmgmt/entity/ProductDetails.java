package com.wipro.productmgmt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductDetails {

    @Id
    private Integer productId;
    private String productName;
    private String productMake;
    private Double productPrice;

    // Getters and Setters
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMake() {
        return productMake;
    }

    public void setProductMake(String productMake) {
        this.productMake = productMake;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
}
