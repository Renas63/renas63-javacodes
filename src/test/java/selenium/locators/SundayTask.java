package selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SundayTask {
    @Test
    public void googleNavigate(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.google.com/");
        String expectedURL="https://www.google.com/";
       String title= driver.getTitle();
       String expectedTitle= "Google";
       ;
        Assert.assertEquals(title,expectedTitle);
        Assert.assertEquals(expectedURL,driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));

        Assert.assertEquals(2,2);
        Assert.assertTrue(3>2);
        Assert.assertFalse(driver.getCurrentUrl().contains("facebook"));



        WebElement searchField= driver.findElement(By.xpath("//input[@name='q']"));
        searchField.click();
        searchField.sendKeys("selenium cookbook" + Keys.ENTER);

       // String Url= driver.getCurrentUrl();



    }
}
