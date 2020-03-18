package com.toturialspoint.c02_DI.p02_setterDI;

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
        TextEditor te = (TextEditor) context.getBean("textEditorSetter");
        te.spellCheck();
    }
}
