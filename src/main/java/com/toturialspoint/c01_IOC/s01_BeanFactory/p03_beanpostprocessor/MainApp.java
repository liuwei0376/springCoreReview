package com.toturialspoint.c01_IOC.s01_BeanFactory.p03_beanpostprocessor;

import com.toturialspoint.c01_IOC.s01_BeanFactory.HelloWorld;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        AbstractApplicationContext ctx =
                new ClassPathXmlApplicationContext("ioc/Beans.xml");
        HelloWorld beanPostProcessorObj = (HelloWorld) ctx.getBean("helloWorldBeanPostProcessorTest");
        beanPostProcessorObj.getMessage();
        ctx.registerShutdownHook();
    }

}