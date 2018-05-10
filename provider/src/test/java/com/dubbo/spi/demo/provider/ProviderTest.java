package com.dubbo.spi.demo.provider;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {

    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.out.println("Dubbo Provider 1 started successfully...");
        System.in.read();
    }

    @Test
    public void test2() throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider2.xml"});
        context.start();
        System.out.println("Dubbo Provider 2 started successfully...");
        System.in.read();
    }
}
