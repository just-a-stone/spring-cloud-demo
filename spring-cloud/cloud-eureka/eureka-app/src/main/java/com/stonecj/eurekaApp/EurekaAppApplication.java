package com.stonecj.eurekaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaAppApplication.class, args);
    }
}
