package com.vedha.retails.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedha.retails.limitservice.beans.Limits;
import com.vedha.retails.limitservice.config.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	Configuration configuration;

	@GetMapping("/limits")
	public Limits retriveLimits() {
		
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
}
