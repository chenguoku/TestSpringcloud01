package com.hh.cloud.servicesimpleconsumeruser.controller;

import com.hh.cloud.servicesimpleconsumeruser.UserFeginClient;
import com.hh.cloud.servicesimpleconsumeruser.UserFeginClient2;
import com.hh.cloud.servicesimpleconsumeruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private UserFeginClient userFeginClient;

    @Autowired
    private UserFeginClient2 userFeginClient2;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){

        return userFeginClient.findById(id);
    }

    @GetMapping("/test/{serviceName}")
    public String findServiceInfo(@PathVariable("serviceName") String serviceName){
        return userFeginClient2.findEurekaByServiceName(serviceName);
    }

}
