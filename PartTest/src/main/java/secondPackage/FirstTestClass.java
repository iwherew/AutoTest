package secondPackage;

import org.testng.annotations.Test;

@Test(groups = "first")
public class FirstTestClass {
    @Test
    public void Test211(){
        System.out.println("Test211");
    }

    @Test
    public void Test212(){
        System.out.println("Test212");
    }

    @Test(timeOut = 2000)
    public void Test213()throws InterruptedException{
        Thread.sleep(3000);
    }
}
