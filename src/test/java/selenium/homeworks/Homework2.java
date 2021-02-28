package selenium.homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    @Test
    public void id() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.guitarcenter.com/");
        WebElement idLink1 = driver.findElement(By.id("gcFooter"));
        idLink1.click();
        driver.get("https://www.guitarcenter.com/");
        WebElement idLink2 = driver.findElement(By.id("brand"));
        idLink2.click();
        WebElement idLink3 = driver.findElement(By.id("headerLogoWrap"));
        idLink3.click();
        WebElement idLink4 = driver.findElement(By.id("gc-header-tools"));
        idLink4.click();
        WebElement idLink5 = driver.findElement(By.id("brand-logo"));
        idLink5.click();
        driver.close();
    }
    @Test
    public void tagName() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        WebElement nameLink1 = driver.findElement(By.tagName("a"));
        nameLink1.click();
        driver.get("https://www.youtube.com/");
        WebElement nameLink2 = driver.findElement(By.tagName("h3"));
        nameLink2.click();
        driver.get("https://www.youtube.com/");
        WebElement nameLink3 = driver.findElement(By.tagName("h2"));
        nameLink3.click();
        driver.get("https://www.ebay.com/");
        WebElement nameLink4 = driver.findElement(By.tagName("h2"));
        nameLink4.click();
        driver.get("https://www.shopify.com/");
        driver.close();
    }
    @Test
    public void linkText() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        WebElement linkText1 = driver.findElement(By.linkText("Home & Living"));
        linkText1.click();
        driver.navigate().back();
        WebElement linkText2 = driver.findElement(By.linkText("Clothing & Shoes"));
        linkText2.click();
        WebElement linkText3 = driver.findElement(By.linkText("Jewelry & Accessories"));
        linkText3.click();
        WebElement linkText4 = driver.findElement(By.linkText("Wedding & Party"));
        linkText4.click();
        driver.get("https://www.etsy.com/");
        WebElement linkText5 = driver.findElement(By.linkText("Engagement rings"));
        linkText5.click();
        driver.close();
    }
    @Test
    public void partialLinkText() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shopify.com/");
        WebElement partialLinkText1 = driver.findElement(By.partialLinkText("BEAUTY"));
        partialLinkText1.click();
        driver.navigate().back();
        WebElement partialLinkText2 = driver.findElement(By.partialLinkText("COSMETICS"));
        partialLinkText2.click();
        driver.navigate().back();
        WebElement partialLinkText3 = driver.findElement(By.partialLinkText("Alfred"));
        partialLinkText3.click();
        driver.get("https://www.shopify.com/");
        WebElement partialLinkText4 = driver.findElement(By.partialLinkText("Explore more"));
        partialLinkText4.click();
        driver.get("https://www.shopify.com/");
        WebElement partialLinkText5 = driver.findElement(By.partialLinkText("Explore ways"));
        partialLinkText5.click();
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void name() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement name1 = driver.findElement(By.name("login"));
        name1.click();
        driver.get("https://www.facebook.com/");
        WebElement name2 = driver.findElement(By.name("pass"));
        name2.click();
        driver.get("https://www.facebook.com/");
        WebElement name3 = driver.findElement(By.name("email"));
        name3.click();
    }
}
