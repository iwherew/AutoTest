package com.wang.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Login {
    public WebDriver driver;

    public void InitDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\iwhere\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.imooc.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("js-signin-btn")).click();
    }

    public void loginScript(String username,String userpass,String testName) throws Exception {
        this.InitDriver();
        /*
        String username = "18768113917";
        String userpass = "123456";

        /*
        String userBy = "name";
        String emailElement = "email";
        String passBy="name";
        String passwordElement = "password";
        String bottonBy = "className";
        String bottonElement = "xa-login";
        String headerBy = "id";
        String headerElement = "header-avator";
        String nameBy = "className";
        String nameElement = "name";
        String testName = "慕粉7252703";
        */

//        String testName = "我只想摸鱼";


        Thread.sleep(2000);
        WebElement user = this.element(this.byStr("username"));
        user.isDisplayed();
        WebElement password = this.element(this.byStr("userpass"));
        password.isDisplayed();
        WebElement loginButton = this.element(this.byStr("loginButton"));
        loginButton.isDisplayed();
        user.sendKeys(username);
        password.sendKeys(userpass);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(loginButton).perform();
        loginButton.click();
//        driver.findElement(By.partialLinkText("无法登录")).click();
        Thread.sleep(2000);
        WebElement header = this.element(this.byStr("header"));
        header.isDisplayed();
        Actions actions = new Actions(driver);
        actions.moveToElement(header).perform();
        String userInfo = this.element(this.byStr("nameInfo")).getText();
        if(userInfo.equals(testName)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
//        driver.quit();
//        driver.close();

//        System.out.println(userInfo);
    }

    /*封装By*/
    public By byStr(String elementKey) throws Exception {
        ProUtil properties = new ProUtil("D:\\Workspaces\\muke\\AutoTest\\Demo\\element.properties");
        String locator = properties.getPro(elementKey);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];

        if(locatorType.equals("id")){
            return By.id(locatorValue);
        }else if(locatorType.equals("name")){
            return By.name(locatorValue);
        }else if(locatorType.equals("className")){
            return By.className(locatorValue);
        }else{
            return By.xpath(locatorValue);
        }
    }

    /*封装Element*/
    public WebElement element(By by){
        WebElement ele = driver.findElement(by);
        return ele;
    }

    public static void main(String[] args) throws Exception {
        Login login = new Login();
//        login.loginScript("18768113917","123456");

        HashMap<String,String> user = new HashMap<String,String>();
        user.put("18768113917","123456>我只想摸鱼");
        user.put("18767175519","123456789>摸鱼多好");
        Iterator us = user.entrySet().iterator();
        while(us.hasNext()){
            Map.Entry entry = (Map.Entry)us.next();
            String username = entry.getKey().toString();
            String password = entry.getValue().toString().split(">")[0];
            String userInfo = entry.getValue().toString().split(">")[1];
//            System.out.println(username+" "+password);
            login.loginScript(username,password,userInfo);
        }
    }
}
