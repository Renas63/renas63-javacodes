package selenium.homeworks.hwk5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task2 {
    WebDriver driver;
    Actions actions;
    SoftAssert softAssert;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        actions= new Actions(driver);

    }
    /*
    Navigate to "https://demos.telerik.com/kendo- ui/dragdrop/area"
Click and hold the blue circle
Move the circle on top of Orange box
Validate "Now you can drop it." text is displayed in orange box
Validate Blue box has (Drop here) text
     */
    @Test
    public void test2() throws InterruptedException {
        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement circle = driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(circle).moveByOffset(-75, 55).perform();
        WebElement blueBox = driver.findElement(By.xpath("//div[@class='test1']"));
        WebElement orangeBox= driver.findElement(By.xpath("//div[@class='test2']"));
        softAssert.assertEquals(blueBox.getText(), "Now you can drop it.");
        softAssert.assertEquals(orangeBox.getText(),"(Drop here)");
        actions.release().perform();
        softAssert.assertAll();
    }
}
