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

import java.util.List;

public class EtsyZebraPlant {
    WebDriver driver;
    SoftAssert softAssert;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        softAssert = new SoftAssert();
    }
    @Parameters({"search"})
    @Test
    public void zebraTest(String zebraplant){
        driver.navigate().to("https://www.etsy.com/");
        Assert.assertTrue(driver.getCurrentUrl().contains("etsy"));
        WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("zebraplant"+ Keys.ENTER);
        Assert.assertTrue(driver.getCurrentUrl().contains("zebra"));

        List<WebElement> item= driver.findElements(By.xpath("//h3[@class='text-gray text-truncate mb-xs-0 text-body ']"));
        String []strArr=zebraplant.split(" ");
        String zebra=strArr[0];
        String plant= strArr[1];

        for (WebElement itemLink:item) {
            String temp=itemLink.getText();
            System.out.println(temp);
            SoftAssert softAssert= new SoftAssert();
            softAssert.assertTrue(temp.contains("zebra")||temp.contains("plant"));

        }

    }
}