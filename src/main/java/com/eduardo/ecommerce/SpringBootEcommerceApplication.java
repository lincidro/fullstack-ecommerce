package com.eduardo.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
	}

	/**
	 * To access to the repositories created we can use the next urls
	 * http://localhost:8080/api/products
	 * http://localhost:8080/api/product-category
	 */
}
