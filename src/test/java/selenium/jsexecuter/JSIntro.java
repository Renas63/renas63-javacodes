package selenium.jsexecuter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSIntro {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

    }
    @Test
    public void test1(){
        JavascriptExecutor js=  (JavascriptExecutor) driver;
        js.executeScript("window.location='https://amazon.com'");
        WebElement searchBar=(WebElement)js.executeScript("return.document.getElementById('twotabsearchtextbox')");
        //searchBar.sendKeys("iphone 12");
        js.executeScript("return.document.getElementById('twotabsearchtextbox').value='Searching for a Java Book'");
    }
    @Test
    public void scrollDown(){
        driver.get("https://amazon.com");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        // if we want to scrollDown half of the page===> 0, document.body.scrollHeight/2
    }
    @Test
    public void scrollDown2(){
        driver.get("https://amazon.com");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement mustSeeDeal= driver.findElement(By.xpath("//h2[.='Must-see fashion deals']"));

        js.executeScript("arguments[0].scrollIntoView();",mustSeeDeal);
        // arguments[0]--- array index, first index of the element we want to search for
    }
}
