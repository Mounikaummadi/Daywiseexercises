package com.wipro.productmgmt.service;


import java.util.List;

import org.springframework.data.domain.Page;

import com.wipro.productmgmt.entity.ProductDetails;

public interface ProductService {
	void save(ProductDetails productDetails);
	List<ProductDetails> findAll();
	ProductDetails findById(int id);
	void deleteById(int id);
	List<ProductDetails> findByProductNameOrderByProductNameDesc(String name);
	List<ProductDetails> findByProductNameAndProductMakeOrderByProductNameDesc(String name, String make);
	Page<ProductDetails> findAll(org.springframework.data.domain.Pageable p);

	

}
