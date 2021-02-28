package selenium.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Instagram {

    @Test
            public void instagramAccount() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://www.instagram.com/accounts/emailsignup/");

        WebElement emailAddress= driver.findElement(By.xpath("//*[@aria-label='Mobile Number or Email']"));
        emailAddress.click();
        emailAddress.sendKeys("renasruken@gmail.com" + Keys.ENTER);

        WebElement fullName= driver.findElement(By.xpath("//*[@aria-label=\"Full Name\"]"));
        fullName.click();
        fullName.sendKeys("zisanzozan demir" +Keys.ENTER);

        WebElement userName= driver.findElement(By.xpath("//*[@aria-label='Username']"));
        userName.click();
        userName.sendKeys("zisanzozan63" +Keys.ENTER);

        WebElement password= driver.findElement(By.xpath("//*[@aria-label='Password']"));
        password.click();
        password.sendKeys("killasihlar63" +Keys.ENTER);

        WebElement signUp= driver.findElement(By.xpath("//*[@type='submit']"));
        signUp.click();


    }
}
