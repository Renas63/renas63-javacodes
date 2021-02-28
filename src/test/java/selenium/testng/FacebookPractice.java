package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FacebookPractice {
    private WebDriver  driver;
    Actions actions;
    SoftAssert softAssert;

    @BeforeMethod
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        actions= new Actions(driver);

    }
    @Test
    public  void signUp() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        WebElement createAccount= driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("zisanzozan"+ Keys.ENTER);
        WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Demir");
        WebElement email= driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("zisanzozan63@gmail.com"+Keys.ENTER);
        WebElement reenterEmail= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        reenterEmail.sendKeys("zisanzozan63@gmail.com"+Keys.ENTER);
        WebElement password= driver.findElement(By.xpath("//*[@id='password_step_input']"));
        password.sendKeys("fatmahekim63"+Keys.ENTER);

        WebElement birthday= driver.findElement(By.xpath("//*[@name='birthday_age']"));
        birthday.sendKeys("18");
        WebElement gender= driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();
        WebElement signUp= driver.findElement(By.xpath("//button[@name='websubmit']"));
        signUp.click();



        Thread.sleep(1000);
        WebElement okClick= driver.findElement(By.xpath("//button[text()='OK']"));
        actions.click(okClick).perform();

    }
}
