package Zoom;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

    @Test
    public void parcelSong(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/");
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));
        searchField.sendKeys(" Parcels I know how I feel " + Keys.ENTER);
      //  WebElement song= driver.findElement(By.xpath("//span[@class='\"j0joJb\"']"));
      //  song.click();

        driver.findElement(By.xpath("//div[@class='FGpTBd']//a")).click();
        driver.findElement(By.xpath("//button[@aria-label='Play (k)']")).click();


    }
    @Test
    public void linkedIn(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/");
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        WebElement search= driver.findElement(By.xpath("input[@name='q']"));
        search.sendKeys("LinkedIn " + Keys.ENTER);
       // driver.findElement(By.xpath())
    }
}
