package selenium.screenshots;

import com.sun.org.apache.bcel.internal.generic.IFLE;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;

public class ScreenshotExample {
    WebDriver driver;
    Actions actions;
    ScreenshotIntro screenshotIntro;
    Select select;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
        screenshotIntro= new ScreenshotIntro();
    }
        @Test
        public  void herokuAppExample(){
           driver.get("https://the-internet.herokuapp.com/");
        takeScreenshot("herokuApp");

            WebElement checkBox= driver.findElement(By.xpath("//*[@href='/checkboxes']"));
            actions.click(checkBox).perform();
        WebElement checkBoxes= driver.findElement(By.xpath("//*[@id='checkboxes']/child::input[1]"));
        actions.click(checkBoxes).perform();


    }
    public void takeScreenshot(String screenShotName){
        File screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String screenShotDirectory= "renasScreenShot/";
        try{
            FileUtils.copyFile(screenShot,new File(screenShotDirectory+screenShotName+"-"+System.currentTimeMillis()));
        }catch(IOException exception){
            System.out.println("Screen shot was not taken");
        }

    }
}
