package com.wipro.productmgmt.repo;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.productmgmt.entity.ProductDetails;


public interface ProductRepository extends JpaRepository<ProductDetails, Integer> {
    Page<ProductDetails> findByProductNameAndProductMake(String productName, String productMake, Pageable pageable);

	

	Page<ProductDetails> findAll(Pageable p);


	List<ProductDetails> findByProductNameOrderByProductNameDesc(String productName);

	List<ProductDetails> findByProductNameAndProductMakeOrderByProductNameDesc(String productName, String productMake);

	
}


