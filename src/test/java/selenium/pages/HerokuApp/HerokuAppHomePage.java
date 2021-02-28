package selenium.pages.HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class HerokuAppHomePage {

    public HerokuAppHomePage (WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(linkText = "")
     public WebElement abTesting;
              // WebElement abTesting= driver.findElemet(By.linkText(""))

    @FindBy(xpath = "//a[@href='/challenging_dom']")
  public   WebElement challengingDomLink;

    @FindBy(xpath = "//a[text()='Dropdown']")
   public  WebElement dropdownLink;
}
