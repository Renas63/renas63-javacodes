package selenium.pages.amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.dropdown.DropdownPage;
import selenium.pages.HerokuApp.HerokuAppHomePage;
import selenium.utils.DriverUtils;

public class AmazonTest {

    WebDriver driver;
   AmazonHomePage amazonHomePage;

    @BeforeMethod
    public void setUp() {

        driver = DriverUtils.getDriver("chrome");
        amazonHomePage= new AmazonHomePage(driver);
    }

    @Test
    public void test1() {
        driver.get("https://amazon.com");
        amazonHomePage.search.sendKeys("MSI Laptop");
        amazonHomePage.search.click();
    }
}