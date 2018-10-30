package net.lihulab;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {

    @Test(timeOut = 1000)
    public void test1() throws InterruptedException {
        System.out.println("hello");
        Thread.sleep(2000);
    }

    @BeforeMethod
    public void beforeTest() {
        System.out.println("begin");
    }

    @AfterMethod
    public void afterTest() {
        System.out.println("end");
    }

}
