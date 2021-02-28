package selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.LocalDate;

public class DataProviderTask {
    private WebDriver driver;
    private Actions actions;
    private Select select;
    SoftAssert softAssert;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
        softAssert = new SoftAssert();
    }

    @Test(dataProvider = "patientInfo")
    public void registerPatientTest(String firstName, String lastName, String gender, int birthDay, String birthMonth, int birthYear, String address, long phoneNumber, String relative) throws InterruptedException {
        driver.get("https://demo.openmrs.org/");
        login();
        WebElement registerPatientButton = driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension"));
        actions.click(registerPatientButton).perform();
        //patient name
        WebElement givenName = driver.findElement(By.name("givenName"));
        givenName.sendKeys(firstName);
        //patient last name
        WebElement familyName = driver.findElement(By.name("familyName"));
        familyName.sendKeys(lastName);
        WebElement nextButton = driver.findElement(By.id("next-button"));
        nextButton.click();
        //select gender
        WebElement genderDD = driver.findElement(By.id("gender-field"));
        select = new Select(genderDD);
        select.selectByVisibleText(gender);
        nextButton.click();
        //dob
        WebElement birthDayBox = driver.findElement(By.id("birthdateDay-field"));
        birthDayBox.sendKeys(String.valueOf(birthDay));
        WebElement birthMonthBox = driver.findElement(By.id("birthdateMonth-field"));
        select = new Select(birthMonthBox);
        select.selectByVisibleText(birthMonth);
        WebElement birthYearBox = driver.findElement(By.id("birthdateYear-field"));
        birthYearBox.sendKeys(String.valueOf(birthYear));
        actions.click(nextButton).perform();
        //address
        WebElement addressBox = driver.findElement(By.id("address1"));
        addressBox.sendKeys(address);
        actions.click(nextButton).perform();
        //phone
        WebElement phoneNumberBox = driver.findElement(By.name("phoneNumber"));
        phoneNumberBox.sendKeys(String.valueOf(phoneNumber));
        actions.click(nextButton).perform();
        //relatives
        WebElement relativeDD = driver.findElement(By.id("relationship_type"));
        select = new Select(relativeDD);
        select.selectByVisibleText(relative);
        actions.click(nextButton).perform();
        WebElement submitButton = driver.findElement(By.id("submit"));
        actions.click(submitButton).perform();
        Thread.sleep(3000);


        //Assertions
        WebElement nameAssertion=driver.findElement(By.className("PersonName-givenName"));
        softAssert.assertEquals(nameAssertion.getText(),firstName);
        WebElement familyNameAssertion=driver.findElement(By.xpath("//span[@class='PersonName-familyName']"));
        softAssert.assertEquals(familyNameAssertion.getText(),familyName);
        WebElement genderAssertion=driver.findElement(By.xpath("//*[@id='edit-patient-demographics']//preceding-sibling::span//preceding-sibling::span"));
        softAssert.assertTrue(genderAssertion.getText().contains(gender));

        String ageAndYear=driver.findElement(By.xpath("//span[@id='edit-patient-demographics']//preceding-sibling::span[1]")).getText().trim();
        String ageString=ageAndYear.substring(0,2); //.......(13.Jan.1971)
        String yearString=ageAndYear.substring(ageAndYear.length()-5,ageAndYear.length()-1);
        System.out.println(ageAndYear); // the whole string
        System.out.println(ageString);
        System.out.println(yearString);

        int expectedAge= LocalDate.now().getYear()-birthYear;
        softAssert.assertEquals(Integer.parseInt(ageString),expectedAge);
        softAssert.assertEquals(Integer.parseInt(yearString),birthYear);
        // (31.Aug.1971)
        String monthString=ageAndYear.substring(ageAndYear.length()-9,ageAndYear.length()-6);
        softAssert.assertTrue(birthMonth.contains(monthString));
        String dayString=ageAndYear.substring(ageAndYear.length()-12,ageAndYear.length()-10);
        softAssert.assertEquals(Integer.parseInt(dayString),birthDay);

        WebElement actualAddress= driver.findElement(By.xpath("//div[@class='contact-info-inline labeled']/span[1]"));
        softAssert.assertEquals(actualAddress.getText().trim(),address);

    }

    @DataProvider(name = "patientInfo")
    public Object[][] getPatientData() {
        return new Object[][]{
                {"John", "Smith", "Male", 31, "August", 1971, "2200 E Devon ave", 8881112222L, "Sibling"},
//                {"Ella","Jaraba","Female",1,"June",1960,"6011 e devon ave",8765438751L,"daughter"},
//                {"Alex","Alden","Male",12,"January",2000,"601 e john ave",8765432111L,"Son"},
//                {"Katie","Johnson","Female",12,"January",1965,"601 e john ave",8765432111L,"Wife"},
        };
    }

    private void login() {
        WebElement usernameBox = driver.findElement(By.id("username"));
        WebElement passwordBox = driver.findElement(By.id("password"));
        usernameBox.sendKeys("admin");
        passwordBox.sendKeys("Admin123");
        WebElement option = driver.findElement(By.id("Inpatient Ward"));
        option.click();
        WebElement login = driver.findElement(By.id("loginButton"));
        login.click();
    }
}