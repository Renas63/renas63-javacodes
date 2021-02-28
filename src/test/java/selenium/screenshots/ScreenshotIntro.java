package selenium.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotIntro {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void screenShot2() {
        driver.get("https://etsy.com");
        Assert.fail();
    }
    @AfterMethod
    public void cleanUp(ITestResult result) {
        result.isSuccess();
        if (!result.isSuccess()) {
            takeScreenShot(result.getName());
        }
        driver.quit();
    }
    @Test
    public void screenshotTest(String screenshotName) throws IOException {

        driver.get("http://techtorialacademy.com");
        //upcasting and downcasting means implicit and explicit
        File firstScreenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotFolder = "screenshot/";
        FileUtils.copyFile(firstScreenShotFile, new File(screenshotFolder + "myScreenshot-" + System.currentTimeMillis() + ".png"));
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
