package com.david.springcorereview.action;

import com.david.springcorereview.model.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Administrator
 * Date: 2020/3/13
 * Time: 16:39
 * Desc:
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = context.getBean(Student.class);

        System.out.println(student.getName() + " 准备做作业了");
        student.doHomeWork();

        context.close();
    }

}
