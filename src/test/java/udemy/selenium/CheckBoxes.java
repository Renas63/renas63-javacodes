package udemy.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckBoxes {
    @Test
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cars.com/");
        WebElement newOrUsed = driver.findElement(By.xpath("//*[@name='stockType']"));
        Select dropdownAll1 = new Select(newOrUsed);
//    List<WebElement> listOfAll = dropdownAll.getOptions();
        dropdownAll1.selectByIndex(1);

        WebElement price = driver.findElement(By.xpath("//*[@value='10000']"));
        price.click();
        WebElement makes = driver.findElement(By.xpath("//*[@name='makeId']"));
        Select dropdownAll2 = new Select(makes);
        List<WebElement> listOfOptions = dropdownAll2.getOptions();
        for (WebElement option : listOfOptions) {
            System.out.println(option.getText());
        }
        dropdownAll2.selectByIndex(4);

        WebElement distance = driver.findElement(By.xpath("//*[@name='radius']"));
        Select dropdownAll3 = new Select(distance);
        dropdownAll3.selectByIndex(0);

        WebElement zipcode = driver.findElement(By.xpath("//*[@name='zip']"));
        zipcode.sendKeys("60641 ");

        Select dropdown4 = new Select(driver.findElement(By.name("modelId")));
        dropdown4.selectByIndex(5);

        WebElement searchButton = driver.findElement(By.xpath("//*[@value='Search']"));
        Thread.sleep(3000);
        searchButton.click();
        Assert.assertTrue(searchButton.isSelected());


    }
}