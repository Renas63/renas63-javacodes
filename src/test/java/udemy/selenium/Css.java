package udemy.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        // Css== tagname[attribute='value']
        // css== [class='identity first']
        // xpath== //*[@class= 'identity first']
        driver.get("https::/login.salesforce.com/");
        driver.findElement(By.cssSelector("input[id='username'")).sendKeys("renass");
        driver.findElement(By.cssSelector("//input[@id='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@id='Login'")).click();

        driver.findElement(By.cssSelector("#Login"));
        // if the tagname is id,  we can use " # " hashtag ---> #passord
        // if the tagname is class , we can use " . " dot------> .classname
        // NOTE: if there is a space between class name use " . " dot


    }
}
