package com.dubbo.spi.demo.consumer;

import com.dubbo.spi.demo.api.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private IHelloService helloService;

    @RequestMapping(value = "/hello")
    public String hello(){
        return helloService.hello("tom");
    }

}
