package firstPackage;

import org.testng.annotations.Test;

@Test(groups = "first")
public class FirstTestClass {
    @Test
    public void Test111(){
        System.out.println("Test111");
    }

    @Test
    public void Test112(){
        System.out.println("Test112");
        throw new RuntimeException();
    }

    @Test
    public void Test113(){
        System.out.println("Test111");
    }
}
