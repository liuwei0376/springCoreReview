package com.tutorialspoint;

import com.tutorialspoint.model.HelloWorld;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: Administrator
 * Date: 2020/3/18
 * Time: 11:14
 * Desc:
 *
 * 使用如下2中日志框架,进行项目日志记录:
 *  -1 log4j
 *  -2 apache commons logging
 * https://www.w3cschool.cn/wkspring/47o21icw.html
 */
public class MainApp {

    //使用log4j在项目根目录下的日志文件.log.out里记录
    static Logger log4jVersionLog = Logger.getLogger(MainApp.class);
    static Log commonVersionLog = LogFactory.getLog(MainApp.class.getName());

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
//        log4jVersionLog.info("Going to create HelloWorld obj");
        commonVersionLog.info("Going to create HelloWorld obj");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
//        log4jVersionLog.info("Exiting the program");
        commonVersionLog.info("Exiting the program");


    }


}
