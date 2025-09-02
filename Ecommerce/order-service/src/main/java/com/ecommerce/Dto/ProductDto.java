package com.ecommerce.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String category;
    private Integer availableStock;
    private String uom;// liter, kg, piece
    private String imageUrl;
    private String productRating;
    private LocalDateTime dateOfManufacture;
}
