package com.tutorialspoint.model;

/**
 * User: Administrator
 * Date: 2020/3/18
 * Time: 11:10
 * Desc:
 */
public class HelloWorld {

    private String message;

    public void getMessage() {
        System.out.println("your message = " + message);;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
