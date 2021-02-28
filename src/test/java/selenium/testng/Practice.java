package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Practice {
    WebDriver driver;
    @BeforeClass
    public void classSetup(){
        System.out.println("before class hook is executed");

    }
    @AfterClass
    public void classCleanup(){
        System.out.println("after class hook is executed");
    }
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        System.out.println("Before method hook is executed");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("after method hook is executed");
        driver.quit();
    }
    @Test
    public void etsyTest(){
        System.out.println("executing google test");
        driver.get("https:/etsy.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("etsy"));
    }
    @Test
    public void spireWebSolution(){
        driver.get("http://spirewebsolutions.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("spire"));
    }
}
