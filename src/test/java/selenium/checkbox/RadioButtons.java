package selenium.checkbox;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.get("https://www.etsy.com");
        WebElement searchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();
        Thread.sleep(3000);
        WebElement shipIn1Day = driver.findElement(By.xpath("//label[@for='max-processing-days-1']"));
        shipIn1Day.click();
        Thread.sleep(2000);
        shipIn1Day = driver.findElement(By.xpath("//label[@for='max-processing-days-1']/preceding-sibling::input"));
        Assert.assertTrue(shipIn1Day.isSelected());
        WebElement shipIn3Day = driver.findElement(By.xpath("//label[@for='max-processing-days-3']"));
        shipIn3Day.click();
        shipIn3Day = driver.findElement(By.xpath("//label[@for='max-processing-days-3']/preceding-sibling::input"));
        Assert.assertTrue(shipIn3Day.isSelected());
        //driver.close();

    }
    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement checkBox1= driver.findElement(By.xpath("//*[@id='bmwradio']"));
       // Assert.assertEquals(true,checkBox1.isSelected()); WE CAN SAY THAT TOO!
        Assert.assertFalse(checkBox1.isSelected());
        checkBox1.click();
    Assert.assertTrue(checkBox1.isSelected());
    WebElement checkBox2= driver.findElement(By.xpath("//*[@id='benzradio']"));
    Assert.assertFalse(checkBox2.isSelected());
    //Assert.assertEquals(false,checkBox2.isSelected());
    WebElement checkBox3= driver.findElement(By.xpath("//*[@id='hondaradio']"));
    Assert.assertFalse(checkBox3.isSelected());
    }
}