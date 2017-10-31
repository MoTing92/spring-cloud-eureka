package com.moting.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

	@Autowired
    DiscoveryClient discoveryClient;
    
	@GetMapping("/dc")
    public String dc() throws InterruptedException {
		Thread.sleep(5000);
        String services = "Services1: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
