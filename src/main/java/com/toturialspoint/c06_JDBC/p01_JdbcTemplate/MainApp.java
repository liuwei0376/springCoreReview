package com.toturialspoint.c06_JDBC.p01_JdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 15:20
 * Desc:
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("jdbc/Beans_JDBCTemplate.xml");
        StudentJDBCTemplate studentJDBCTemplate
                = (StudentJDBCTemplate) ctx.getBean("studentJDBCTemplate");
        System.out.println("-------------Records Creation-------------");
        studentJDBCTemplate.create("David",11);
        studentJDBCTemplate.create("Andy",12);
        studentJDBCTemplate.create("Amanda",13);

        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudents();
        for(Student record : students){
            System.out.println("record.getId() = " + record.getId());
            System.out.println("record.getName() = " + record.getName());
            System.out.println("record.getAge() = " + record.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.update(2,20);

        System.out.println("----Listing Record with ID = 2 -----" );
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.println("student.getId() = " + student.getId());
        System.out.println("student.getName() = " + student.getName());
        System.out.println("student.getAge() = " + student.getAge());
    }


}
