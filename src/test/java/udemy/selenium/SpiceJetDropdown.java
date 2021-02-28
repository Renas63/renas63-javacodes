package udemy.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SpiceJetDropdown {
    WebDriver driver;
    Actions actions;
    SoftAssert softAssert;
    @BeforeMethod
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        actions= new Actions(driver);
        softAssert = new SoftAssert();

    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.spicejet.com/");
        Thread.sleep(1000);
        WebElement departure= driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']"));
        Select select= new Select(departure);
        select.selectByValue("ALA");
    }
}
