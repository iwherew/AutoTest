package com.tester.extend.demo;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {


    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }

    @Test
    public void test4(){
        Assert.assertEquals("bbb","aaa");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是日志");
        throw new RuntimeException("这是运行时异常");
    }
}
