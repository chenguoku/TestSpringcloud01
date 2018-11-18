package com.hh.cloud.servicesimpleconsumeruser.controller;

import com.hh.cloud.servicesimpleconsumeruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        ResponseEntity<User> userResponseEntity = restTemplate.getForEntity("http://localhost:7900/simple/" + id, User.class);
        return userResponseEntity.getBody();
    }

}
