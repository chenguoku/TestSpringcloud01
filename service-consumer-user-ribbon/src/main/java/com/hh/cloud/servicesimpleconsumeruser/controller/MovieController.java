package com.hh.cloud.servicesimpleconsumeruser.controller;

import com.hh.cloud.servicesimpleconsumeruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        ResponseEntity<User> userResponseEntity = restTemplate.getForEntity("http://service-provider-user/simple/" + id, User.class);
        return userResponseEntity.getBody();
    }

    @GetMapping("/test")
    public String test(){

        ServiceInstance choose1 = loadBalancerClient.choose("service-provider-user");
        System.out.println("1111  :  "+choose1.getHost()+" : "+choose1.getPort()+" : " + choose1.getServiceId());

        ServiceInstance choose2 = loadBalancerClient.choose("service-provider-user2");
        System.out.println("2222  :  "+choose2.getHost()+" : "+choose2.getPort()+" : " + choose2.getServiceId());
        return "1";
    }

}
