package com.hh.cloud.servicesimpleconsumeruser;

import com.hh.cloud.config.MyConfiguraction;
import com.hh.cloud.servicesimpleconsumeruser.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import feign.Param;
import feign.RequestLine;

@FeignClient(name = "service-provider-user",configuration = MyConfiguraction.class)
public interface UserFeginClient {
    @RequestLine("GET /simple/{id}")
    User findById(@Param("id") Long id);
}
