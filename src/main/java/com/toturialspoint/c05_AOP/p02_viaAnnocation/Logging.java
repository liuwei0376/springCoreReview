package com.toturialspoint.c05_AOP.p02_viaAnnocation;

import org.aspectj.lang.annotation.*;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 12:01
 * Desc:
 */

@Aspect
public class Logging {

    /**
     * Following is the definition for a pointcut to select
     * all the methods available. So advice will be called
     * for all the methods.
     */
    @Pointcut("execution(* com.toturialspoint.c05_AOP.p02_viaAnnocation.*.*(..))")
    private void selectAll() {
    }

    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    @Before("selectAll()")
    public void beforeAdvice() {
        System.out.println("Going to setup student profile.");
    }

    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    @After("selectAll()")
    public void afterAdvice() {
        System.out.println("Student profile has been setup.");
    }

    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    @AfterReturning(pointcut = "selectAll()", returning = "retVal")
    public void afterReturningAdvice(Object retVal) {
        System.out.println("Returning:" + retVal.toString());
    }

    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     */
    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex) {
        System.out.println("There has been an exception: " + ex.toString());
    }

}
