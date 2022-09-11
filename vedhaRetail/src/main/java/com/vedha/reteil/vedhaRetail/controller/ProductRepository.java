package com.vedha.reteil.vedhaRetail.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedha.reteil.vedhaRetail.bean.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	Product findByProductName(String productName);

	Product findByProductIdAndProductName(Integer productId, String productName);
}
