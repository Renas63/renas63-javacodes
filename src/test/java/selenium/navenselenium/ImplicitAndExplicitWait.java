package selenium.navenselenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitAndExplicitWait {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

    }
    @Test
    public void test1(){
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        // Implicitly wait--> is always applied globally--> is available for all webelements
        // dynamic in nature
        //it can be changed any time and any where in my code

        driver.get("https://www.facebook.com/r.php");
        WebElement firstName= driver.findElement(By.name("firstname"));
        WebElement lastName= driver.findElement(By.name("lastname"));

        WebElement mobileNum= driver.findElement(By.name("reg_email__"));
        WebElement password= driver.findElement(By.name("reg_passwd__"));

        SendKeys(driver,firstName,10,"Tom");
        SendKeys(driver,lastName,10,"Vanlue");
        SendKeys(driver,mobileNum,10,"6178722114");
        SendKeys(driver,password,15,"vanlue123");


//        WebElement forgotAccount= driver.findElement(By.linkText("Forgotten account?"));
//        clickOn(driver,forgotAccount,10);

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    //Explicit wait: 1.no explicit keyword or method
    // 2. available only with WebDriverWait wit some ExpectedConditons
    //3.specific yo element
    //4. dynamic in nature
    //5. we should neve use implicit and explicit wait together
    // selenium WD will wait for the element first bc of IMPLICIT WAIT and then
    //EXPLICIT WAIT will be applied.
    // hence, total sync wait will be increased for each element
    public static void SendKeys(WebDriver driver,WebElement element, int timeout, String value){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
    public static void clickOn(WebDriver driver, WebElement element,int timeout){
        new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
