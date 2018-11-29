package com.hh.cloud.config;

import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FeginConfiguractionAuth {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return  new BasicAuthRequestInterceptor("user","password123");
    }

    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
