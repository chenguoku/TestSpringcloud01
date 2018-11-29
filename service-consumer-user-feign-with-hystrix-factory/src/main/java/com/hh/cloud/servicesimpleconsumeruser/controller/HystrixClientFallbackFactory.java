package com.hh.cloud.servicesimpleconsumeruser.controller;

import com.hh.cloud.servicesimpleconsumeruser.entity.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<UserFeginClient> {
    private static final Logger logger = LoggerFactory.getLogger(HystrixClientFallbackFactory.class);
    @Override
    public UserFeginClient create(Throwable throwable) {
        HystrixClientFallbackFactory.logger.info("fallback; reason was:{}",throwable.getCause());
        return new UserFeginClientWithFactory() {
            @Override
            public User findById(Long id) {
                User user = new User();
                user.setId(-1L);
                return user;
            }
        };
    }
}
