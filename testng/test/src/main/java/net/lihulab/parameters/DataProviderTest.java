package net.lihulab.parameters;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @BeforeMethod
    public void beforetest(){
        System.out.println("before test");
    }

    @AfterMethod
    public void aftertest(){
        System.out.println("after test");
    }

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        Assert.fail();
        System.out.println("name: " + name + " age: " + age);
    }

    @DataProvider(name="data")
    public Object[][] provideData() {
        Object[][] o = new Object[][] {
                {"zhangsan", 33},
                {"lisi", 44}
        };

        return o;
    }

}
