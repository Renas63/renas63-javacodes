package selenium.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DropDownIntro {
    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 1");// its not static. its a string


    }

    @Test
    public void test1() {// 1. METHOD: selectByVisibleText
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement allDropdown = driver.findElement(By.xpath("//*[@title='Search in']"));
        Select select = new Select(allDropdown);
        select.selectByVisibleText("Books");


    }

    @Test
    public void test2() {// 2. METHOD: selectByIndex---> it starts from 0 zero
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select allDropDown = new Select(dropdown);
        allDropDown.selectByIndex(1);
    }

    @Test
    public void test3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select dropDownHandler = new Select(dropdown);
        List<WebElement> listOfOptions = dropDownHandler.getOptions();
        for (WebElement option : listOfOptions) {
            System.out.println(option.getText());
        }

    }

    @Test
    public void test4Amazon() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement allDropdown = driver.findElement(By.xpath("//*[@title='Search in']"));
        Select dropdownAll = new Select(allDropdown);
        List<WebElement> listOfAll = dropdownAll.getOptions();

        for (WebElement option : listOfAll) {
            System.out.println(option.getText());
        }
        System.out.println("Total count is " + listOfAll.size());
    }

    @Test
    public void test5() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letskodeit.teachable.com/p/practice");
        WebElement dropdown = driver.findElement(By.id("carselect"));
        Select dropdownHandler = new Select(dropdown);
        dropdownHandler.selectByVisibleText("Honda");
        WebElement selectedOption = dropdownHandler.getFirstSelectedOption();
        assertEquals("Honda", selectedOption.getText());


    }

    @Test
    public void test6() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement dropdownOption= driver.findElement(By.xpath("//*[@aria-describedby='searchDropdownDescription']"));
        Select dropdownHandler= new Select(dropdownOption);
        dropdownHandler.selectByValue("search-alias=instant-video");
        WebElement selectedOption= dropdownHandler.getFirstSelectedOption();
        assertEquals("Prime Video",selectedOption.getText());

    }
    @Test
    public void test7() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));
        Select dropDownHandler=new Select(dropDown);
        dropDownHandler.selectByValue("search-alias=instant-video");
        WebElement firstSelected=dropDownHandler.getFirstSelectedOption();
        assertEquals("Prime Video",firstSelected.getText());
    }
}