package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static org.junit.Assert.*;

public class OrderHistoryPage {
    @FindBy(how = How.CLASS_NAME,using = "table table-bordered table-hover")
    private WebElement table;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Order ID')]")
    private WebElement orderID;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Customer')]")
    private WebElement customerInfo;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'No. of Products')]")
    private WebElement nrOfProducts;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Status')]")
    private WebElement status;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Total')]")
    private WebElement total;
    @FindBy(how = How.XPATH,using = "//*[contains(text(),'Date Added')]")
    private WebElement dateAdded;
    @FindBy(how = How.XPATH,using = "//*[@id=\"content\"]/div[1]/table/thead/tr/td[7]")
    private WebElement columnForEye;

    public String getOrderHistoryPage(){
        return "http://www.demoshop24.com/index.php?route=account/order";
    }

    public void checkOrderID(){
        assertTrue(orderID.isDisplayed());
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
}
