package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Factory;

public class Navbar extends BasePage{

    @FindBy(css = "button[name='AddPatientIcon']")
    private WebElement addPatientBtn;

    public void clickAddPatientBtn(){
        clickElement(addPatientBtn);
    }
    public Navbar(WebDriver driver) {
        super(driver);
    }
}
