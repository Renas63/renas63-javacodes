package selenium.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class CommonUtils {

    public static void handleDDByText(WebElement dd, String text) {
        Select select = new Select(dd);
        select.selectByVisibleText(text);

    }

    public static void handleDDbByIndex(WebElement dd, int index) {
        Select select = new Select(dd);
        select.selectByIndex(index);
    }

    public static void handleDDByVaalue(WebElement dd, String value) {
        Select select = new Select(dd);
        select.selectByValue(value);
    }

    public static void hoverOver(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

    }

    public static void moveElement(WebDriver driver, WebElement elementSource, WebElement elementTarget) {
        Actions actions = new Actions(driver);
        actions.clickAndHold(elementSource).moveToElement(elementTarget).release().perform();

    }


    public static void switchWindows(WebDriver driver) {

        String currentWindow = driver.getWindowHandle();
        driver.getWindowHandles();
        Set<String> allWindowHandles = driver.getWindowHandles();
        String toSwitch = "";
        for (String handle : allWindowHandles) {
            if (!currentWindow.equals(handle)) {
                driver.switchTo().window(handle);
            }
        }
    }

    public static WebElement locateElement(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement myElement = wait.until(ExpectedConditions.visibilityOf(element));
        return myElement;
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView", element);
    }

    public static void scrollToButtom(WebDriver driver, String screenshotName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }

    public static void takeAsScreenshot(WebDriver driver, String screenshotName) {
        //takes screenshot
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destinationDirectory = "screenshot/";
        //copy taken screenshot to screenshot directory.
        try {
            FileUtils.copyFile(file,
                    new File(destinationDirectory + screenshotName + "-" + System.currentTimeMillis() + ".png"));
        } catch (IOException ex) {
            System.out.println("Failed to take Screenshot:" + ex.getStackTrace()); //print error message
            // getStackTrace());--> //print error message
        }
    }

    public static String readProperty(String fileName, String key) {
        File propFile = new File(fileName);
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(propFile));
        } catch (IOException exception) {
            throw new RuntimeException("Could not read from properties file " + fileName);
        }
        return properties.getProperty(key);
        // how to read properties files? we read from properties class
        // it has have a .properties extension
    }
}
