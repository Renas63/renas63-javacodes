package selenium.homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Homework1 {
    /*
    1. Navigate to herokuapp
 2. Navigate to Hovers page
`3. Go back
 4. Navigate to Notification Message page
 5. Go to home page
 6. Navigate to Context Menu page
 7. Print out the Header of Context Menu page
 8. Navigate to Home page
 9. Navigate to File Uploader page
 10. Print out all text from File Uploader page
     */
    @Test
    public void navigateToHeroku() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement hoverPage = driver.findElement(By.xpath("//a[@href='/hovers']"));
        hoverPage.click();
        driver.navigate().back();
        WebElement notificationMessage = driver.findElement(By.xpath("//a[@href='/notification_message']"));
        notificationMessage.click();
        driver.navigate().back();

        WebElement contextMenu = driver.findElement(By.xpath("//a[@href='/context_menu']"));
       contextMenu.click();
        WebElement header = driver.findElement(By.xpath("//h3"));
        String headerText = header.getText();
        System.out.println(headerText);
        System.out.println(headerText);
        driver.navigate().to("https://the-internet.herokuapp.com/");

        WebElement fileUploder = driver.findElement(By.xpath("//a[@href='/upload']"));
        fileUploder.click();

        List<WebElement> list = driver.findElements(By.className("example")); //
        System.out.println(list.size());
        for (WebElement element : list) {
            System.out.println(element.getText());
        }

    }
}