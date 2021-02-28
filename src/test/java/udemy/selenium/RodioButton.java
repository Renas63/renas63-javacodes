package udemy.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RodioButton {

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
         WebDriver driver= new ChromeDriver();
         driver.get("https://www.cars.com/for-sale/searchresults.action/?mdId=21165&mkId=20041&rd=20&searchSource=QUICK_FORM&zc=60016");

         WebElement shopFromHome= driver.findElement(By.xpath("//*[@id=\"location\"]/following-sibling::li[1]/child::ul/child::li/following-sibling::li"));
        shopFromHome.click();
        Assert.assertEquals(true,shopFromHome.isSelected());



    }
}
