package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wushaohong
 * @version 1.0
 * @datetime 2017/5/9 21:21
 * @company YIDU
 */
public class ExampleJob {
    /**
     * 执行的方法
     */
    public void execute(){
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "执行ExampleJob");
    }
}
