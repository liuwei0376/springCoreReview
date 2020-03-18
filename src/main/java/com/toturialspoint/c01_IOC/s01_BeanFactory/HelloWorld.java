package com.toturialspoint.c01_IOC.s01_BeanFactory;

public class HelloWorld {

    private String message;

    public void getMessage() {
        System.out.println("Your message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println("Bean is going through init.");
    }

    public void destory(){
        System.out.println("Bean will destory now.");
    }
}