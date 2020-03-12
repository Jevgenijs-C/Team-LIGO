package pages_sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Hooks;

import static org.junit.Assert.*;

public class OrderHistoryPage {
    private WebDriver driver;
    static OrderHistoryPage orderHistoryPage;


    @FindBy(how = How.XPATH,using = "//*[contains(text(),'View your order history')]")
    private WebElement viewYourOrderHistory;
    @FindBy(how = How.CLASS_NAME,using = "table-hover")
   // @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[1]/table")
    private WebElement table;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Order ID')]")
    private WebElement orderID;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Customer')]")
    private WebElement customerInfo;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'No. of Products')]")
    private WebElement nrOfProducts;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Status')]")
    private WebElement status;
    @FindBy(how = How.XPATH,using = "//*[@id=\"content\"]/div[1]/table/thead/tr/td[5]")
    private WebElement total;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Date Added')]")
    private WebElement dateAdded;
    @FindBy(how = How.XPATH,using = "//*[@id=\"content\"]/div[1]/table/thead/tr/td[7]")
    private WebElement columnForEye;
    //@FindBy(how = How.XPATH,using = "//a[@href='http://www.demoshop24.com/index.php?route=account/order/info&order_id=184']")
    //private WebElement buttonView;
    @FindBy(how = How.XPATH,using = "//*[contains(@data-original-title,'View')]")
    private WebElement buttonView;

    @FindBy(how = How.XPATH,using = "//*[contains(@data-original-title,'Reorder')]")
    private WebElement reOrderButton;
    @FindBy(how= How.CLASS_NAME,using = "alert-success")
    private WebElement reorderSuccessAlert;

   // @FindBy(how = How.XPATH,using = "//*[contains(@data-original-title,'Return')]")
    @FindBy(how = How.CLASS_NAME,using="fa fa-reply" )
    private WebElement returnButton;

    public String seeAccountInfoAfterLogin(){
        return "http://www.demoshop24.com/index.php?route=account/account";
    }

    public void setViewYourOrderHistory(){
        viewYourOrderHistory.click();
    }

    public String getOrderHistoryPage(){
        return "http://www.demoshop24.com/index.php?route=account/order/info&order_id=184";
    }

    public void checkOrderID(){
        assertTrue(orderID.isDisplayed());
    }

    public void viewTable() {
        assertTrue((table.isDisplayed()));
    }

    public void setCustomerInfo(){
        assertTrue(customerInfo.isDisplayed());
    }

    public void setNrOfProducts(){
        assertTrue(nrOfProducts.isDisplayed());
    }

    public void setStatus(){
        assertTrue(status.isDisplayed());
    }

    public void setTotal(){
        assertTrue(total.isDisplayed());
    }
    public void setDateAdded(){
        assertTrue(dateAdded.isDisplayed());
    }

    public void setColumnForEye(){
        assertTrue(columnForEye.isDisplayed());
    }

    public void clickButtonView() {
        buttonView.click();
    }

    public String redirectedToOrderInformation(){
        return "http://www.demoshop24.com/index.php?route=account/order/info&order_id=184";
    }

    public void clickReorder() {
        reOrderButton.click();
    }

    public void reorderConfirmed(){
        //String reorderSuccessAlert = driver.switchTo().alert().getText();
        reorderSuccessAlert.isDisplayed();
    }
    public void clickReturn() {
        returnButton.click();
    }
    public String returnDirectsTo() {
        return "http://www.demoshop24.com/index.php?route=account/return/add&order_id=184&product_id=40";
    }


}
