package com.wang.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Login {
    public WebDriver driver;

    public void InitDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\iwhere\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.imooc.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("js-signin-btn")).click();
    }

    public void loginScript() throws Exception {
        this.InitDriver();
        String username = "18768113917";
        String userBy = "name";
        String emailElement = "email";
        String userpass = "123456";
        String passBy="name";
        String passwordElement = "password";
        String bottonBy = "className";
        String bottonElement = "xa-login";
        String headerBy = "id";
        String headerElement = "header-avator";
        String nameBy = "className";
        String nameElement = "name";
        String testName = "慕粉7252703";

        ProUtil properties = new ProUtil("D:\\Workspaces\\muke\\AutoTest\\Demo\\element.properties");
        String locator = properties.getPro("username");
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];

        Thread.sleep(2000);
        WebElement user = this.element(this.byStr(locatorType,locatorValue));
        user.isDisplayed();
        WebElement password = this.element(this.byStr(passBy,passwordElement));
        password.isDisplayed();
        WebElement loginButton = this.element(this.byStr(bottonBy,bottonElement));
        loginButton.isDisplayed();
        user.sendKeys(username);
        password.sendKeys(userpass);
//        Actions actions = new Actions(driver);
//        actions.moveToElement(loginButton).perform();
        loginButton.click();
//        driver.findElement(By.partialLinkText("无法登录")).click();
        Thread.sleep(2000);
        WebElement header = this.element(this.byStr(headerBy,headerElement));
        header.isDisplayed();
        Actions actions = new Actions(driver);
        actions.moveToElement(header).perform();
        String userInfo = this.element(this.byStr(nameBy,nameElement)).getText();
        if(userInfo.equals(testName)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
//        System.out.println(userInfo);
    }

    /*封装By*/
    public By byStr(String by,String local){
        if(by.equals("id")){
            return By.id(local);
        }else if(by.equals("name")){
            return By.name(local);
        }else if(by.equals("className")){
            return By.className(local);
        }else{
            return By.xpath(local);
        }
    }

    /*封装Element*/
    public WebElement element(By by){
        WebElement ele = driver.findElement(by);
        return ele;
    }

    public static void main(String[] args) throws Exception {
        Login login = new Login();
        login.loginScript();
    }
}
