package selenium.alertAndPopUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HwkHeroku {
    /*
    Implement 5 tests:
1. Navigate to https://the-internet.herokuapp.com/
2. click on javascript alerts link
3. click on every alert button
4. validate the result text under Result:
     */
    WebDriver driver;
    Actions actions;
    SoftAssert softAssert;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        softAssert= new SoftAssert();
        actions= new Actions(driver);

    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        softAssert.assertTrue(driver.getTitle().contains("Heroku"));

        WebElement javaAlerts= driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        actions.click(javaAlerts).perform();
        WebElement clickForJS= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        actions.click(clickForJS).perform();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        WebElement alertResult= driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']"));
        String expectedResult= alertResult.getText();
        String actualResult1="You successfully clicked an alert";
        softAssert.assertEquals(expectedResult,actualResult1);

        WebElement jsConfirmLink= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        actions.click(jsConfirmLink).perform();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        WebElement alertResult1= driver.findElement(By.id("result"));
        String expectedResult1= alertResult1.getText();
        String actualResult2="You clicked: Ok";
        softAssert.assertEquals(expectedResult1,actualResult2);

        WebElement jsPromptLink= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        actions.click(jsPromptLink).perform();
        Alert alertPrompWindow= driver.switchTo().alert();
        alertPrompWindow.sendKeys("I accept it!");
        Thread.sleep(2000);
        alertPrompWindow.accept();
        WebElement alertResult3= driver.findElement(By.id("result"));
        String expectedResult3= alertResult3.getText();
        String actualResult3="You entered: I accept it!";
        softAssert.assertEquals(expectedResult3,actualResult3);

    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/");
        softAssert.assertTrue(driver.getTitle().contains("Heroku"));

        WebElement javaAlerts= driver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        actions.click(javaAlerts).perform();
        WebElement clickForJS= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        actions.click(clickForJS).perform();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        WebElement alertResult= driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']"));
        String expectedResult= alertResult.getText();
        String actualResult1="You successfully clicked an alert";
        softAssert.assertEquals(expectedResult,actualResult1);

        WebElement jsConfirmLink= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        actions.click(jsConfirmLink).perform();
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);

        WebElement alertResult2= driver.findElement(By.id("result"));
        String expectedResult2= alertResult2.getText();
        String actualResult2= "You clicked: Cancel";
        softAssert.assertEquals(expectedResult2,actualResult2);
        Thread.sleep(2000);

        WebElement jsPrompt= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        actions.click(jsPrompt).perform();
        driver.switchTo().alert().dismiss();


    }

}
