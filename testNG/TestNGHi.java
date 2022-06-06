package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGHi {
    JavaHi jh = new JavaHi("TestNG");

    @Test
    public void testPrintPersonName() {
        jh.printPersonName();
    }

    @Test
    public void testSayHi() {
        System.out.println("Inside testSayHi");
        Assert.assertEquals(jh.sayHi(), "Hi TestNG");
    }

}
