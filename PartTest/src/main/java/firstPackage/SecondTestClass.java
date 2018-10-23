package firstPackage;

import org.testng.annotations.Test;

@Test(groups = "second")
public class SecondTestClass {
    @Test
    public void Test121(){
        System.out.println("test121");
    }

    @Test(timeOut = 2000)
    public void Test122()throws InterruptedException{
        Thread.sleep(3000);
    }

    @Test(timeOut = 3000)
    public void Test123()throws InterruptedException{
        Thread.sleep(2000);
    }
}
