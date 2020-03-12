package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;
import org.openqa.selenium.support.PageFactory;
import pages_sample.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    private WebDriver driver;
    static LoginPage loginPage;

    public MyStepdefs() {
        this.driver = Hooks.driver;
        loginPage = PageFactory.initElements(Hooks.driver, LoginPage.class);
    }

    @Given("^I am on login page$")
    public void iAmOnLoginPage() {

       driver.get(loginPage.getLoginPageUrl());

    }

    @When("^I enter email: \"([^\"]*)\" in E-Mail Address field$")
    public void iEnterEmailInEMailAddressField(String arg0) throws Throwable {

        loginPage.enterEmail("ivan@ivanov.lv");
    }

    @And("^I enter a \"([^\"]*)\" in password field$")
    public void iEnterAInPasswordField(String arg0) throws Throwable {

        loginPage.enterPassword("123456");
    }

    @And("^I click login button$")
    public void iClickLoginButton() {

        loginPage.clickLogin();
    }

    @Then("^I am directed to account page$")
    public void iAmDirectedToAccountPage() {
        assertEquals(loginPage.getAccountPageUrl(), driver.getCurrentUrl());
    }

    @When("^I perform login$")
    public void iPerformLogin() throws Throwable {
        driver.get(loginPage.getLoginPageUrl());
        loginPage.enterEmail("ivan@ivanov.lv");
        loginPage.enterPassword("123456");
        loginPage.clickLogin();
        assertEquals(loginPage.getAccountPageUrl(), driver.getCurrentUrl());
    }



}