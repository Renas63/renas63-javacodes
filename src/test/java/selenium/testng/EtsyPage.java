package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import selenium.utils.Base;

import java.util.List;

public class EtsyPage extends Base {
    WebDriver driver;
    SoftAssert softAssert;
    @BeforeMethod
    public void setUp () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        softAssert= new SoftAssert();
    }

    @Parameters({"search"}) // PARAMETERS
    // we can have a parameter if we have @Parameters annotation
    @Test
    public void parametersTest(String javaProgramingMug) {

        driver.navigate().to("https://etsy.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("etsy"));
        WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys(javaProgramingMug+ Keys.ENTER);
         //driver.findElement(By.xpath("//button[@value='Search")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("java"));

        List<WebElement> item= driver.findElements(By.xpath("//h3[@class='text-gray text-truncate mb-xs-0 text-body ']"));
        String[]strArr= javaProgramingMug.split(" ");
        String java= strArr[0];
        String programing= strArr[1];
        String mug= strArr[2];
        for (WebElement itemLink:item){

           String temp=itemLink.getText();
            System.out.println(temp);

           softAssert.assertTrue(temp.contains(java)||temp.contains(programing)||
                   temp.contains(mug));
       }
       //softAssert.assertAll();
    }
}