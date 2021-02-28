package selenium.iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import selenium.screenshots.ScreenshotIntro;

public class MultiFrame {
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
    public void nestedIframe(){// STUDY THIS IFRAME AGAIN AND AGAIN
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        // SWITCH TO SECOND INNER FRAME BY NAME
        driver.switchTo().frame("frame-top");
        WebElement nestedFrame= driver.findElement(By.xpath("//frame[@name='frame-middle']"));
        nestedFrame.click();
        driver.switchTo().frame("frame-middle");
        WebElement middleElement= driver.findElement(By.id("content"));
        System.out.println(middleElement.getText());

        //switch back to parent frame and to inner right frame by index
        driver.switchTo().parentFrame().switchTo().frame(2);

        WebElement rightFrame= driver.findElement(By.tagName("body"));
        System.out.println(rightFrame.getText());

        // FIND OUT NUMBER OF IFRAMES
        // List<WebElement>iframe= driver.findEelements(By.tagName("iframe");
        //System.out.println(iframe.size);
   }
}
