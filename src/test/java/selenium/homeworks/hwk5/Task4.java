package selenium.homeworks.hwk5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task4 {
    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
    }
    /*
    +Navigate to "http://demo.guru99.com/test/drag_drop.html" Click and hold the first -5000
+Validate "Please select another block" is displayed
Drag and drop first 5000 to Debit side Amount
Validate "Debit Movement 5000 Credit Movement 0"
 Drag and drop Second 5000 to Credit side Amount
 Validate"Debit Movement 5000 Credit Movement 5000"
Drag and drop the "BANK" Debit side Account
Validate BANK is displayed
Drag and drop the "SALES" Credit side Account Validate SALES is displayed
     */
    @Test
    public void test4() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebElement first_5000= driver.findElement(By.xpath("//*[@id='credit']/child::a"));
        actions.clickAndHold(first_5000).moveByOffset(0,10).release().perform();
        WebElement anotherBlock= driver.findElement(By.xpath("//*[text()='Please select another block']"));
        Assert.assertEquals(anotherBlock.getText(),"Please select another block");
        Thread.sleep(2000);

        WebElement first5000= driver.findElement(By.xpath("//li[@id='fourth']/child::a[text()=' 5000 ']"));
        WebElement debitSide= driver.findElement(By.xpath("//*[@id='bank']/child::li"));
        actions.dragAndDrop(first5000,debitSide).perform();
       String str= "Debit Movement 5000 Credit Movement 0";
       Assert.assertEquals(debitSide.getText(),str);
        Thread.sleep(3000);

        WebElement second5000=driver.findElement(By.xpath("//*[@id='fourth']/a"));
        WebElement creditSite=driver.findElement(By.xpath("//*[@id='amt8']/li"));
        actions.dragAndDrop(second5000,creditSite).build().perform();
        Thread.sleep(3000);

        WebElement bank= driver.findElement(By.xpath("//*[@id='credit2']/a"));
        WebElement debitSide2= driver.findElement(By.xpath("//*[@id='bank']/li"));
        actions.dragAndDrop(bank,debitSide2).build().perform();
        Thread.sleep(3000);

        WebElement sales= driver.findElement(By.xpath("//*[@id='credit1']/a"));
        WebElement creditSide2= driver.findElement(By.xpath("//*[@id='loan']/li"));
        actions.dragAndDrop(sales,creditSide2).build().perform();
    }
   @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
