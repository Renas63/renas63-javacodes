package selenium.locators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Locator1 {
    @Test
    public void test1(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/");
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com");
         WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Iphone 12"+ Keys.ENTER);
//        WebElement iphone=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
//        iphone.click();
//        WebElement title= driver.findElement(By.xpath("//span[@id='productTitle']"));
//        String text= title.getText();
//        System.out.println(text);
    }
    @Test
    public void javaBook(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver/");
        WebDriver driver= new ChromeDriver();
        driver.get("https://etsy.com");
        WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("Java Book" +Keys.ENTER);
        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        driver.close();

    }
    @Test
    public void nameLocator(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        WebElement firstNameField= driver.findElement(By.name("Firstname"));
        firstNameField.sendKeys("Temirlan");
    }

    @Test
    public void tagNameLocator(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement abtestLink= driver.findElement(By.xpath("//a[@href='/abtest']"));
        abtestLink.click();
        WebElement abtestHeader= driver.findElement(By.tagName("h3"));

        System.out.println(abtestHeader.getText());
        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        driver.close();
    }
    @Test
    public void headerPrint(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement horizantalSlider= driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
        horizantalSlider.click();

        WebElement header= driver.findElement(By.tagName("h3"));

        WebElement subHeader = driver.findElement(By.tagName("h4"));

        System.out.println(header.getText());
        System.out.println(subHeader.getText());
    }
    @Test
    public void linkTextTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        WebElement abtestLink= driver.findElement(By.linkText("A/B Testing"));
        abtestLink.click();
    }
    /*
    1. Navigate to herokuapp home page
2. Print out the title and url of home page
3. Go to "Forgot Password" page (by link text)
4. Print out the Header (by tag name)
5. Navigate back to home page
6. Go to Hovers page(by link text)
7. Navigate back to home page
8. Print verify the current url matches the url from step 2
     */
    @Test
    public void forgotPassword(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        WebElement title= driver.findElement(By.tagName("h1"));
        System.out.println(title);
        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
         WebElement element= driver.findElement(By.linkText("Forgot Password"));
         element.click();
         WebElement header= driver.findElement(By.tagName("h2"));
        System.out.println(header.getText());
        driver.navigate().back();
        WebElement hoversLink = driver.findElement(By.linkText("Hovers"));
        hoversLink.click();
        //driver.navigate().back();
        driver.get("https://the-internet.herokuapp.com");// to go to back
        String url2= driver.getCurrentUrl();
        if(currentUrl.equalsIgnoreCase(url2)){
            System.out.println("test is passed");
        }else{
            System.out.println("Test is failed");
        }
    }
    @Test
    public void partialLinkTextTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
       WebElement sliderLink= driver.findElement(By.partialLinkText("Slider"));
        sliderLink.click();
    }
    @Test
    public void classNameTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        WebElement horizontalSliderLink= driver.findElement(By.partialLinkText("Horiz"));
        horizontalSliderLink.click();
        WebElement subHeader= driver.findElement(By.className("subheader"));

        System.out.println(subHeader.getText());

    }
}
