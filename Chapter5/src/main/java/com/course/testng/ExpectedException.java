package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("成功的异常测试");
        throw new RuntimeException();
    }
}
