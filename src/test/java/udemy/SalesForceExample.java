package udemy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceExample {
    @Test
    public void salesForce() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("12345");
        driver.findElement(By.id("Login")).click();
        //driver.findElement(By.className("button r4 wide primacy")).click();// no compound class name , no space
        driver.findElement(By.xpath("//*[@id='Login']")).click();// click on login and find right click and copy to xpath

     }
    @Test
    public void salesforce2(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("123456");
//driver.findElement(By.className("button r4 wide primary")).click();//Error
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
    }
}
