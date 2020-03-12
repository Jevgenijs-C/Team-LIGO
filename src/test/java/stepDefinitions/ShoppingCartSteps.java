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
    public void iGoToNewPage() { driver.get(shoppingCartPage.getNewRandomPage());
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



    @When("^I add \"([^\"]*)\" into the search field$")
    public void iAddIntoTheSearchField(String cartItem) throws Throwable {
        shoppingCartPage.addSearch(cartItem);

    }
    @And("^I direct into the item page$")
    public void iDirectIntoTheItemPage() {
        driver.get(shoppingCartPage.getNiconPage());
    }

    @And("^Correct items \"([^\"]*)\" and \"([^\"]*)\" is exist$")
    public void correctItemsAndIsExist(String item, String price) throws Throwable {
          shoppingCartPage.itemsExist();

    }
    @And("^I press add button on the page$")

    public void iPressAddButtonOnThePage() {
        shoppingCartPage.clickAddButton();
    }

    @And("^I move on the cart using top menu link$")
    public void iMoveOnTheCartUsingTopMenuLink() {
        shoppingCartPage.clickTopButton();
        shoppingCartPage.getCartPage();
        }

   // @And("^I check item is exist into the cart$")
    //public void iCheckItemIsExistIntoTheCart() {
      //  shoppingCartPage ;

   // }

   // @And("^I check quantity field$")
  //  public void iCheckQuantityField(DataTable table) {

    //   driver.get (shoppingCartPage.cartParam( ));
   // }

    // @And("^I check price field$")
   // public void iCheckPriceField() {
  //  }

  //  @And("^I delete product from the cart$")
  //  public void iDeleteProductFromTheCart() {
   //     shoppingCartPage.deleteItem();

   // }

   // @Then("^I check cart is empty$")
   // public void iCheckCartIsEmpty() {
   //     shoppingCartPage.isEmptyCart();
   // }


    @When("^I put  “item” into the search field$")
    public void iPutItemIntoTheSearchField() {
    }

    @And("^I move into the “item page”$")
    public void iMoveIntoTheItemPage() {
    }

    @And("^I click on the cart button$")
    public void iClickOnTheCartButton() {
    }

    @And("^I fill two “fields”$")
    public void iFillTwoFields() {
    }

    @And("^I click on the cart button again$")
    public void iClickOnTheCartButtonAgain() {
    }

    @And("^I fill all fields$")
    public void iFillAllFields() {
    }

    @And("^I click cart button one more time$")
    public void iClickCartButtonOneMoreTime() {
    }

    @Then("^check correct items and price there$")
    public void checkCorrectItemsAndPriceThere() {
    }

    @When("^I add “item” into the search field$")
    public void iAddItemIntoTheSearchField() {
    }

    @And("^I go to the correct page$")
    public void iGoToTheCorrectPage() {
    }

    @And("^I click add to cart$")
    public void iClickAddToCart() {
    }

    @And("^I open a cart$")
    public void iOpenACart() {
    }

    @And("^I see item marked as out of stock$")
    public void iSeeItemMarkedAsOutOfStock() {
    }

    @And("^I see red color note that item out of stock$")
    public void iSeeRedColorNoteThatItemOutOfStock() {
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



