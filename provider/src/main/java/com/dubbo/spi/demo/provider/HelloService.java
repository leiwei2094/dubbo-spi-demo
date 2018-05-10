package com.dubbo.spi.demo.provider;

import com.dubbo.spi.demo.api.IHelloService;

public class HelloService implements IHelloService {
    public String hello(String name) {
        System.out.println("hello" + name);
        return "hello " + name;
    }
}
