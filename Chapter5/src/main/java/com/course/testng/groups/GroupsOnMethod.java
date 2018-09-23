package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端组测试方法11111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端组测试方法22222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端组测试方法33333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端组测试方法44444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("服务端组运行之前的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("服务端组运行之后的方法！！！！");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("客户端组运行之前的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("客户端组运行之后的方法！！！！");
    }
}
