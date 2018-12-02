package com.hh.cloud.servicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulFilter {

    public static void main(String[] args) {
        SpringApplication.run(ZuulFilter.class, args);
    }

    @Bean
    public PreZuulFilter preZuulFilter(){
        return new PreZuulFilter();
    }
}
