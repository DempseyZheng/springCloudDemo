package com.dempsey.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hello",fallback = FBServiceHello.class)
public interface FeignServiceHello {
    @RequestMapping(value = "/",method = RequestMethod.GET)
     String hello(@RequestParam String name);

}
