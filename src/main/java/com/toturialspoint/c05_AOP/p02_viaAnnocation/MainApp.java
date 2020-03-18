package com.toturialspoint.c05_AOP.p02_viaAnnocation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 14:12
 * Desc:
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("aop/Beans_AOP_annocationFormat.xml");
        Student student = (Student) ctx.getBean("student");
        student.getName();
        student.getAge();
    }

}
