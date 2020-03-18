package com.toturialspoint.c02_DI.p04_collectionDI;

/**
 * User: Administrator
 * Date: 2020/3/16
 * Time: 16:42
 * Desc:
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("di/Beans_DI.xml");
        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
