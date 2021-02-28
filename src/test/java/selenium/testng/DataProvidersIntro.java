package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProvidersIntro {

    protected WebDriver driver;
    protected Actions actions;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        actions=new Actions(driver);
    }
    @AfterClass
    public void clean() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }
    @Test
    @Parameters({"MRSusername","MRSpassword"})
    public void testData(String username, String password) throws InterruptedException {
        driver.get("https://demo.openmrs.org/openmrs");
        WebElement location=driver.findElement(By.id("Inpatient Ward"));
        location.click();
        WebElement emailBox=driver.findElement(By.id("username"));
        emailBox.sendKeys(username);
        WebElement passwordBox=driver.findElement(By.id("password"));
        passwordBox.sendKeys(password);
        WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        WebElement logout=driver.findElement(By.xpath("//li[@class='nav-item logout']"));
        Assert.assertTrue(logout.isDisplayed());
        Thread.sleep(3000);
        logout.click();
    }
    @Test (dataProvider = "MRSTestData")
    public void testData2(String username, String password) throws InterruptedException {
        driver.get("https://demo.openmrs.org/openmrs");
        WebElement location = driver.findElement(By.id("Inpatient Ward"));
        location.click();
        WebElement emailBox = driver.findElement(By.id("username"));
        emailBox.sendKeys(username);
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys(password);
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
    }
    @DataProvider(name="MRSTestData")
    public Object [][] getTestData(){
        return new Object[][]{
                {"admin123","invalidPassword"},
                {"Admin","admin"},
                {"invalidEmail","password"},
                {"",""},
                {"AdmiN","123admin"}};
    }

}