package com.stonecj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NameAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NameAppApplication.class, args);
	}
}
