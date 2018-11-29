package com.hh.cloud.servicesimpleconsumeruser.controller;

import com.hh.cloud.servicesimpleconsumeruser.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "service-provider-user" ,fallbackFactory = HystrixClientFallbackFactory.class)
public interface UserFeginClient {
    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);

}

