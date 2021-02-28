import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    @Test
    public void task1() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        WebElement userNameLink = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userNameLink.sendKeys("Tester");
        WebElement passwordLink= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passwordLink.sendKeys("test");
        WebElement loginLink= driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginLink.click();

        WebElement actualViewOrders= driver.findElement(By.xpath("//a[@href='Default.aspx']"));
        WebElement allProducts= driver.findElement(By.xpath("//a[@href='Products.aspx']"));
        WebElement orders= driver.findElement(By.xpath("//a[@href='Process.aspx']"));
//        String expectedViewOrders= actualViewOrders.getAttribute("href");
//        System.out.println(" Href: "+expectedViewOrders);


        Assert.assertTrue("TEST HAS FAILED",actualViewOrders.getAttribute("href").endsWith("Default.aspx"));//a[@href='Process.aspx']
        Assert.assertTrue("TEST HAS FAILED",actualViewOrders.getAttribute("href").endsWith("Products.aspx"));//a[@href='Process.aspx']
        Assert.assertTrue("TEST HAS FAILED",actualViewOrders.getAttribute("href").endsWith("Process.aspx"));//a[@href='Process.aspx']
        driver.close();

    }
}