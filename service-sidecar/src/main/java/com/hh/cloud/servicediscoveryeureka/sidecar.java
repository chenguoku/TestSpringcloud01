package com.hh.cloud.servicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableSidecar
public class sidecar {

    public static void main(String[] args) {
        SpringApplication.run(sidecar.class, args);
    }
}
