package com.david.springcorereview.util;

import java.util.Date;

/**
 * User: Administrator
 * Date: 2020/3/13
 * Time: 16:38
 * Desc:
 */
public class CheckNowTime {

    public void beforeDoHomework(){
        System.out.println(new Date(System.currentTimeMillis()));
    }

}
