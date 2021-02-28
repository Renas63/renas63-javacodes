package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestAnnotation {
    WebDriver driver;
    @BeforeClass//@BeforeClass--> executed once before the class

    public void classSetup(){
        System.out.println("Before class hook is executed");
    }
    @AfterClass//@AfterClass---> executed once after class
    public void classCleanup(){
        System.out.println("After class hook is executed");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("Before method hook is executed");
        WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method hook is executed");
        driver.quit();
    }

    @Test(priority = 10)
    public void googleTest(){
        System.out.println("executing google test");

        driver.get("https://google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"));

    }
    @Test(priority = -60) // lowest one will be executed first!!!
    //invocationCount=3 means it will run the test 3 times!!!!
    public void techtorialTest(){
        System.out.println("executing techtorial test");

        driver.get("http://techtorialacademy.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("techtorial"));

    }
    @Test(invocationTimeOut = 1000)// test execution should take not more than 5 seconds!!!
    public void task5() throws InterruptedException {
        System.out.println("Test 5");

        Thread.sleep(6000);

    }
    @Test(expectedExceptions = RuntimeException.class)
    public void task6(){
        System.out.println("test 6");
        throw  new RuntimeException();// after throwing an exception, the test will be passed

    }
    @Test(dependsOnMethods = "task6")
    public void task7(){


    }

}
