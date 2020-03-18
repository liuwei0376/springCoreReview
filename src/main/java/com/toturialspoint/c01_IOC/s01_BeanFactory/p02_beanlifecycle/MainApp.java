package com.toturialspoint.c01_IOC.s01_BeanFactory.p02_beanlifecycle;

import com.toturialspoint.c01_IOC.s01_BeanFactory.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        //2. FileSystemXmlApplicationContext的用法
        System.out.println("\n\n>>>>>>>>>>>>> 2. FileSystemXmlApplicationContext的用法");
        ApplicationContext context = new FileSystemXmlApplicationContext(
                "D:\\SourceCode\\2-studyDIY\\springCoreReview\\src\\main\\resources\\Beans_JDBCTemplate.xml"
        );
        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
        HelloWorld obj3 = (HelloWorld) context.getBean("helloWorld");
        obj2.getMessage();

        //3. singleton 与 prototype对比
        System.out.println("\n\n>>>>>>>>>>>>> 3. singleton 与 prototype对比");
        System.out.println("\n\n>>>>>>>>>>>>> 3.1 singleton 与 prototype对比");
        //①、Bean作用域 scope="singleton" ，为1个对象，以下语句为true
        //②、Bean作用域 scope="prototype"，为2个新对象，以下语句为false
        System.out.println("obj2 == obj3 is: " + (obj2 == obj3));

        //3.2 单 singleton测试
        System.out.println("\n\n>>>>>>>>>>>>> 3.2 单 singleton测试");
        HelloWorld singletonObjA = (HelloWorld) context.getBean("helloWorldSingleton");
        singletonObjA.setMessage("I'm object singletonObjA");
        singletonObjA.getMessage();
        HelloWorld singletonObjB = (HelloWorld) context.getBean("helloWorldSingleton");
        singletonObjB.getMessage();


        //3.3 单 prototype测试
        System.out.println("\n\n>>>>>>>>>>>>> 3.3 单 prototype测试");
        HelloWorld prototypeA = (HelloWorld) context.getBean("helloWorldPrototype");
        prototypeA.setMessage("I'm object prototypeObjB");
        prototypeA.getMessage();
        HelloWorld prototypeB = (HelloWorld) context.getBean("helloWorldPrototype");
        prototypeB.getMessage();

        //3.4 spring Bean lifecycle 测试
        System.out.println("\n\n>>>>>>>>>>>>> 3.4 spring Bean lifecycle 测试");
        AbstractApplicationContext ctx =
                new ClassPathXmlApplicationContext("ioc/Beans.xml");
        HelloWorld lifecycleObj = (HelloWorld) ctx.getBean("helloWorldLifecycleTest");
        lifecycleObj.getMessage();
        ctx.registerShutdownHook();
    }

}