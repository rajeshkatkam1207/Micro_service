package com.vedha.reteil.vedhaRetail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.fallback.FallbackMethod;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {

	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	@GetMapping("sample-api")
	//@Retry(name = "sample-api",fallbackMethod ="hardCodeResponse" )
	//@CircuitBreaker(name = "sample-api",fallbackMethod ="hardCodeResponse")
	@RateLimiter(name = "sample-api")
	public String sampleApi() {
		logger.info("call recived");
//		ResponseEntity<String> responseEntity =  new RestTemplate().getForEntity("http://localhost:8080/test", String.class);
//		return responseEntity.getBody();
		return "sample-api";
	}
	
	public String hardCodeResponse(Exception e) {
		
		return "fall back response";
	}
}
