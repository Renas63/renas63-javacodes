import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {


        @Test
        public void task4() {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

            WebElement userNameLink = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
            userNameLink.sendKeys("Tester");
            WebElement passwordLink = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
            passwordLink.sendKeys("test");
            WebElement loginLink = driver.findElement(By.id("ctl00_MainContent_login_button"));
            loginLink.click();

                WebElement loginButton= driver.findElement(By.xpath("//a[@href='Process.aspx']"));
                loginButton.click();
                WebElement selectBar= driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']"));
                selectBar.click();
                WebElement selectScreenSaver= driver.findElement(By.xpath("//option[@value='ScreenSaver']"));
                selectScreenSaver.click();
                WebElement quantity= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));

                quantity.sendKeys("5"+ Keys.ENTER);
                WebElement customerName= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
                customerName.sendKeys("Techtorial Academy"+ Keys.ENTER);
                WebElement streetName= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
                streetName.sendKeys("2200 E Devon "+Keys.ENTER);
                WebElement city= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));
                city.sendKeys("Des Plaines" +Keys.ENTER);

                WebElement state= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));
                 state.sendKeys("Illinois");
                WebElement zip= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));
                zip.sendKeys("60018" +Keys.ENTER);
                 WebElement selectCard= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_1']"));
                selectCard.click();
                WebElement inputField= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
                inputField.sendKeys("444993876233" +Keys.ENTER);
                WebElement expiration= driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']"));
               expiration.click();
                expiration.sendKeys("03/21"+Keys.ENTER);

                WebElement processButton= driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
                processButton.click();

                WebElement orderSuccess= driver.findElement(By.tagName("strong"));

               String text= orderSuccess.getText();
               //String expectedSuccessText= "New order has been successfully added";

//            System.out.println(text);
            Assert.assertTrue(orderSuccess.isDisplayed());
        }

    }