package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages_sample.DiscountPage;
import pages_sample.LoginPage;
import stepDefinitions.Hooks;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

public class DiscountSteps {
    private WebDriver driver;
    static DiscountPage discountPage;

    public DiscountSteps() {
        this.driver = Hooks.driver;
        discountPage = PageFactory.initElements(Hooks.driver, DiscountPage.class);
    }

    //Page Navigation
    @Given("^I am on page \"([^\"]*)\"$")
    public void iAmOnDesktopsPage(PageUrl) throws Throwable {
        driver.get(PageUrl);

    }

    @And("^I go to page \"([^\"]*)\"$")
    public void iGoToPage(PageUrl) throws Throwable {
        driver.get(PageUrl);
    }

    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String element) throws Throwable {
        discountPage.element.click();
        assertEquals(pageUrl, driver.getCurrentUrl());
    }

    //Discounts

    @Then("^I see discount for \"([^\"]*)\"$")
    public void iSeeDiscountFor(int arg0) throws Throwable {
        assertTrue(discountPage.discount.isDisplayed());

    }

    @Then("^I see no discount for \"([^\"]*)\"$")
    public void iSeeNoDiscountFor(int arg0) throws Throwable {
        assertFalse(discountPage.discount.isDisplayed());
    }

    @Then("^I see discount for \"([^\"]*)\" is \"([^\"]*)\"$")
    public void iSeeDiscountForCalculation(int arg0, int arg1) throws Throwable {

    }

    //Add To Cart
    @When("^I click Add to Cart for \"([^\"]*)\"$")
    public void iClickAddToCart(String arg0, int arg1) throws Throwable {
    }


    @And("^I see that \"([^\"]*)\" is added to Cart$")
    public void iSeeAddedToCart(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
