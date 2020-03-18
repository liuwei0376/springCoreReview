package com.toturialspoint.c01_IOC.s01_BeanFactory.p04_inherit;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * https://www.w3cschool.cn/wkspring/tydj1ick.html
 */
public class MainApp {

    public static void main(String[] args) {

        AbstractApplicationContext ctx =
                new ClassPathXmlApplicationContext("ioc/Beans_defineInherit.xml");
        HelloWorld objA = (HelloWorld) ctx.getBean("helloWorld");
        objA.getMessage1();
        objA.getMessage2();

        HelloChina objB = (HelloChina) ctx.getBean("helloChina");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();

        HelloIndia objC = (HelloIndia) ctx.getBean("helloIndia");
        objC.getMessage1();
        objC.getMessage2();
        objC.getMessage3();

    }

}