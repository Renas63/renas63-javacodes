package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpath {
    @Test
    public void absoluteXpath(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        //locate Horizontal Slider
        WebElement horizontalSliderLink= driver.findElement(By.linkText("Horizontal Slider"));
        horizontalSliderLink.click();
        WebElement header= driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));
        System.out.println(header.getText());

        Assert.assertEquals("Temirlan","Temirlan");
        Assert.assertEquals(21,21);
        // Assert is static so we dont have a create an object to call Assert!!!!
        Assert.assertEquals(1.9,1.9);
        String textFromPage= "temrialantechtorial";
        Assert.assertTrue(textFromPage.contains("techtoraialacademy"));
    }


}
