package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization2 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();
        driver= new FirefoxDriver();

    }
    @Parameters({"email", "gender"})
    @Test
    public void test(String myEmail, String myGender){
        System.out.println("Email is " +myEmail);
        System.out.println("Gender is " +myGender);

        driver.get("https://google.com");
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys(myEmail + Keys.ENTER);


    }
}
