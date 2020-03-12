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

    public void addSearch(Map<String, String> cartItem) throws Throwable { {
     for (Map.Entry<String, String> e : cartItem.entrySet()) {
         searchField.sendKeys(cartItem);
                driver.findElement(By.id(e.getKey())).sendKeys(e.getValue());
                System.out.println("key is " + e.getKey());
                System.out.println("value is " + e.getValue());
            }
        }
        searchField.sendKeys(cartItem);

    }

    public void itemsExist() {
        assertTrue(nikon300.isDisplayed());
        assertTrue(priceNikon.isDisplayed());

    }

    public void clickAddButton() {
        addButtonNik.click();
    }

    public void cartParam(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
      data.get(1);
      data.get(2);
      data.get(3);
      data.get(4);

       // assertEquals("", cartElemNum.getAttribute());
    }

    public void deleteItem() {
        delElem.click();

    }
        public void isEmptyCart() {
            assertEquals(emptyCart.getText(),"Your shopping cart is empty!");

    }
}


