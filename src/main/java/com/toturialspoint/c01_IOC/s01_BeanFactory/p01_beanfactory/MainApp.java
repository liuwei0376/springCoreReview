package com.toturialspoint.c01_IOC.s01_BeanFactory.p01_beanfactory;

import com.toturialspoint.c01_IOC.s01_BeanFactory.HelloWorld;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {

    public static void main(String[] args) {

        //1. XmlBeanFactory的用法
        System.out.println("\n\n>>>>>>>>>>>>> 1. XmlBeanFactory的用法 ");
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("ioc/Beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        obj.getMessage();

        //2. FileSystemXmlApplicationContext的用法
        System.out.println("\n\n>>>>>>>>>>>>> 2. FileSystemXmlApplicationContext的用法");
        ApplicationContext context = new FileSystemXmlApplicationContext(
                "D:\\SourceCode\\2-studyDIY\\springCoreReview\\src\\main\\resources\\Beans_JDBCTemplate.xml"
        );
        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
        HelloWorld obj3 = (HelloWorld) context.getBean("helloWorld");
        obj2.getMessage();
    }

}