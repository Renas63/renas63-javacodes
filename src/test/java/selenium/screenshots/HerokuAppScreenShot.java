package selenium.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class HerokuAppScreenShot {

    WebDriver driver;
    Actions actions;
    ScreenshotIntro screenshotIntro;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        screenshotIntro = new ScreenshotIntro();
        actions= new Actions(driver);
    }

    @Test
    public void herokuApp() throws IOException {
        driver.get("https://the-internet.herokuapp.com/");
        takeScreenShot("herokuApp");
        WebElement horizontalSlider = driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        actions.click(horizontalSlider).perform();

        WebElement slider = driver.findElement(By.tagName("input"));
        actions.clickAndHold(slider).moveByOffset(-25, 0).release().perform();
        takeScreenShot("horizontalSliderMoved");

        WebElement range= driver.findElement(By.id("range"));
        Assert.assertEquals(range.getText(),"1.5");
    }

    public void takeScreenShot(String screenshotName) {
        // takes screenshot
        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        String screenShotDirectory = "screenshot/";
        try {
            FileUtils.copyFile(screenShot, new File(screenShotDirectory + screenshotName + "-" + System.currentTimeMillis() + ".png"));
        } catch (IOException ex) {
            System.out.println("Screen shot was not taken");

        }
    }
}