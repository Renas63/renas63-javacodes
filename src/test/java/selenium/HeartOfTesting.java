package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeartOfTesting {
    @Test
    public void test1(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        WebElement horizontalSliderLink= driver.findElement(By.xpath("//a[text()='Horizontal Slider']"));//TEXT METHOD
        horizontalSliderLink.click();
       WebElement header=  driver.findElement(By.xpath("//h3[contains(text(),'Horizontal Slider')]"));// CONTAINS METHOD

       String headerText= header.getText();
       String expectedHeader= "Horizontal Slider";

       // VALIDATE THE HEADER
       Assert.assertEquals(expectedHeader,headerText);




    }
}
