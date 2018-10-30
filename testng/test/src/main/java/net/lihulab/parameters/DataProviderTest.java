package net.lihulab.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {

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
