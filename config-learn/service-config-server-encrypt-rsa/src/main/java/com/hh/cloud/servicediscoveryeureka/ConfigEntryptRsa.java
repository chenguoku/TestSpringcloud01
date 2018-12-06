package com.hh.cloud.servicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigEntryptRsa {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEntryptRsa.class, args);
    }
}
