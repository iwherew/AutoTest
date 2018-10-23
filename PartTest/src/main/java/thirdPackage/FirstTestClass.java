package thirdPackage;

import org.testng.annotations.Test;

@Test(groups = "first")
public class FirstTestClass {
    @Test
    public void Test311(){
        System.out.println("Test211");
    }

    @Test
    public void Test312(){
        System.out.println("Test212");
    }

    @Test(timeOut = 2000)
    public void Test313()throws InterruptedException{
        Thread.sleep(3000);
    }
}
