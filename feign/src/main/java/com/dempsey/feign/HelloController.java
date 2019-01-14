package com.dempsey.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    FeignServiceHello serviceHello;

    @RequestMapping("/")
    public String hello(@RequestParam String name){
        return serviceHello.hello(name);
    }
}