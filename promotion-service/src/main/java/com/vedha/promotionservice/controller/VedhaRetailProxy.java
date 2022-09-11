package com.vedha.promotionservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.vedha.promotionservice.beans.Promotion;

//@FeignClient(name = "vedha-retail",url = "localhost:8000")
@FeignClient(name = "vedha-retail")
public interface VedhaRetailProxy {

	@GetMapping("/retail/name/{name}")
	public Promotion getProductCharges(@PathVariable String name);
	
}
