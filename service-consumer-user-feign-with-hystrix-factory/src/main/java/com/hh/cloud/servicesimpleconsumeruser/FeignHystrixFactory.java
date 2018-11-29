package com.hh.cloud.servicesimpleconsumeruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignHystrixFactory {

	public static void main(String[] args) {
		SpringApplication.run(FeignHystrixFactory.class, args);
	}
}
