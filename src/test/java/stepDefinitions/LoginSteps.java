package stepDefinitions;


import hooks.Hooks;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utility.BaseDriver;

public class LoginSteps {
    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @When("Navigate to the web page")
    public void navigateToTheWebPage() {
        driver = Hooks.driver;
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
    }

    @Then("Enter username and password")
    public void enterUsernameAndPassword() {
        loginPage.fillLoginMask("admin", "Admin123");
    }

    @Then("Click login button")
    public void clickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("Verify Home page opened")
    public void verify_homePage_Opened() {
        homePage.verifyHomePage();
    }

    @Then("Enter invalid username and password")
    public void enter_invalid_username_and_password() {
       loginPage.fillLoginMask("admin", "incorrect password");
    }

    @Then("Verify error message")
    public void verify_error_message() {
     loginPage.verifyErrorMessage();
    }

    @Then("Enter username {string} and password {string}")
    public void enterUsernameAndPassword(String username, String password) {
     loginPage.fillLoginMask(username,password);
    }
}
