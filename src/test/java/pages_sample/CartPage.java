package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;


public class CartPage {
    @FindBy(how = How.CSS, using = ".table-responsive tbody td.text-right")
    private WebElement UnitPrice;
    public void DiscountCheck(String discountPrice){
        assertEquals(discountPrice, UnitPrice.getText());
    }

}

