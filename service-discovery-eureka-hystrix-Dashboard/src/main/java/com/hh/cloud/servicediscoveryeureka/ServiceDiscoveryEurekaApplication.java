package com.hh.cloud.servicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ServiceDiscoveryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscoveryEurekaApplication.class, args);
    }
}
