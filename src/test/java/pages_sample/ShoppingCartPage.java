package pages_sample;

import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import cucumber.api.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import static org.junit.Assert.*;


public class ShoppingCartPage {
    private WebDriver driver;
    private String cartItem;


    @FindBy(how = How.XPATH, using = "//*[@id=\"cart-total\"]")
    private WebElement rightButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"top-links\"]/ul/li[4]/a/i")
    private WebElement topButton;
    @FindBy(how = How.XPATH, using = "//*[@id='cart']/ul/li/p")
    private WebElement listCart;
    @FindBy(how = How.CLASS_NAME, using = "input-lg")
    private WebElement nikonItem;
    @FindBy(how = How.XPATH, using = "//*[@id=\"button-cart\"]")
    private WebElement addButtonNik;
    @FindBy(how = How.NAME, using = "quantity[3804]")
    private WebElement cartElemNum;
    @FindBy(how = How.CLASS_NAME, using = "fa-refresh")
    private WebElement cartRefresh;
    @FindBy(how = How.CLASS_NAME, using = "fa-times-circle")
    private WebElement delElem;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]")
    private WebElement priceFieldCart;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[6]")
    private WebElement totalPrice;
    @FindBy(how = How.NAME, using = "search")
    private WebElement searchField;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]//h1")
    private WebElement nikon300;
    @FindBy(how = How.XPATH, using = " //*[@id=\"content\"]//li[1]/h2")
    private WebElement priceNikon;
    @FindBy(how = How.XPATH, using = " //*[@id=\"content\"]/p")
    private WebElement emptyCart;
    @FindBy(how = How.XPATH, using = " //*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")
    private WebElement nikonInCart;


    public String getOpenPage() {
        return "http://www.demoshop24.com/index.php?route=common/home";
    }

    public String getRandomPage() {
        return "http://www.demoshop24.com/index.php?route=information/contact";
    }

    public String getNewRandomPage() {
        return "http://www.demoshop24.com/index.php?route=product/product&product_id=40";
    }

    public String getCartPage() {
        return "http://www.demoshop24.com/index.php?route=checkout/cadt";
    }

    public String getNiconPage() {
        return "http://www.demoshop24.com/index.php?route=product/product&path=33&product_id=31";
    }

    public String getApplePage() {
        return "http://www.demoshop24.com/index.php?route=product/product&path=25_28&product_id=42";
    }

    public String getSamsungPage() {
        return "http://www.demoshop24.com/index.php?route=product/product&product_id=49&search=+Tab+10.1";
    }

    public String getSamsungMonPage() {
        return "http://www.demoshop24.com/index.php?route=product/product&path=25_28&product_id=33";
    }


    public void checkRightButton() {
        assertTrue(rightButton.isDisplayed());

    }

    public void checkTopButton() {
        assertTrue(topButton.isDisplayed());

    }

    public void listOfCart(String name) {

        assertEquals(listCart.getText(), "Your shopping cart is empty!");
    }

    public void clickTopButton() {
        topButton.click();

    }

    public void clickRightButton() {
        rightButton.click();

    }

    public void addSearch(Map<String, String> cartItem) {
        for (Map.Entry<String, String> e : cartItem.entrySet()) {
            if (e.getKey() == "item") {
                searchField.sendKeys(e.getValue());
            }
        }
    }

    public void itemFound(Map<String, String> addedItem) {
        for (Map.Entry<String, String> e : addedItem.entrySet()) {
            if (e.getKey() == "item") {
                assertEquals(nikon300.getText(), e.getValue());
            } else if (e.getKey() == "price") {
                assertEquals(priceNikon.getText(), e.getValue());
            }
        }
    }

    public void clickAddButton() {
        addButtonNik.click();
    }

    public void deleteItem() {
          delElem.click();

    }

    public void IsEmptyCart(String message) throws InterruptedException {
        Thread.sleep(10000);
        assertEquals(emptyCart.getText(), "Your shopping cart is empty!");

    }

    public void itemsExist(DataTable cartItems) {

        List<Map<String, String>> cartItemsList = cartItems.asMaps(String.class, String.class);

        for (int i = 0; i < cartItemsList.size(); i++) {

            for (Map.Entry<String, String> e : cartItemsList.get(i).entrySet()) {
                if (e.getKey() == "name") {
                    assertEquals(nikonInCart.getText(), e.getValue());
                } else if (e.getKey() == "quantity") {
                    assertEquals(cartElemNum.getText(), e.getValue());
                } else if (e.getKey() == "price") {
                    assertEquals(priceFieldCart.getText(), e.getValue());
                } else if (e.getKey() == "total") {
                    assertEquals(totalPrice.getText(), e.getValue());
                }
            }
        }

    }


}




