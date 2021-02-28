package udemy.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
    @Test
            public void basicMethods(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/");
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());// validate if your page title is correct

        System.out.println(driver.getCurrentUrl());// validate if you are landed on correct url
        // there are some page that right click is disable. to come over this issue we will do that
       // System.out.println(driver.getPageSource()); // print page sources

        driver.get("https://yahoo.com");
        //driver.navigate().back();
        //driver.navigate().forward();
        driver.close();// close current browser
        //driver.quit();// it closes all browser opened by selenium script.
    }
    @Test
    public void facebookID(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/");
        WebDriver driver= new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("m.renas@hotmail.com");
        driver.findElement(By.id("pass")).sendKeys("12345");
        driver.findElement(By.linkText("Forgot Password?")).click();
        driver.findElement(By.id("identify_email")).sendKeys("m.renas@hotmail.com");
        driver.findElement(By.id("did_submit")).click();


    }


}
