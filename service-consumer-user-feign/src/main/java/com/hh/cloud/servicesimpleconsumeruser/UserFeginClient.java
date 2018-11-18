package com.hh.cloud.servicesimpleconsumeruser;

import com.hh.cloud.servicesimpleconsumeruser.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("service-provider-user")
public interface UserFeginClient {
    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User postUser(@RequestBody User user);
}
