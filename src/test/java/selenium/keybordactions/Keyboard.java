package selenium.keybordactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
    @Test
    public void allUpperCaseTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        WebElement searchField= driver.findElement(By.name("q"));
        Actions actions= new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(searchField,"techtorial academy").keyUp(Keys.SHIFT).perform();
        actions.keyDown(Keys.SHIFT).sendKeys(searchField,"t").keyUp(Keys.SHIFT).sendKeys(searchField,
                "echtorial academy" +Keys.ENTER).perform();


    }
    @Test
    public void copyPasteTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com");
       WebElement searchBar= driver.findElement(By.id("twotabsearchtextbox"));
       Actions actions= new Actions(driver);
       actions.sendKeys(searchBar, "java").keyDown(Keys.COMMAND).sendKeys("a").
               sendKeys("c").sendKeys("v").sendKeys("v").keyUp(Keys.COMMAND).perform();

    }
    @Test
    public void cutPasteTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        WebElement amazon = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions.sendKeys(amazon,"iphone 12")
                .keyDown(Keys.COMMAND)
                .sendKeys("a")
                .sendKeys("x")
                .sendKeys("v")
                .sendKeys("v")
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.ENTER)
                .perform();
    }

}
