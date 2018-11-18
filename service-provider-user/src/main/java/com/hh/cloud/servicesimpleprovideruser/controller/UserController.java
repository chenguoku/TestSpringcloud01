package com.hh.cloud.servicesimpleprovideruser.controller;

import com.hh.cloud.servicesimpleprovideruser.entity.User;
import com.hh.cloud.servicesimpleprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        return user;
    }


}
