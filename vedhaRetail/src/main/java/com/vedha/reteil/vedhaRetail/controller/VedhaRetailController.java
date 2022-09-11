package com.vedha.reteil.vedhaRetail.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedha.reteil.vedhaRetail.bean.Product;

@RestController
@RequestMapping("/retail")
public class VedhaRetailController {
	
	@Autowired
	private Environment environmental;
	
	@Autowired
	private ProductRepository repository;
	
	@GetMapping("/name/{name}")
	public Product getProductCharges(@PathVariable String name) {
	
//		Product product = new Product(123, "Britania Cookies", 500.00, 1);
		String port = environmental.getProperty("local.server.port");
		
		//<Product> product1 = repository.findById(101);
		Product product  = repository.findByProductName(name);
		//Product product  = repository.findByProductIdAndProductName(id, name);
		
		//Product product = product1.get();
		
		product.setPortNumber(port);
		return product;
		
	}

}
