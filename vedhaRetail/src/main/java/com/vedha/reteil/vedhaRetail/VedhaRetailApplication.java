package com.vedha.reteil.vedhaRetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class VedhaRetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(VedhaRetailApplication.class, args);
	}

}
