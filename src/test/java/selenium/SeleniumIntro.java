package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        WebElement searchField= driver.findElement(By.xpath("//input[@input='q']"));
        searchField.sendKeys("Selenium cookbook"+ Keys.ENTER);
        String googleTitle=driver.getTitle();
        System.out.println("Google search result page's title " +googleTitle);
    }
      @Test
    public void test2(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://etsy.com");
}
    @Test
    public void test3(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://techtorialacademy.com");
    }
    @Test
    public void test4(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webull.com");
    }

}
