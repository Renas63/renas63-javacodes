package selenium.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.pages.HerokuApp.HerokuAppHomePage;

public class DropdownTest {

    WebDriver driver;
    HerokuAppHomePage herokuAppHomePage;
    DropdownPage dropdownPage;
    @BeforeMethod
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        herokuAppHomePage= new HerokuAppHomePage(driver);
        dropdownPage= new DropdownPage(driver);
    }
    @Test
    public void test1(){
        driver.get("https://the-internet.herokuapp.com/");
        herokuAppHomePage.dropdownLink.click();
        String header= dropdownPage.dropDownPageHeader.getText();
        Assert.assertEquals("Dropdown List",header);

    }
}
