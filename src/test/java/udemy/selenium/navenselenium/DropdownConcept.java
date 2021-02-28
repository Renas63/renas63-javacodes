package udemy.selenium.navenselenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropdownConcept {
    @Test
    public void dropdown(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("http://jqueryui.com/droppable/");
        driver.switchTo().frame(0);// switch to frame if its present

        Actions actions= new Actions(driver);
        actions.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).
                moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).
                release().perform();
    }
}
