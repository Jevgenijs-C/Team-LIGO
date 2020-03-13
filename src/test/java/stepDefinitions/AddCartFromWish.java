package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCartFromWish {
    private WebDriver driver;

    public AddCartFromWish() {
        this.driver = Hooks.driver;
    }


    @Given("^I am on my wish list page: \"([^\"]*)\"$")
    public void iAmOnMyWishListPage(String arg0) throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=account/wishlist");
    }

    @And("^I see the items which I have added to my Wish list$")
    public void iSeeTheItemsWhichIHaveAddedToMyWishList() {
    }
    @And("^Next to each item I see button 'Add to cart' and button 'Remove'$")
    public void nextToEachItemISeeButtonAddToCartAndButtonRemove() {
    }

    @When("^I click on the button 'Add to cart' \"([^\"]*)\" next to item \"([^\"]*)\"$")
    public void iClickOnTheButtonAddToCartNextToItem(String arg0, String arg1) throws Throwable {
        driver.findElement(By.className("fa fa-shopping-cart")).click();
    }

    @And("^I open my shopping cart page \"([^\"]*)\"$")
    public void iOpenMyShoppingCartPage(String arg0) throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=checkout/cart");
    }

    @Then("^I can see that my selected product is added to shopping cart$")
    public void iCanSeeThatMySelectedProductIsAddedToShoppingCart() {
    }

    @And("^I see the product name \"([^\"]*)\"$")
    public void iSeeTheProductName(String arg0) throws Throwable {
        driver.findElement(By.className("breadcrumb")).getText();
    }

    @And("^I see products quantity \"([^\"]*)\" in my shopping cart$")
    public void iSeeProductsQuantityInMyShoppingCart(String arg0) throws Throwable {
        driver.findElement(By.id("quantity")).sendKeys(String.valueOf("quanity"));
    }

    @And("^I see an Unit price \"([^\"]*)\"$")
    public void iSeeAnUnitPrice(String arg0) throws Throwable {
        driver.findElement(By.cssSelector("td"));
    }

    @And("^I see the total sum \"([^\"]*)\" of my ordered item type$")
    public void iSeeTheTotalSumOfMyOrderedItemType(String arg0) throws Throwable {
    }

}








