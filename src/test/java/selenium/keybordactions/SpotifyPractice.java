package selenium.keybordactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpotifyPractice {
    @Test
    public void spotify(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.spotify.com/us/");
        WebElement loginOption= driver.findElement(By.xpath("//*[@href='/login/?continue=https://www.spotify.com/api/growth/l2l-redirect']"));
        loginOption.click();
        WebElement username= driver.findElement(By.id("login-username"));
        username.sendKeys("m.renas@hotmail.com " + Keys.ENTER);
        WebElement password= driver.findElement(By.xpath("//*[@type='password']"));
        password.sendKeys("renasruken63");
        WebElement loginClick= driver.findElement(By.xpath("//*[@id='login-button']"));
        loginClick.click();
    }
}
