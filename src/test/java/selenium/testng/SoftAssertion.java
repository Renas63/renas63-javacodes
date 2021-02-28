package selenium.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    @Test
    public void test1() {
        System.out.println("code before assertion");
        Assert.assertEquals(2, 2);
        System.out.println("code after assertion");
    }

    @Test
    public void test2() {
        System.out.println("code before soft Assertion");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2, 2);
        softAssert.assertEquals("John", "John");
        System.out.println("code after soft assertion");
        softAssert.assertAll();
    }

    @Test
    public void test3() {
        System.out.println("code before soft Assertion");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2, 5);
        softAssert.assertEquals("Joh", "John");
        System.out.println("code after soft assertion");

    }
}