package com.pricewise.list.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Simple controller to check Eureka registration status.
 */
@RestController
public class EurekaHealthController {

    private final DiscoveryClient discoveryClient;

    public EurekaHealthController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/health/eureka")
    public String checkEurekaRegistration() {
        List<String> services = discoveryClient.getServices();
        if (services.isEmpty()) {
            return "❌ No services registered in Eureka";
        } else {
            return "✅ Registered services: " + String.join(", ", services);
        }
    }
}
