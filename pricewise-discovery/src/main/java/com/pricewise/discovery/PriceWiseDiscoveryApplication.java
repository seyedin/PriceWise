package com.pricewise.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main class for the Eureka Discovery Server.
 * Starts a Spring Boot application with Eureka Server enabled.
 */
@SpringBootApplication
@EnableEurekaServer
public class PriceWiseDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PriceWiseDiscoveryApplication.class, args);
	}
}
