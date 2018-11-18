package com.hh.cloud.servicesimpleconsumeruser;

import com.hh.cloud.config.FeginConfiguractionAuth;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "xxxxx",url = "http://localhost:8761",configuration = FeginConfiguractionAuth.class)
public interface UserFeginClient2 {
    @RequestMapping(value = "/eureka/apps/{serviceName}")
    public String findEurekaByServiceName(@PathVariable("serviceName")String serviceName);
}
