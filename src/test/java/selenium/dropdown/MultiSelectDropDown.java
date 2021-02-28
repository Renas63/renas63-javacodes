package selenium.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class MultiSelectDropDown {

    @Test
    public void test1(){
        WebDriverManager .chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://letskodeit.teachable.com/p/practice");
       WebElement multiOptionDD= driver.findElement(By.id("multiple-select-example"));
        Select ddHandler= new Select(multiOptionDD);
       boolean isMultiSelect= ddHandler.isMultiple();
        if(isMultiSelect){
            ddHandler.selectByIndex(0);
            ddHandler.selectByIndex(1);

        }
    }
    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://letskodeit.teachable.com/p/practice");
        WebElement dd= driver.findElement(By.id("multiple-select-example"));
        Select select= new Select(dd);
        boolean isMultiSelect= select.isMultiple();
        if(isMultiSelect){
            select.selectByValue("apple");
            select.selectByValue("peach");
        }
        List<WebElement> selectedOptionList= select.getAllSelectedOptions();
        // fail fast approach is important to validate the total number of selected options FIRST
        // before validating the selected values
        Assert.assertEquals(2, selectedOptionList.size());// FAIL FAST APPROACH example unit testing

        List<String> expectedValues=new ArrayList<>();
        expectedValues.add("Apple");
        expectedValues.add("Peach");

        for(WebElement element:selectedOptionList){
            Assert.assertTrue(expectedValues.contains(element.getText()));
        }
    }
    @Test
    // deselect option only work with multi select dropdown situation!!!!!
    public void test3() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://letskodeit.teachable.com/p/practice");
        WebElement dd= driver.findElement(By.id("multiple-select-example"));
        Select ddHandler= new Select(dd);

        ddHandler.selectByVisibleText("Orange");
        ddHandler.selectByVisibleText("Peach");
        Thread.sleep(3000);
        ddHandler.deselectByVisibleText("Orange");
        ddHandler.deselectAll();
    }
}
