package com.wipro.productmgmt.service.impl;

import org.springframework.data.domain.Pageable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.wipro.productmgmt.entity.ProductDetails;
import com.wipro.productmgmt.repo.ProductRepository;
import com.wipro.productmgmt.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepo;

    @Override
    public void save(ProductDetails productDetails) {
        productRepo.save(productDetails);
    }

    @Override
    public List<ProductDetails> findAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductDetails findById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        productRepo.deleteById(id);
    }

	@Override
	public List<ProductDetails> findByProductNameOrderByProductNameDesc(String productName) {
		// TODO Auto-generated method stub
		return productRepo.findByProductNameOrderByProductNameDesc(productName);
	}

	@Override
	public List<ProductDetails> findByProductNameAndProductMakeOrderByProductNameDesc(String productName, String productMake) {
		// TODO Auto-generated method stub
		return productRepo.findByProductNameAndProductMakeOrderByProductNameDesc(productName,productMake);
	}

	@Override
	public Page<ProductDetails> findAll(Pageable p) {
		// TODO Auto-generated method stub
		return productRepo.findAll(p);
	}

	

	
}
