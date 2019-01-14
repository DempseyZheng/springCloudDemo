package com.dempsey.feign;

import org.springframework.stereotype.Component;

@Component
public class FBServiceHello implements FeignServiceHello {
    @Override
    public String hello(String name) {
        return "feign sorry:"+name;
    }
}
