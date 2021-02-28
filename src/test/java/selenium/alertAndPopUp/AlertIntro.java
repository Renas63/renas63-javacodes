package selenium.alertAndPopUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class AlertIntro {
    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().deleteAllCookies();

        WebElement javascriptAlert = driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        actions.keyDown(Keys.SHIFT).click(javascriptAlert).keyUp(Keys.SHIFT).perform();

        String currentWindowId = driver.getWindowHandle();
        Set<String> allWindowIds = driver.getWindowHandles();
        String newWindowId = "";
        for (String id : allWindowIds) {
            if (!id.equals(currentWindowId)) {
                newWindowId = id;
            }
        }

        driver.switchTo().window(newWindowId);
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        simpleAlert.click();
        //handle
        driver.switchTo().alert().accept();
        WebElement confirmAlert= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        confirmAlert.click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        WebElement promptAlert= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        promptAlert.click();
        Alert promptAlertWindow = driver.switchTo().alert();
        promptAlertWindow.sendKeys("Techtorial Academy"+Keys.ENTER);
        Thread.sleep(2000);
        promptAlertWindow.accept();
    }
}
