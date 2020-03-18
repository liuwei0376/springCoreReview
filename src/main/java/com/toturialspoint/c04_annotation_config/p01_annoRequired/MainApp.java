package com.toturialspoint.c04_annotation_config.p01_annoRequired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 10:44
 * Desc:
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/Beans_Annotation_@Required.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Age : " + student.getAge() );
    }
}
