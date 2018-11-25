package com.hh.cloud.servicesimpleconsumeruser.controller;

import com.hh.cloud.servicesimpleconsumeruser.UserFeginClient;
import com.hh.cloud.servicesimpleconsumeruser.entity.User;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements UserFeginClient{
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }
}
