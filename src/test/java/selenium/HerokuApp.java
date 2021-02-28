package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuApp {
    @Test
    public void abtest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        WebElement searchField = driver.findElement(By.xpath("//input[@input='q']"));

        WebElement abTestLink = driver.findElement(By.xpath("//a[@href='/abtest']"));
        abTestLink.click();
        String title = driver.getTitle();
        System.out.println("Ab test page's title " + title);

    }

    @Test
    public void dropDownTest() {
        // provide chrome driver location
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        // instantiate chrome browser object
        WebDriver driver = new ChromeDriver();
        // navigate to website
        driver.get("https://the-internet.herokuapp.com");
        // locate web element
        WebElement dropdownLink = driver.findElement(By.xpath("//a]@href='/dropdown']"));
        String dropdownText = dropdownLink.getText();
        System.out.println(dropdownText);// help us to get a text from website
    }

    @Test
    public void brokenImages() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        // instantiate chrome browser object
        WebDriver driver = new ChromeDriver();
        // navigate to website
        driver.get("https://the-internet.herokuapp.com");
        // locate web element
        WebElement brokenImages = driver.findElement(By.xpath("//meta[@charset='utf-8']"));
        String brokenImagesText = brokenImages.getText();
        System.out.println(brokenImagesText);// help us to get a text from website
    }

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().fullscreen();// maximize the browser

        //driver.quit(); its not good to use this method bc you want to see if there is any problem.
        // it will close whole browser
        driver.close();// it closes current tab

        //getTitle--> to find title of the page
    }
    @Test
    public void navigation(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().fullscreen();// maximize the browser
    WebElement abtestLink= driver.findElement(By.xpath("//a]@href='/dropdown']"));
    abtestLink.click();
    String abtestTitle= driver.getTitle();

    driver.navigate().back();// to navigate back

    WebElement checkboxesLink=driver.findElement(By.xpath("//a[@href=checkboxes']"));
    checkboxesLink.click();
    String checkboxesTitle= driver.getTitle();// to get title of checkboxes
        System.out.println(abtestTitle);
        System.out.println(checkboxesTitle);

    }
}

