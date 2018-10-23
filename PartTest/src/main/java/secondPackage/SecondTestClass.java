package secondPackage;

import org.testng.annotations.Test;

@Test(groups = "second")
public class SecondTestClass {
    @Test
    public void Test221(){
        System.out.println("Test211");
    }

    @Test
    public void Test222(){
        System.out.println("Test222");
    }

    @Test(timeOut = 2000)
    public void Test223()throws InterruptedException{
        Thread.sleep(3000);
    }
}
