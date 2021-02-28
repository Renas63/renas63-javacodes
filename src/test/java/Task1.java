import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    @Test
    public void task1(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver= new ChromeDriver();

     driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

     String expectedTitle="Web Orders Login";
        String actualTitle=driver.getTitle();
        System.out.println("Home Page " +actualTitle);
        System.out.println("Web Page " + expectedTitle);
        Assert.assertEquals(expectedTitle,actualTitle);

        WebElement userNameLink = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
     userNameLink.sendKeys("Tester");
     WebElement passwordLink= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
     passwordLink.sendKeys("test");
     WebElement loginLink= driver.findElement(By.id("ctl00_MainContent_login_button"));
     loginLink.click();

     String expectedTitle1="Web Orders";
     String actualTitle1= driver.getTitle();
        System.out.println("expectedTitle1"+expectedTitle1);
        System.out.println("actualTitle1" +actualTitle1);
        Assert.assertEquals(expectedTitle1,actualTitle1);

        WebElement viewLink= driver.findElement(By.xpath("//a[@href='Default.aspx']"));

        String expectedViewLink=driver.getCurrentUrl();
        String actualViewLink= "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";

        WebElement headerLink= driver.findElement(By.tagName("h2"));
        String actualHeader=headerLink.getText();
        String expectedHeader= "List of All Orders";
       Assert.assertEquals(actualHeader,expectedHeader);
        driver.close();

    }

}
