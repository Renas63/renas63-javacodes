package selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAdvance {
    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement firstCheckBox= driver.findElement(By.xpath("//*[@type='checkbox']/preceding-sibling::input"));
        firstCheckBox.click();

        boolean isChecked= firstCheckBox.isSelected();

        if(!isChecked){
            firstCheckBox.click();
            Assert.assertTrue(isChecked);
        }

    }
    @Test
    public void secondCheckBox(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement secondCheckBox= driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::input"));
        secondCheckBox.click();
        boolean isChecked= secondCheckBox.isSelected();
        if(isChecked){
            secondCheckBox.click();
        }
        Assert.assertFalse(isChecked);

        driver.close();

    }
    @Test
    public void test3(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement firstCheckBox= driver.findElement(By.xpath("//*[@type='checkbox']/preceding-sibling::input"));
        firstCheckBox.click();

        boolean isChecked1= firstCheckBox.isSelected();

        if(!isChecked1){
            firstCheckBox.click();
            Assert.assertTrue(isChecked1);
        }
        WebElement secondCheckBox= driver.findElement(By.xpath("//input[@type='checkbox']/following-sibling::input"));
        secondCheckBox.click();
        boolean isChecked2= secondCheckBox.isSelected();
        if(isChecked2){
            secondCheckBox.click();
        }
        Assert.assertFalse(isChecked2);

    }
}
