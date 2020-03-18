package com.toturialspoint.c04_annotation_config.p01_annoRequired;

import org.springframework.beans.factory.annotation.Required;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 10:43
 * Desc:
 *
 * @Required 注释应用于 bean 属性的 setter 方法，它表明受影响的 bean 属性在配置时必须放在
 * XML 配置文件中，否则容器就会抛出一个 BeanInitializationException 异常。
 */
public class Student {

    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
}
