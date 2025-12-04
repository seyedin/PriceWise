package com.pricewise.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the PriceWise API Gateway.
 * Routes incoming requests to registered microservices via Eureka Discovery.
 */
@SpringBootApplication
public class PriceWiseGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceWiseGatewayApplication.class, args);
	}
}
