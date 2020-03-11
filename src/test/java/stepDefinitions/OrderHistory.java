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

public class OrderHistory {
    private WebDriver driver;
    static OrderHistoryPage orderHistoryPage;
    static CheckOutInfoPage checkOutInfoPage;

    @Given("^I am on web shop homepage$")
    public void iAmOnWebShopHomepage() {
        driver.get(orderHistoryPage.getOrderHistoryPage());
    }

    @When("^I choose item iPhone and add it to cart$")
    public void iChooseItemIPhoneAndAddItToCart() {

    }

    @And("^I click on cart button$")
    public void iClickOnCartButton() {
    }

    @And("^I click to checkout item$")
    public void iClickToCheckoutItem() {
    }

    @And("^I am redirected to checkout form$")
    public void iAmRedirectedToCheckoutForm() {
    }

    @And("^I fill first name$")
    public void iFillFirstName() {
    }

    @And("^I fill second name$")
    public void iFillSecondName() {
    }

    @And("^I fill address(\\d+) field$")
    public void iFillAddressField(int arg0) {
    }

    @And("^I fill city field$")
    public void iFillCityField() {
    }

    @And("^I fill post code field$")
    public void iFillPostCodeField() {
    }

    @And("^I select region$")
    public void iSelectRegion() {
    }

    @And("^I click on Continue to move away from Billing details$")
    public void iClickOnContinueToMoveAwayFromBillingDetails() {
    }

    @And("^I select existing address for delivery$")
    public void iSelectExistingAddressForDelivery() {
    }

    @And("^I click Continue to move away from Delivery Details$")
    public void iClickContinueToMoveAwayFromDeliveryDetails() {
    }

    @And("^I select flat Rate for shipping$")
    public void iSelectFlatRateForShipping() {
    }

    @And("^I click Continue to move away from Delivery Method$")
    public void iClickContinueToMoveAwayFromDeliveryMethod() {
    }

    @And("^I select Cash on Delivery as payment method$")
    public void iSelectCashOnDeliveryAsPaymentMethod() {
    }

    @And("^I select T&C checkbox$")
    public void iSelectTCCheckbox() {
    }

    @And("^I click Continue to move away from Payment Method$")
    public void iClickContinueToMoveAwayFromPaymentMethod() {
    }

    @And("^I click on Confirm Order button$")
    public void iClickOnConfirmOrderButton() {
    }

    @Then("^I have checked out my purchase successfully$")
    public void iHaveCheckedOutMyPurchaseSuccessfully()
    {
    }

    @Given("^I am can see checkout success message$")
    public void iAmCanSeeCheckoutSuccessMessage() {
    }

    @And("^I click on link under name History$")
    public void iClickOnLinkUnderNameHistory() {
        checkOutInfoPage.clickOrderHistoryLinkAfterCheckout();

    }

    @And("^I am redirected to Order history page$")
    public void iAmRedirectedToOrderHistoryPage() {
        checkOutInfoPage.getOrderHistoryPage();
    }

    @Then("^I see my recent order in table$")
    public void iSeeMyRecentOrderInTable() {
    }

    @Given("^I am on account page$")
    public void iAmOnAccountPage() {
    }

    @When("^I click on link \"([^\"]*)\"$")
    public void iClickOnLink(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I am directed to order history page$")
    public void iAmDirectedToOrderHistoryPage() {
    }
}
