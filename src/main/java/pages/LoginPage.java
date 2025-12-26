package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement emailInput;

    @FindBy(css = "input[formcontrolname='username']")
    private WebElement passwordInput;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
