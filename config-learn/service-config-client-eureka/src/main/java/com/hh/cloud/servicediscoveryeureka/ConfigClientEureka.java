package com.hh.cloud.servicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEureka {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientEureka.class, args);
    }
}
