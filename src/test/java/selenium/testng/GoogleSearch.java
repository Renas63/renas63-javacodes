package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class GoogleSearch {
    WebDriver driver;
    SoftAssert softAssert;
    Actions actions;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        softAssert=new SoftAssert();
    }
    @Test
    public  void ocaCertificate() throws InterruptedException {
        driver.get("https://www.google.com/");
        String actualTitle= driver.getTitle();
        String expectedTitle= "Google";
         softAssert.assertEquals(actualTitle,expectedTitle);
        actions= new Actions(driver);
        softAssert.assertEquals(driver.getTitle(),"Google");
        WebElement search= driver.findElement(By.xpath("//*[@name='q']"));
        search.sendKeys("java oca certification" +Keys.ENTER);

        Thread.sleep(2000);
       softAssert.assertTrue(driver.getCurrentUrl().contains("google"));
        WebElement result= driver.findElement(By.id("result-stats"));
        String resultText= result.getText();
        System.out.println(resultText);
        softAssert.assertAll();

        String [] array= resultText.split(" ");
        String resultNum= array[1].replace(",","");
        int endResult= Integer.parseInt(resultNum);
        softAssert.assertTrue(endResult>1000);
        softAssert.assertAll("Good job!");
    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }
}
