package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages_sample.LoginPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import pages_sample.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static sun.plugin.javascript.navig.JSType.Element;

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
        productListPage.setDriver(driver);
        productPage = PageFactory.initElements(Hooks.driver, ProductPage.class);
        cartPage = PageFactory.initElements(Hooks.driver, CartPage.class);
        wait = (WebDriverWait) new WebDriverWait(driver, 15).ignoring(StaleElementReferenceException.class);

    }

    @Given("^I am on page$")
    public void iAmOnPage(Map<String, String> valuesToEnter) {
        for (Map.Entry<String, String> e : valuesToEnter.entrySet()) {
            driver.get(e.getValue());
        }
    }

    @Then("^I see discount price in Product info container for: \"([^\"]*)\"$")
    public void iSeeDiscount(String discount) {
           productListPage.CheckDiscountPresence(discount);
    }
    @Then("^I see original price in Product info container for: \"([^\"]*)\"$")
    public void iSeeOriginalPrice(String originalPrice) {
        productListPage.CheckOriginalPricePresence(originalPrice);
        productListPage.CheckOriginalPriceDecor(originalPrice);
    }

    @When("^I click on: \"([^\"]*)\"$")
    public void iClickOnAppleCinema(String productName) {
             productListPage.ClickOnProduct(productName);
        }


    @Then("^I see discount price in info$")
    public void iSeeDiscountProductPage() {
        productPage.CheckDiscountPresence();
    }
    @Then("^I see original price in info$")
    public void iSeeOriginalPriceProductPage() {
        productPage.CheckOriginalPricePresence();
        productPage.CheckOriginalPriceDecor();
    }

    @And("^I choose options for product$")
    public void iChooseOptionsForProduct() throws InterruptedException, AWTException {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".radio input[value='6']")));
        productPage.ChooseProductSize();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".checkbox input[value='8']")));
        productPage.ChooseCheckbox();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("input-option217")));
        productPage.SelectColor();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("input-option209")));
        productPage.TextIntoTextarea();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("input-quantity")));
        productPage.ChooseQuantity();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("label ~ button[id^='button-upload']")));
        productPage.ClickUpload();
        Thread.sleep(5000);
        StringSelection stringSelection = new StringSelection("C:\\Users\\ianina.spirova\\Downloads\\AT3.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

    }

    @And("^I add product to shopping cart$")
    public void iAddProductToPage() throws InterruptedException {
        productPage.AddToCart();
    }

    @And("^I go to$")
    public void iGoToShoppingCart(Map<String, String> valuesToEnter) throws InterruptedException {
        for (Map.Entry<String, String> e : valuesToEnter.entrySet()) {
            Thread.sleep(5000);
            driver.get(e.getValue());
        }
    }

    @Then("^I see price with discount: \"([^\"]*)\"$")
    public void iSeePriceWithDiscount(String discountPrice) {
        cartPage.DiscountCheck(discountPrice);
    }

    @Then("^I see discount for \"([^\"]*)\" is correct: \"([^\"]*)\"$")
    public void iSeeDiscountIsCorrect(String product, String discountPrice) {
        productListPage.DiscountCalculationCheck(product, discountPrice);
    }
}