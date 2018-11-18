package com.hh.cloud.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeginConfiguractionAuth {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return  new BasicAuthRequestInterceptor("user","password123");
    }

}
