package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class AddToWish {
    private WebDriver driver;
    public AddToWish() {
        this.driver = Hooks.driver;
    }

    @Given("^As a registered user I have opened my Account page \"([^\"]*)\"$")
    public void asARegisteredUserIHaveOpenedMyAccountPage( ) throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=common/home");
 }



    @When("^I clik on menu field: <\"([^\"]*)\"$")
    public void iClikOnMenuField() throws Throwable {
        assertTrue(driver.findElement(By.id("h4")).click();
    }

    @And("^I click on items \"([^\"]*)\" button: <\"([^\"]*)\">$")
    public void iClickOnItemsButton() throws Throwable {
        driver.findElement(By.className("fa fa-field")).click();
    }

    @And("^I click on link <\"([^\"]*)\"> of the wish list$")
    public void iClickOnLinkOfTheWishList() throws Throwable {
        driver.findElement(By.className("span.hidden-xs.hidden-md")).click();
    }

    @Then("^I see the selected product name <\"([^\"]*)\">$")
    public void iSeeTheSelectedProductName() throws Throwable {
        driver.findElement(By.className("iPhone"));
    }

    @And("^I see the unit price$")
    public void iSeeTheUnitPrice() {
    }

    @And("^I see a menu <\"([^\"]*)\">$")
    public void iSeeAMenu(String arg0) throws Throwable {
        public void iSeeAMenu(String arg0) throws Throwable {
            assertTrue(driver.findElement(By.className("collapse-navbar")).isDisplayed());

    }
}
