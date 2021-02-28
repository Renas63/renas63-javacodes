package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

    }
    @Parameters({"username","password"}) // PARAMETERS
    @Test
    public void parametersTest(String myUsername, String myPassword){

        driver.navigate().to("https://facebook.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
        WebElement emailField= driver.findElement(By.id("email"));
        WebElement passwordField= driver.findElement(By.id("pass"));
        emailField.sendKeys(myUsername);
        passwordField.sendKeys(myPassword);

    }
    @Test
    public void parallelTest() throws InterruptedException {
        driver.navigate().to("http://techtorialacademy.com");
        Thread.sleep(10000);
    }
    @Test
    public void parallelTest2() throws InterruptedException {
        driver.navigate().to("https://etsy.com");
        Thread.sleep(10000);
    }
}
