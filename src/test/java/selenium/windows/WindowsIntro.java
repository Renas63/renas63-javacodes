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

import java.util.Set;

public class WindowsIntro {

    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        actions= new Actions(driver);

    }
    @Test
    public void test1(){
        driver.get("https://google.com");
        WebElement searchBox= driver.findElement(By.name("q"));
        actions.sendKeys(searchBox,"java programming"+Keys.ENTER).perform();

        WebElement thirdLink= driver.findElement(By.xpath("//span[text()='Learn Java Programming - Programiz']"));
       // actions.keyDown (Keys.COMMAND).click(thirdLink).keyUp(Keys.COMMAND).perform(); open in new tab
        actions.keyDown (Keys.SHIFT).click(thirdLink).keyUp(Keys.SHIFT).perform(); //IT WILL OPEN IN NEW WINDOWS

        String currentWindowId= driver.getWindowHandle();
        Set<String> allWindowIds= driver.getWindowHandles();
        String newWindowId="";
        for (String id:allWindowIds) {
            if(!id.equals(currentWindowId)){
                newWindowId=id;
            }
        }
        driver.switchTo().window(newWindowId);
        WebElement header= driver.findElement(By.tagName("h1"));
        Assert.assertEquals(header.getText(),"Learn Java Programming");

        // switch to a first browser
        driver.switchTo().window(currentWindowId);
        WebElement fourthLink= driver.findElement(By.xpath("//span[.='Java (programming language) - Wikipedia']"));
        //open link in a new window
        actions.keyDown (Keys.SHIFT).click(fourthLink).keyUp(Keys.SHIFT).perform();

        allWindowIds= driver.getWindowHandles();
        String thirdWindowId="";
        for (String id : allWindowIds) {
            if (!id.equals(currentWindowId) && !id.equals(newWindowId)) {
                thirdWindowId=id;
                //it will switch to new window
                driver.switchTo().window(thirdWindowId);
            }
        }
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }
}
