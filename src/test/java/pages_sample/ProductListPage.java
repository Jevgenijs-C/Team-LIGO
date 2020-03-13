package pages_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ProductListPage {

    @FindBy(how = How.XPATH, using = "//a[contains(., 'Apple Cinema')]/parent::*//following-sibling::*//span[contains(@class, 'price-new')]")
    private WebElement DiscountPrice;
    @FindBy(how = How.XPATH, using = "//a[contains(., 'Apple Cinema')]/parent::*//following-sibling::*//span[contains(@class, 'price-old')]")
    private WebElement OriginalPrice;
    @FindBy(how = How.XPATH, using = "//a[contains(., 'Apple Cinema')]")
    private WebElement AppleCinemaLink;
    private WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }


    public String getDesktopsPageUrl() {
        return "http://www.demoshop24.com/index.php?route=product/category&path=20";
    }
    public String getLaptopsNotebooksPageUrl() {
        return "http://www.demoshop24.com/index.php?route=product/category&path=18";
    }

    public void CheckDiscountPresence(String discount) {
        assertTrue(driver.findElement(By.xpath("//a[contains(., '"+discount+"')]/parent::*//following-sibling::*//span[contains(@class, 'price-new')]")).isDisplayed());
    }
    public void CheckOriginalPricePresence(String originalPrice) {
        assertTrue(driver.findElement(By.xpath("//a[contains(., '"+originalPrice+"')]/parent::*//following-sibling::*//span[contains(@class, 'price-old')]")).isDisplayed());
    }
    public void CheckOriginalPriceDecor(String originalPrice) {
        assertEquals("line-through", driver.findElement(By.xpath("//a[contains(., '"+originalPrice+"')]/parent::*//following-sibling::*//span[contains(@class, 'price-old')]")).getCssValue("text-decoration-line"));
    }
    public void ClickOnProduct(String productName) {
       driver.findElement(By.xpath("//a[contains(., '"+productName+"')]")).click();
    }
    public void DiscountCalculationCheck(String product, String discountPrice) {
        assertEquals(discountPrice, driver.findElement(By.xpath("//a[contains(., '"+product+"')]/parent::*//following-sibling::*//span[contains(@class, 'price-new')]")).getText());
    }

}
