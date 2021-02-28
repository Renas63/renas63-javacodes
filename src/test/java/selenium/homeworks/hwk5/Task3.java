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

public class Task3 {
    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        actions= new Actions(driver);

    }
    /*
    Navigate to "https://demos.telerik.com/kendo-ui/dragdrop/area"
Click and hold the blue circle
Move the circle on top of Orange box
Validate "Now you can drop it." text is displayed in orange box
Validate Blue box has (Drop here) text
     */
    @Test
    public void test3() throws InterruptedException {
        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement blueCircle= driver.findElement(By.id("draggable"));
        WebElement orangeBox= driver.findElement(By.xpath("//*[@class='test2']"));
        actions.clickAndHold(blueCircle).moveToElement(orangeBox).perform();
        String text="Now you can drop it";
       Assert.assertTrue(driver.getPageSource().contains(text));

       WebElement blueBox= driver.findElement(By.xpath("//*[@class='test1']"));
       String text1= "(Drop here)";
       Assert.assertEquals(blueBox.getText(),text1);
    }
}
