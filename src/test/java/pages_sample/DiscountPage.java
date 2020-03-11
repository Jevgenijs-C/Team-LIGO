package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DiscountPage {
    //Pages
    public String getDesktopsPageUrl() {
        return "http://www.demoshop24.com/index.php?route=product/category&path=20";
    }
    public String getLaptopsAndNotebooksPageUrl() {
        return "http://www.demoshop24.com/index.php?route=product/category&path=18";
    }
    public String getAppleCinemaPageUrl() {
        return "http://www.demoshop24.com/index.php?route=product/product&path=20&product_id=42";
    }
    public String getCanonEOS5DPageUrl() {
        return "http://www.demoshop24.com/index.php?route=product/product&path=20&product_id=30";
    }
    public String getCartPageUrl() {
        return "http://www.demoshop24.com/index.php?route=checkout/cart";
    }
    //Elements
    @FindBy(how = How.PARTIAL_LINK_TEXT, using = "Apple Cinema 30")
    private WebElement AppleCinema30Title;
    @FindBy(how = How.XPATH, using = "//a[@href=\"http://www.demoshop24.com/index.php?route=product/product&path=20&product_id=42\"]/parent::div/parent::*//parent::*")
    private WebElement AppleCinema30Container;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/p[2]/span[1]")
    private WebElement AppleCinema30PriceOld;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/p[2]/span[2]")
    private WebElement AppleCinema30PriceNew;
    @FindBy(how = How.LINK_TEXT, using = "Canon EOS 5D")
    private WebElement CanonEOS5DTitle;
    @FindBy(how = How.XPATH, using = "//a[@href=\"http://www.demoshop24.com/index.php?route=product/product&path=20&product_id=30\"]/parent::div/parent::*//parent::*")
    private WebElement CanonEOS5DContainer;
//Methods


