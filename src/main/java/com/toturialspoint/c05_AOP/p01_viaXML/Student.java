package com.toturialspoint.c05_AOP.p01_viaXML;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 12:03
 * Desc:
 */
public class Student {

    private Integer age;
    private String name;
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        System.out.println("Age : " + age );
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        System.out.println("Name : " + name );
        return name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }

}
