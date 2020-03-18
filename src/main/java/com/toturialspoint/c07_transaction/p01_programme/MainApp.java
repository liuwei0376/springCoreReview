package com.toturialspoint.c07_transaction.p01_programme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 15:20
 * Desc:
 *
 * https://www.w3cschool.cn/wkspring/urw31mme.html
 *
 * Spring 编程式事务管理
 编程式事务管理方法允许你在对你的源代码编程的帮助下管理事务。这给了你极大地灵活性，但是它很难维护。

 在我们开始之前，至少要有两个数据库表，在事务的帮助下我们可以执行多种 CRUD 操作。以 Student 表为例，用下述 DDL 可以在 MySQL TEST 数据库中创建该表：

 CREATE TABLE Student(
 ID   INT NOT NULL AUTO_INCREMENT,
 NAME VARCHAR(20) NOT NULL,
 AGE  INT NOT NULL,
 PRIMARY KEY (ID)
 );
 第二个表是 Marks，用来存储基于年份的学生的标记。这里 SID 是 Student 表的外键。

 CREATE TABLE Marks(
 SID INT NOT NULL,
 MARKS  INT NOT NULL,
 YEAR   INT NOT NULL
 );
 让我们直接使用 PlatformTransactionManager 来实现编程式方法从而实现事务。要开始一个新事务，你需要有一个带有适当的 transaction 属性的 TransactionDefinition 的实例。这个例子中，我们使用默认的 transaction 属性简单的创建了 DefaultTransactionDefinition 的一个实例。

 当 TransactionDefinition 创建后，你可以通过调用 getTransaction() 方法来开始你的事务，该方法会返回 TransactionStatus 的一个实例。 TransactionStatus 对象帮助追踪当前的事务状态，并且最终，如果一切运行顺利，你可以使用 PlatformTransactionManager 的 commit() 方法来提交这个事务，否则的话，你可以使用 rollback() 方法来回滚整个操作。
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("transaction/Beans_programme.xml");
        StudentJDBCTemplate studentJDBCTemplate
                = (StudentJDBCTemplate) ctx.getBean("studentJDBCTemplate");
        System.out.println("------Records creation--------");
        studentJDBCTemplate.create("Zara", 11, 99, 2010);
        studentJDBCTemplate.create("Nuha", 20, 97, 2010);
        studentJDBCTemplate.create("Ayan", 25, 100, 2011);
        System.out.println("------Listing all the records--------");
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
        for (StudentMarks record : studentMarks) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.print(", Marks : " + record.getMarks());
            System.out.print(", Year : " + record.getYear());
            System.out.println(", Age : " + record.getAge());
        }
    }


}
