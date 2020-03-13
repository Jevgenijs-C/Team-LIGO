package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class AddToWish {
    private WebDriver driver;

    public AddToWish() {
        this.driver = Hooks.driver;
    }

    @Given("^I an on the shopping website$")
    public void iAmOnTheShoppingWebsite() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.demoshop24.com/");
    }
    @When("^I search an items category \"([^\"]*)\" in website$")
    public void iSearchAnItemsCategoryInWebsite(String category) throws Throwable {
        //Select elements = new Select(driver.findElement(By.className("dropdown")));
        driver.findElement(By.xpath("//a[contains(., 'Components')]")).click();
        driver.findElement(By.partialLinkText(category)).click();
    }

    @And("^I click to add iem \"([^\"]*)\"$")
    public void iClickToddItem(String Item) throws Throwable {
        driver.findElement(By.xpath("//a[contains(., '"+Item+"')]")).click();
        driver.findElement(By.partialLinkText(Item)).click();
    }

    @And("^I click to open the wish list link$")
    public void iClickToOpenTheWishListLink() throws Throwable {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.demoshop24.com/index.php?route=account/wishlist");
     }

   /// @Then("^I can see he selected product name \"([^\"]*)\"$")
 //   public void iCanSeeTheSelectedProductName(String element) throws Throwable {
        //driver.findElement(By.className("hidden-xs.hidden-sm.hidden.md"));
   //     assertTrue(driver.findElement(By.cssSelector("//*[@id='content']/div[1]/table/tbody/tr[1]/td[2]/a")).isDisplayed());
 // }

    @And("^I can see the unit price \"([^\"]*)\"$")
    public void iCanSeeTheUnitPrice(String price) throws Throwable {
        driver.findElement(By.className("price"));
    }

    @And("^The link with searched items opens$")
    public void theLinkWithSearchedItemsOpens() throws Throwable{
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://www.demoshop24.com/");
    }

    @And("^I click to add item \"([^\"]*)\"$")
    public void iClickToAddItem(String Item) throws Throwable {
        driver.findElement(By.xpath("//a[contains(., '"+Item+"')]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
    }

    @Then("^I can see the selected product name \"([^\"]*)\"$")
    public void iCanSeeTheSelectedProductName(String productname) throws Throwable {
        //driver.findElement(By.className("hidden-xs.hidden-sm.hidden.md"));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[2]/a[contains(., '"+productname+"')]")).isDisplayed());
    }

    @Then("^I delete from Wishlist$")
    public void iDeleteFromWishlist() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a")).click();
    }
}