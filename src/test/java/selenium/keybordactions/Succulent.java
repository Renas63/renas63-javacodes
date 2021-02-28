package selenium.keybordactions;

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

import java.util.*;

public class Succulent {

    WebDriver driver;
    Actions actions;
    SoftAssert softAssert;
    @BeforeMethod
            public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        actions= new Actions(driver);
        softAssert = new SoftAssert();

    }
    @Test
    public void succulentOnEtsy(){
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String actualTitle= driver.getTitle();
        String expectedTitle= "etsy";
       softAssert.assertEquals(actualTitle,expectedTitle);

       WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
       actions.keyDown(Keys.SHIFT).sendKeys(searchBox,"C").keyUp(Keys.SHIFT).sendKeys("andle"+Keys.ENTER).perform();

        List<WebElement>candleList= driver.findElements(By.xpath("//h3[@class='wt-text-truncate wt-mb-xs-0 wt-text-caption ']"));
        List<String> candleNames= new ArrayList<>();
        for(WebElement candle:candleList){
            candleNames.add(candle.getText());
        }
        List<WebElement> priceList= driver.findElements(By.xpath("//span[@class='currency-value']"));
        List<Integer> candlePrice= new ArrayList<>();
        for(WebElement priceElement:priceList){
            String temp= priceElement.getText();
            if(temp.contains(",")){
                temp= temp.replace(",","");
            }
            if(temp.isEmpty()){
                continue;
            }
            int intPrice= Integer.parseInt(temp);
            candlePrice.add(intPrice);
        }
        Map<String, Integer> candles= new LinkedHashMap<>();
        for (int i = 0; i <candleNames.size() ; i++) {
            candles.put(candleNames.get(i),candlePrice.get(i));
        }
        System.out.println("There is "+candleNames.size()+ " candles found on the first page");
        int index=1;
        for(String key:candles.keySet()){
            System.out.println(index+ " " + key+ " "+candles.get(key));
            index++;
            System.out.println();
        }
    }


}
