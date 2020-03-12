package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages_sample.LoginPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import pages_sample.*;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DiscountSteps {
    private WebDriver driver;
    private static WebDriverWait wait;
    static long startTime;
    static ProductListPage productListPage;
    static ProductPage productPage;
    static CartPage cartPage;

    public DiscountSteps() {
        this.driver = Hooks.driver;
        productListPage = PageFactory.initElements(Hooks.driver, ProductListPage.class);
        productPage = PageFactory.initElements(Hooks.driver, ProductPage.class);
        cartPage = PageFactory.initElements(Hooks.driver, CartPage.class);

        productPage.setDriver(driver);
    }

    @Given("^I am on page$")
    public void iAmOnPage(Map<String, String> valuesToEnter) {
        for (Map.Entry<String, String> e : valuesToEnter.entrySet()) {
            driver.get(e.getValue());
        }
    }

    @Then("^I see discount for$")
    public void iSeeDiscount() {
        productListPage.CheckDiscountPresence();
    }

    @When("^I click on Apple Cinema$")
    public void iClickOnAppleCinema() {
        productListPage.ClickOnProduct();
    }

    @Then("^I see discountt$")
    public void iSeeDiscountt() {
        productPage.CheckDiscountPresence();
    }

    @And("^I choose options for product$")
    public void iChooseOptionsForProduct() {
       productPage.ChooseProductSize();
       productPage.ChooseCheckbox();
        productPage.SelectColor();
        productPage.TextIntoTextarea();
        productPage.UploadFile();
    }

    @And("^I add product to shopping cart$")
    public void iAddProductToPage() {
        productPage.AddToCart();
    }

    @And("^I go to$")
    public void iGoToShoppingCart(Map<String, String> valuesToEnter) {
        for (Map.Entry<String, String> e : valuesToEnter.entrySet()) {
            driver.get(e.getValue());
        }
    }

    @Then("^I see price with discount$")
    public void iSeePriceWithDiscount() {
        cartPage.DiscountCheck();
    }

    @Then("^I see discount is correct$")
    public void iSeeDiscountIsCorrect() {
       productListPage.DiscountCalculationCheck();
    }
}