package pages_sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Hooks;

import static org.junit.Assert.*;

public class CheckOutInfoPage {
    private WebDriver driver;
    static LoginPage loginPage;
    static OrderHistoryPage orderHistoryPage;

    public CheckOutInfoPage() {
        this.driver = Hooks.driver;
        orderHistoryPage = PageFactory.initElements(Hooks.driver, OrderHistoryPage.class);
    }


    public String getOrderHistoryPage() { return "http://www.demoshop24.com/index.php?route=account/order";}
}
