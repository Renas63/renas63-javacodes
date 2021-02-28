package selenium.windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import selenium.screenshots.ScreenshotIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HerokuAppHwk {
    WebDriver driver;
    Actions actions;
    SoftAssert softAssert = new SoftAssert();
    ScreenshotIntro screenshot;

    @BeforeMethod
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
        screenshot = new ScreenshotIntro();

    }

    @Test
    public void herokuPage() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        softAssert.assertTrue(driver.getTitle().contains("heroku"));

        List<WebElement> links = driver.findElements(By.xpath("//li//a"));
        for (int i = 0; i <links.size() ; i++) {
            actions.keyDown(Keys.SHIFT).click(links.get(i)).keyUp(Keys.SHIFT).perform();
            String currentWindow= driver.getWindowHandle();
            Set<String> allWindows= driver.getWindowHandles();
            String newWindowId="";
            for (String id:allWindows) {
                if(!id.equals(currentWindow)){
                    newWindowId=id;
                    driver.switchTo().window(newWindowId);
                    Thread.sleep(2000);
                    if(driver.getPageSource().contains("h3")){
                        String tagName=driver.findElement(By.tagName("h3")).getText();
                        System.out.println(tagName);
                        softAssert.assertEquals(true, driver.getPageSource().contains("h3"));

                    }
                    driver.close();
                }
            }
            driver.switchTo().window(currentWindow);
        }

    }
}

