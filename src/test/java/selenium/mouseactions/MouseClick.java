package selenium.mouseactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseClick {
    @Test
    public void test1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement abTestingLink = driver.findElement(By.linkText("A/B Testing"));

        Actions actions = new Actions(driver);
        actions.click(abTestingLink).perform();// click is overloading method!!!!
        // when we use actions class, we have to use .perform in the end!!! in order to action happen1
        // this is a Interview Question!!!!
    }

    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement contextMenuLink = driver.findElement(By.partialLinkText("Context Menu"));
        Actions actions = new Actions(driver);
        actions.click(contextMenuLink).perform();

        WebElement rectangle = driver.findElement(By.id("hot-spot"));
        actions.contextClick(rectangle).perform();
    }

    @Test
    public void test3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement horizontalSliderLink = driver.findElement(By.partialLinkText("Horizontal"));
        Actions actions = new Actions(driver);
        actions.click(horizontalSliderLink).perform();

        WebElement slider = driver.findElement(By.xpath("//*[@type='range']"));
        actions.clickAndHold(slider).moveByOffset(50, 0).release().perform();


    }

    @Test
    public void test4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement hoversLink = driver.findElement(By.linkText("Hovers"));
        Actions actions = new Actions(driver);
        actions.click(hoversLink).perform();
        WebElement thirdAvatar = driver.findElement(By.xpath("//h5[text()='name: user3']/../preceding-sibling::img"));
        // hover over the user3 avatar
        actions.moveToElement(thirdAvatar);

        WebElement user3Name = driver.findElement(By.xpath("//h5[.()='name: user3']"));
        boolean isUser3Displayed = user3Name.isDisplayed();
        // verify user3 username is  visible
        Assert.assertTrue(isUser3Displayed);// ask the problem

    }

    @Test
    public void draggableElements1() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.primefaces.org/showcase/ui/dnd/draggable.xhtml?jfwid=266b6");
        WebElement draggableElement1 = driver.findElement(By.id("pnl_header"));
        Actions actions = new Actions(driver);

        actions.dragAndDropBy(draggableElement1, 200, -100).perform();
    }

    @Test
    public void draggableElements2Task() {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.primefaces.org/showcase/ui/dnd/draggable.xhtml?jfwid=266b6");
        WebElement draggableElement2 = driver.findElement(By.id("pnl_header"));
        WebElement destinationElement= driver.findElement(By.id("handlepnl_content"));
        Actions actions= new Actions(driver);
        actions.dragAndDrop(draggableElement2,destinationElement).perform();
    }
    @Test
    public void doubleClick(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver firefox= new FirefoxDriver();
        firefox.get("http://demo.guru99.com/test/simple_context_menu.html");
        String currentTitle= firefox.getTitle();
        Assert.assertEquals("Simple Context Menu",currentTitle);// simple context menu is for TITLE!!!
        WebElement doubleClickBt= firefox.findElement(By.xpath("//*[@ondblclick='myFunction()']"));

        Actions actions= new Actions(firefox);
        actions.doubleClick(doubleClickBt).perform();
    }
}