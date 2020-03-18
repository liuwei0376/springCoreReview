package com.toturialspoint.c05_AOP.p01_viaXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 12:03
 * Desc:
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop/Beans_AOP_xmlFormat.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }

}
