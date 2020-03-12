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

    public OrderHistory (){
    this.driver = Hooks.driver;
    orderHistoryPage = PageFactory.initElements(Hooks.driver, OrderHistoryPage.class);
    }



    @When("^I am on my account page$")
    public void seeAccountInfoAfterLogin() {
       orderHistoryPage.seeAccountInfoAfterLogin();

    }
    @When("^I click on Order History page$")
    public void setViewYourOrderHistory() {
        orderHistoryPage.setViewYourOrderHistory();
    }
    @When("^I am on Order history page$")
        public void getOrderHistoryPage(){
     driver.get(orderHistoryPage.getOrderHistoryPage());

    }

    @And("^I see order history grid$")
    public void iSeeOrderHistoryGrid() {
        orderHistoryPage.viewTable();
    }

    @And("^I see Order ID field column$")
    public void iSeeOrderIDFieldColumn() {
        orderHistoryPage.checkOrderID();
    }

    @And("^I see Customer field column$")
    public void iSeeCustomerFieldColumn() {
        orderHistoryPage.setCustomerInfo();
    }

    @And("^I see No\\.of Products column$")
    public void iSeeNoOfProductsColumn() {
        orderHistoryPage.setNrOfProducts();
    }

    @And("^I see Status column$")
    public void iSeeStatusColumn() {
        orderHistoryPage.setStatus();
    }

    @And("^I see Total sum in \\$ column$")
    public void iSeeTotalSumIn$Column() {
        orderHistoryPage.setTotal();
    }

    @And("^I see Date Added – date in format dd/mm/yyyy$")
    public void iSeeDateAddedDateInFormatDdMmYyyy() {
        orderHistoryPage.setDateAdded();
    }

    @And("^I see button View column$")
    public void iSeeButtonViewColumn() {
        orderHistoryPage.setColumnForEye();
    }


    @And("^I click button View in grid$")
    public void iClickButtonView() {
        orderHistoryPage.clickButtonView();
    }

    @Then("^I am redirected to Order Information page$")
    public void iAmRedirectedToOrderInformationPage() {
        orderHistoryPage.redirectedToOrderInformation();
    }


    @Then("^I click Reorder$")
    public void iClickReorder() {
        orderHistoryPage.clickReorder();

    }

    @And("^I get reorder success alert$")
    public void iSeeSuccessAlert() {
        orderHistoryPage.reorderConfirmed();
    }

    @Then("^I see my Historical Order Grid$")
    public void iSeeMyHistoricalOrderGrid() {
        orderHistoryPage.seeAccountInfoAfterLogin();
        orderHistoryPage.setViewYourOrderHistory();
        orderHistoryPage.getOrderHistoryPage();
        orderHistoryPage.viewTable();
        orderHistoryPage.checkOrderID();
        orderHistoryPage.setCustomerInfo();
        orderHistoryPage.setNrOfProducts();
        orderHistoryPage.setStatus();
        orderHistoryPage.setTotal();
        orderHistoryPage.setDateAdded();
        orderHistoryPage.setColumnForEye();

    }
}
