package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ProductListPage {

    @FindBy(how = How.XPATH, using = "//a[contains(., 'Apple Cinema')]/parent::*//following-sibling::*//span[contains(@class, 'price-new')]")
    private WebElement DiscountPrice;
    @FindBy(how = How.XPATH, using = "//a[contains(., 'Apple Cinema')]")
    private WebElement AppleCinemaLink;


    public String getDesktopsPageUrl() {
        return "http://www.demoshop24.com/index.php?route=product/category&path=20";
    }
    public String getLaptopsNotebooksPageUrl() {
        return "http://www.demoshop24.com/index.php?route=product/category&path=18";
    }

    public void CheckDiscountPresence() {
        assertTrue(DiscountPrice.isDisplayed());
    }
    public void ClickOnProduct() {
        AppleCinemaLink.click();
    }
    public void DiscountCalculationCheck() {
        assertEquals("$110.00", DiscountPrice.getText());
    }

}
