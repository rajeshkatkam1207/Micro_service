package com.vedha.promotionservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vedha.promotionservice.beans.Promotion;

@RestController
public class PromotionController {
	
	@Autowired
	private VedhaRetailProxy proxy;
	
	@GetMapping("promotion/name/{name}")
	public Promotion calculatePromotion(@PathVariable String name) {
		
		Map<String, String> uriVariables = new HashMap<>();
		//uriVariables.put("id", id);
		uriVariables.put("name", name);
		ResponseEntity<Promotion> reponseEntity = new RestTemplate().getForEntity("http://localhost:8000/retail/name/{name}", Promotion.class,uriVariables);
		Promotion promotion = reponseEntity.getBody();
		return promotion;
		
	}
	
	@GetMapping("promotion-feign/name/{name}")
	public Promotion calculatePromotionfeign(@PathVariable String name) {
		Promotion promotion = proxy.getProductCharges(name);
		return promotion;
		
	}

}
