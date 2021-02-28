package selenium.pages.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MSILaptopLink {

    public  MSILaptopLink(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "")
    WebElement MSILaptop;
}
