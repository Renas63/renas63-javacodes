package selenium.iframe;

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

public class iFrameIntro {
    WebDriver driver;
    Actions actions;
    SoftAssert softAssert;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        softAssert = new SoftAssert();
        actions = new Actions(driver);
    }
        @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/");
            WebElement frames= driver.findElement(By.xpath("//*[@href='/frames']"));
            frames.click();
            WebElement iframes= driver.findElement(By.xpath("//*[@href='/iframe']"));
            iframes.click();

            driver.switchTo().frame("mce_0_ifr");// IMPORTANT METHOD TO GO INTO FRAMES
            WebElement textBox= driver.findElement(By.id("tinymce"));
            textBox.clear();
            textBox.sendKeys("Hello Techtorial");

            //driver.switchTo().parentFrame(); IT WILL TAKE ME TO PARENT FRAME!!!!
            driver.switchTo().defaultContent(); //both works to go back from iframe

            WebElement header= driver.findElement(By.tagName("h3"));
            System.out.println(header.getText());
        }
}
