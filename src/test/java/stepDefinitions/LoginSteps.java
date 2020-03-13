package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages_sample.LoginPage;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LoginSteps {
    private WebDriver driver;
    static LoginPage loginPage;

    public LoginSteps() {
        this.driver = Hooks.driver;
        loginPage = PageFactory.initElements(Hooks.driver, LoginPage.class);
    }


    @When("^I perform login with email: \"([^\"]*)\" and password: \"([^\"]*)\"$")
    public void iPerformLogin(String email, String password) throws Throwable {
       driver.get(loginPage.getLoginPageUrl());
        loginPage.enterEmail(email);
       loginPage.enterPassword(password);
        loginPage.clickLogin();
        assertEquals(loginPage.getAccountPageUrl(), driver.getCurrentUrl());
    }
}