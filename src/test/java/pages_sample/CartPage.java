package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;


public class CartPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]")
    private WebElement UnitPrice;
    public void DiscountCheck(){
        assertEquals("$159.20", UnitPrice.getText());
    }

}

