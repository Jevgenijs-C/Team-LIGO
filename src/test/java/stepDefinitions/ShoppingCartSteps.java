package stepDefinitions;

import cucumber.api.DataTable;
import org.openqa.selenium.Alert;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages_sample.ShoppingCartPage;
import stepDefinitions.Hooks;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

import static org.junit.Assert.*;

public class ShoppingCartSteps {
    private WebDriver driver;
    static ShoppingCartPage shoppingCartPage;

    public ShoppingCartSteps() {

        this.driver = Hooks.driver;
        shoppingCartPage = PageFactory.initElements(Hooks.driver, ShoppingCartPage.class);
        shoppingCartPage.setDriver(driver);
    }

    @Given("^I open a page$")
    public void iAmOnLoginPage() {
        driver.get(shoppingCartPage.getOpenPage());
    }

    @When("^I find a cart button on the right menu$")
    public void iFindACartButtonOnTheRightMenu() {
        shoppingCartPage.checkRightButton();

    }

    @And("^I find a cart link on the top menu$")
    public void iFindACartButtonOnTheTopMenu() {
        shoppingCartPage.checkTopButton();

    }

    @And("^A move to another page$")
    public void aMoveToAnotherPage() {
        driver.get(shoppingCartPage.getRandomPage());

    }

    @And("^I check a cart link on the top menu$")
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

    @And("^I see a cart link on the top menu$")
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
    public void iSeeAlertMessage(String name) throws Throwable {
        shoppingCartPage.listOfCart("Your shopping cart is empty!");

    }

    @Then("^I back on previous page$")
    public void iBackOnPreviousPage() {
        assertEquals(shoppingCartPage.getNewRandomPage(), driver.getCurrentUrl());
    }


    @When("^I search the item using search field$")
    public void iAddIntoTheSearchField(Map<String, String> cartItem) throws Throwable {
        shoppingCartPage.addSearch(cartItem);
        shoppingCartPage.clickSearchButton();

    }

    @And("^I direct into the search page with item$")
    public void iDirectIntoTheSearchPageWithItem() throws InterruptedException {
        shoppingCartPage.getNiconSearchPage();
        shoppingCartPage.searchdNikon();
        shoppingCartPage.clickNikon();

    }

    @And("^I direct into the item page$")
    public void iDirectIntoTheItemPage() {
        assertEquals(shoppingCartPage.getNiconPage(), driver.getCurrentUrl());
    }

    @And("^Correct Item are exist$")
    public void correctAreExist(Map<String, String> addedItem) throws Throwable {
        shoppingCartPage.itemFound(addedItem);

    }

    @And("^I press add button on the page$")

    public void iPressAddButtonOnThePage() {

        shoppingCartPage.clickAddButton();
    }

    @And("^I move on the cart using top menu link$")
    public void iMoveOnTheCartUsingTopMenuLink() {
        shoppingCartPage.clickTopButton();
        shoppingCartPage.getCartPageNik();
    }

    @And("^I check product are exist into the cart$")
    public void iCheckAreExistIntoTheCart(DataTable cartItems) {
        shoppingCartPage.itemsExist(cartItems);
    }


    @And("^I delete product from the cart$")
    public void iDeleteProductFromTheCart() {
        shoppingCartPage.deleteItem();

    }

    @Then("^I check cart is empty \"([^\"]*)\"$")
    public void iCheckCartIsEmpty(String message) throws Throwable {
        shoppingCartPage.IsEmptyCart("Your shopping cart is empty!");
    }


    @When("^I add item into the search field$")
    public void iAddItemIntoTheSearchField(Map<String, String> newItem) {
        shoppingCartPage.newSearch(newItem);
        shoppingCartPage.clickSearchButton();
    }

    @And("^I move to the search page with item$")
    public void iMoveToTheSearchPageWithItem() {
        shoppingCartPage.getSamsungSearchPage();
        shoppingCartPage.searchdSamsung();

    }

    @And("^I click on exist element$")
    public void iClickOnExistElement() {
        shoppingCartPage.clickSamsung();
    }

    @And("^I go to the correct page$")
    public void iGoToTheCorrectPage(Map<String, String> samsung) {
        shoppingCartPage.getSamsungPage();
        shoppingCartPage.samsungFound(samsung);
    }

    @And("^I click add to cart$")
    public void iClickAddToCart() {
        shoppingCartPage.clickAddButton();
    }

    @And("^I open a cart using right menu button$")
    public void iOpenACartUsingRightMenuButton() throws InterruptedException {
        shoppingCartPage.clickRightButton();
        shoppingCartPage.rightCartItem();
    }

    @And("^I see item marked as out of stock$")
    public void iSeeItemMarkedAsOutOfStock(Map<String, String> inCart) {
        shoppingCartPage.samsungInCart(inCart);
    }

    @Then("^I see red color note that item out of stock with message \"([^\"]*)\"$")
    public void iSeeRedColorNoteThatItemOutOfStockWithMessage(String r) throws Throwable {
        shoppingCartPage.alertMessage(r);
        driver.quit();
    }


    @When("^I put item into the search field$")
    public void iPutItemIntoTheSearchField(Map<String, String> cartItem) {
        shoppingCartPage.itemFound(cartItem);
    }

    @And("^I move to the search Apple field$")
    public void iMoveToTheSearchAppleField() {
    }


    @And("^I move into the item page$")
    public void iMoveIntoTheItemPage() {
        driver.get(shoppingCartPage.getApplePage());

    }

    @And("^I check name of the item$")
    public void iCheckNameOfTheItem() {
       shoppingCartPage.clickAddButton();
        shoppingCartPage.noClick();
    }


    @And("^I fill two “fields”$")
    public void iFillTwoFields() {
        shoppingCartPage.twoItemsFill();
    }

    @And("^I click on the cart button again$")
    public void iClickOnTheCartButtonAgain() {
        shoppingCartPage.clickAddButton();
        shoppingCartPage.noClick();
    }

    @And("^I fill all fields$")
    public void iFillAllFields() {
    }

    @And("^I click cart button one more time$")
    public void iClickCartButtonOneMoreTime() {
        shoppingCartPage.clickAddButton();
        shoppingCartPage.noClick();
    }

    @Then("^check correct items and price there$")
    public void checkCorrectItemsAndPriceThere() {
    }


    @When("^I find a “item”  using a search field$")
    public void iFindAItemUsingASearchField() {
    }

    @And("^I go on product page$")
    public void iGoOnProductPage() {
    }

    @And("^I choose item and put it into cart$")
    public void iChooseItemAndPutItIntoCart() {
    }

    @And("^I see note that product add into the cart button$")
    public void iSeeNoteThatProductAddIntoTheCartButton() {
    }

    @And("^I go to the cart throw top menu$")
    public void iGoToTheCartThrowTopMenu() {
    }

    @And("^I check the number of items and price$")
    public void iCheckTheNumberOfItemsAndPrice() {
    }

    @And("^I back to product page$")
    public void iBackToProductPage() {
    }

    @And("^I click on cart in  right menu$")
    public void iClickOnCartInRightMenu() {
    }

    @And("^I move to the cart$")
    public void iMoveToTheCart() {
    }

    @And("^I check item in cart$")
    public void iCheckItemInCart() {
    }

    @And("^I back into the item page$")
    public void iBackIntoTheItemPage() {
    }

    @And("^I check note on the button product is in cart$")
    public void iCheckNoteOnTheButtonProductIsInCart() {
    }

    @And("^I go to cart again$")
    public void iGoToCartAgain() {
    }

    @And("^I delete item from the cart$")
    public void iDeleteItemFromTheCart() {
    }

    @And("^I back on the page$")
    public void iBackOnThePage() {
    }

    @Then("^I see no items into the cart on the button$")
    public void iSeeNoItemsIntoTheCartOnTheButton() {
    }



}



