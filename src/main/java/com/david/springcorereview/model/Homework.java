package com.david.springcorereview.model;

/**
 * User: Administrator
 * Date: 2020/3/13
 * Time: 16:35
 * Desc:
 */
public class Homework {

    private String content;

    public Homework() {
    }

    public Homework(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
