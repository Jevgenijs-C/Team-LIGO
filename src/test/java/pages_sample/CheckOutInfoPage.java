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

    @FindBy(how = How.ID,using = "input-payment-firstname")
    private WebElement firstNameInput;
    @FindBy(how = How.ID,using = "input-payment-lastname")
    private WebElement lastNameInput;
    @FindBy(how = How.ID,using = "input-payment-address-1")
    private WebElement address1Input;
    @FindBy(how = How.ID,using = "input-payment-city")
    private WebElement cityInput;
    @FindBy(how = How.ID,using = "input-payment-postcode")
    private WebElement postCodeInput;
    @FindBy(how = How.ID,using = "input-payment-country")
    private WebElement selectCountry;
    @FindBy(how = How.ID,using = "input-payment-zone")
    private WebElement selectState;
    @FindBy(how = How.CLASS_NAME,using = "btn btn-primary")
    private WebElement continueFromBillingDetails;
    //Delivery details tab
    @FindBy(how = How.NAME,using = "shipping_address")
    private WebElement selectExistingShippingAddress;
    @FindBy(how = How.ID,using = "button-shipping-address")
    private WebElement continueFromShippingAddress;
    //Delivery Method tab
    @FindBy(how = How.XPATH,using = "//*[@id=\"collapse-shipping-method\"]/div/div[1]/label/input")
    private WebElement flatRateSelection;
    @FindBy(how = How.ID,using = "button-shipping-method")
    private WebElement continueFromDeliveryMethod;
    //Payment Method tab
    @FindBy(how =How.XPATH,using = "//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]")
    private WebElement agreeTermsAndConditions;
    @FindBy(how = How.XPATH,using = "//*[@id=\"button-payment-method\"]")
    private WebElement continueFromPaymentMethod;
    //Confirm Order tab
    @FindBy(how = How.ID,using = "button-confirm")
    private WebElement confirmButton;
    //click on History
    @FindBy(how = How.XPATH,using = "//*[contains(@href,'account/order')]")
    private WebElement accessOrderHistory;

    public String getCheckoutUrl(){ return "http://www.demoshop24.com/index.php?route=checkout/checkout"; }
    //fill Billing Details block
    public void enterFirstName(String name){
        firstNameInput.click();
        firstNameInput.sendKeys("Ivan");
    }

    public void enterLastName(String lastname){
        lastNameInput.click();
        lastNameInput.sendKeys("Ivanov");
    }

    public void enterAddress1(String address1){
        address1Input.click();
        address1Input.sendKeys("Berzu 1-17");
    }
    public void enterCity(String city){
        cityInput.click();
        cityInput.sendKeys("Hurgada");
    }

    public void enterPostCode(String postCode){
        postCodeInput.click();
        postCodeInput.sendKeys("12345");
    }

    public void selectState(String state){
        selectState.click();
        selectState.isSelected();
    }

    public void clickContinueBillingDetails(){
        continueFromBillingDetails.click();
    }

    //Update Delivery details
    public void setSelectExistingShippingAddress(){
        selectExistingShippingAddress.isSelected();
    }
    public void clickContinueFromShippingAddress(){
        continueFromShippingAddress.click();
    }

    //Update Delivery Method
    public void setFlatRateSelection(){
        flatRateSelection.isSelected();
    }
    public void setContinueFromDeliveryMethod() {
        continueFromDeliveryMethod.click();
    }
    //Update Payment Method
    public void setAgreeTermsAndConditions(){
        agreeTermsAndConditions.click();
    }
    public void setContinueFromPaymentMethod(){
        continueFromPaymentMethod.click();
    }
    //Confirm order checkout
    public void clickConfirmButton(){
        confirmButton.click();
    }
    public String getSuccessFullCheckoutUrl() { return "http://www.demoshop24.com/index.php?route=checkout/success";}
    //click history link after successful checkout
    public void clickOrderHistoryLinkAfterCheckout(){
        accessOrderHistory.click();
    }

    public String getOrderHistoryPage() { return "http://www.demoshop24.com/index.php?route=account/order";}
}
