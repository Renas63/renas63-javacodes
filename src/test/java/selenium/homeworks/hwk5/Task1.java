package selenium.homeworks.hwk5;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.WebSocketListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {

    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        actions= new Actions(driver);

    }
    /*
    Navigate to "https://demos.telerik.com/kendo- ui/dragdrop/area"
Click and hold the blue circle
Move the circle left side of it
Validate blue and orange box are displayed (Drop here) text
     */
    @Test
    public void test1(){
        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        WebElement blueCircle= driver.findElement(By.id("draggable"));
        actions.clickAndHold(blueCircle).moveByOffset(-30,0).perform();

        WebElement blueBox= driver.findElement(By.xpath("//*[@class='test1']"));
        String message= "(Drop here)";
        Assert.assertEquals(blueBox.getText(),message);

        WebElement orangeBox= driver.findElement(By.xpath("//*[@class='test2']"));
        Assert.assertEquals(orangeBox.getText(),message);

    }
}
