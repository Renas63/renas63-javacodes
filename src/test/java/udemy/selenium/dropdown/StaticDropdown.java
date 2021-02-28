package udemy.selenium.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise");

        WebElement staticDropdown= driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
        Select dropdown= new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());

    }
//    @Test
//    public void click5Times() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver= new ChromeDriver();
//        driver.get("http:/spicejet.com");
//        driver.findElement(By.id("divpaxinfo")).click();
//        Thread.sleep(2000);
//        for (int i = 1; i <5; i++) {                      ==>  THIS IS FOR MULTIPLE CLICK!!!
//            driver.findElement(By.id("hrefIncAdt")).click();
//
//
//        }
//        driver.findElement(By.id("btnclosepaxoption")).click();
//    }
}
