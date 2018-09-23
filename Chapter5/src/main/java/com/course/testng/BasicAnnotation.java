package com.course.testng;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1() {
        System.out.println("Test 这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("Test 这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod 在测试方法之前运行的方法");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod 在测试方法之后运行的方法");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass 在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass 在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite 测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite 测试套件");
    }


}
