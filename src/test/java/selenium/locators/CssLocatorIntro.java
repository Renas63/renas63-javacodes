package selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssLocatorIntro {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

    }
    @Test
    public void test1(){
        driver.get("https://amazon.com");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement searchBox= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        searchBox.sendKeys("java programing");
        js.executeScript("arguments[0].setAttribute('style',"+" 'background:yellow; border:2xp solid red;')",searchBox);
    }
}
