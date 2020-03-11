package stepDefinitions;

import org.openqa.selenium.Alert;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages_sample.ShoppingCartPage;
import stepDefinitions.Hooks;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShoppingCartSteps {
    private WebDriver driver;
    static ShoppingCartPage shoppingCartPage;

    public ShoppingCartSteps() {

        this.driver = Hooks.driver;
        shoppingCartPage = PageFactory.initElements(Hooks.driver, ShoppingCartPage.class);
    }

    @Given("^I open a page$")
    public void iAmOnLoginPage() {
        driver.get(shoppingCartPage.getOpenPage());
    }

    @When("^I find a cart button on the right menu$")
    public void iFindACartButtonOnTheRightMenu() {
        shoppingCartPage.checkRightButton();

    }
    @And("^I find a cart button on the top menu$")
    public void iFindACartButtonOnTheTopMenu() {
        shoppingCartPage.checkTopButton();

    }

    @And("^A move to another page$")
    public void aMoveToAnotherPage() {
        driver.get(shoppingCartPage.getRandomPage());

    }

    @And("^I check a cart button on the top menu$")
    public void iCheckACartButtonOnTheTopMenu() {
        shoppingCartPage.checkTopButton();
    }

    @And("^I check a cart button on the right menu$")
    public void iCheckACartButtonOnTheRightMenu() {
        shoppingCartPage.checkRightButton();
    }

    @And("^I go to new page$")
    public void iGoToNewPage() {



        driver.get(shoppingCartPage.getNewRandomPage());
    }

    @And("^I see a cart button on the top menu$")
    public void iSeeACartButtonOnTheTopMenu() {
        shoppingCartPage.checkTopButton();
    }

    @And("^I see a cart button on the right menu$")
    public void iSeeACartButtonOnTheRightMenu() {
        shoppingCartPage.checkRightButton();
    }

    @And("^I click on the shopping cart button on the right$")
    public void iClickOnTheShoppingCartButtonOnTheRight() {

        shoppingCartPage.clickRightButton();
    }

    @And("^I see the message \"([^\"]*)\"$")
    public void iSeeAlertMessage(String arg0) throws Throwable {
        shoppingCartPage.listOfCart("Your shopping cart is empty!");

    }

    @And("^I back on previous page$")
    public void iBackOnPreviousPage() {
        assertEquals(shoppingCartPage.getNewRandomPage(), driver.getCurrentUrl());

    }

    @Then("^I click on the chart button on the top menu$")
    public void iClickOnTheChartButtonOnTheTopMenu() {
        shoppingCartPage.clickTopButton();
    }

}

