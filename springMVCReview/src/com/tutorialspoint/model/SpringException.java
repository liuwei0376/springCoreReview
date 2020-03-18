package com.tutorialspoint.model;

/**
 * User: Administrator
 * Date: 2020/3/18
 * Time: 10:53
 * Desc:
 */
public class SpringException extends RuntimeException {

    private String exceptionMsg;

    public SpringException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
