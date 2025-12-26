package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "input[id='username']")
    private WebElement emailInput;

    @FindBy(css = "input[id='password']")
    private WebElement passwordInput;

    @FindBy(css = "button[class^='-esm-login']")
    private WebElement loginButton;


    public void fillLoginMask(final String username, final String password){
        sendKeysToElement(emailInput, username);
        sendKeysToElement(passwordInput, password);
    }

    public void clickLoginBtn(){
        clickElement(loginButton);
    }
    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
