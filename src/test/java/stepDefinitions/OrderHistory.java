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
        driver.get(orderHistoryPage.redirectedToOrderInformation());
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

    @Then("^I click Return$")
    public void iClickReturn() {
        orderHistoryPage.clickReturn();
    }

    @And("^I am redirected to Return Product page$")
    public void iAmRedirectedToReturnProductPage() {
        driver.get(orderHistoryPage.returnDirectsTo());
    }

    @And("^I see Reason for Return$")
    public void iSeeReasonForReturn() {
        orderHistoryPage.seeLabelReasonForReturn();
    }

    @And("^First LOV is Dead On Arrival$")
    public void firstLOVIsDeadOnArrival() {
        orderHistoryPage.viewRadioDead();
    }

    @And("^Second LOV is Faulty, please supply details$")
    public void secondLOVIsFaultyPleaseSupplyDetails() {
        orderHistoryPage.viewFaulty();
    }

    @And("^Third LOV is Payment Error$")
    public void thirdLOVIsPaymentError() {
        orderHistoryPage.viewPaymentError();
    }

    @And("^Forth LOV is Other, please supply details$")
    public void forthLOVIsOtherPleaseSupplyDetails() {
        orderHistoryPage.viewOther();
    }

    @And("^Fifth LOV is Received Wrong Item$")
    public void fifthLOVIsReceivedWrongItem() {
        orderHistoryPage.viewWrongItem();
    }

    @Then("^I can see all return options$")
    public void iCanSeeAllOptions() {
        orderHistoryPage.seeLabelReasonForReturn();
        orderHistoryPage.viewRadioDead();
        orderHistoryPage.viewFaulty();
        orderHistoryPage.viewPaymentError();
        orderHistoryPage.viewOther();
        orderHistoryPage.viewWrongItem();
    }

    @Then("^I can reorder some item$")
    public void iCanReorderSomeItem() {
        orderHistoryPage.clickReorder();
        orderHistoryPage.reorderConfirmed();
    }

    @And("^I see grid pagination$")
    public void iSeeGridPagination() {
        orderHistoryPage.viewPagination();
    }

    @And("^see how many rows are in grid$")
    public void seeHowManyRowsAreInGrid() {
        orderHistoryPage.listRows();
    }
}
