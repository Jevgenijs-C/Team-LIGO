package pages_sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import cucumber.api.DataTable;
import org.openqa.selenium.Alert;

import java.util.List;
import java.util.Map;


import static org.junit.Assert.*;


public class ShoppingCartPage {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart-total\"]")
    private WebElement rightButton;
    @FindBy(how = How.CSS, using = ":nth-child(4) > a > i")
    private WebElement topButton;
    @FindBy(how = How.XPATH, using = "//*[@id='cart']/ul/li/p")
    private WebElement listCart;
    @FindBy(how = How.CLASS_NAME, using = "input-lg")
    private WebElement nikonItem;
    @FindBy(how = How.XPATH, using = "//*[@id=\"button-cart\"]")
    private WebElement addButtonNik;
    @FindBy(how = How.XPATH, using = "//*[@id='content']//td[4]/div/input")
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
    @FindBy(how = How.CSS, using = " #search button")
    private WebElement searchButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]//h1")
    private WebElement pageElem;
    @FindBy(how = How.XPATH, using = " //*[@id=\"content\"]//li[1]/h2")
    private WebElement priceNikon;
    @FindBy(how = How.XPATH, using = " //*[@id=\"content\"]/p")
    private WebElement emptyCart;
    @FindBy(how = How.XPATH, using = " //*[@id='content']//div/table/tbody/tr/td[2]")
    private WebElement nikonInCart;
    @FindBy(how = How.XPATH, using = " //*[@id=\"content\"]//div[2]/h1")
    private WebElement appleOrigPage;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]//li[2]/h2")
    private WebElement appleOrigPrice;
    @FindBy(how = How.CSS, using = "#input-option218 [value=\"5\"]")
    private WebElement radioSmallapp;
    @FindBy(how = How.CSS, using = "#input-option223 [value=\"8\"]")
    private WebElement checkBox2app;
    @FindBy(how = How.NAME, using = "option[208]")
    private WebElement textFieldapp;
    @FindBy(how = How.ID, using = "input-option217")
    private WebElement selectApp;
    @FindBy(how = How.ID, using = "#input-option217 [value=\"4\"]")
    private WebElement selectColorApp;
    @FindBy(how = How.NAME, using = "option[209]")
    private WebElement textAreaapp;
    @FindBy(how = How.ID, using = "Button-upload222")
    private WebElement btnUpload;
    @FindBy(how = How.CSS, using = "div.caption > h4 > a")
    private WebElement samsungInSearch;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]//div[2]/h1")
    private WebElement samsungInOrig;
    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]//li[1]/h2")
    private WebElement samsungPriseOrig;
    @FindBy(how = How.CSS, using = ".alert-danger.alert-dismissible")
    private WebElement alertStock;
    @FindBy(how = How.CSS, using = "div.caption > h4 > a")
    private WebElement nikonInSearch;
    @FindBy(how = How.CSS, using = ":nth-child(1) > strong > i")
    private WebElement alertCartBtn;
    @FindBy(how = How.CSS, using = "div > table > tbody > tr > td:nth-child(2) > a")
    private WebElement samsungCart;
    @FindBy(how = How.CSS, using = "td:nth-child(2) > span")
    private WebElement stateStock;
    @FindBy(how = How.CSS, using = "#cart  li:nth-child(2) > div")
    private WebElement listItem;


    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public String getOpenPage() {
        return "http://www.demoshop24.com/index.php?route=common/home";
    }

    public String getRandomPage() {
        return "http://www.demoshop24.com/index.php?route=information/contact";
    }

    public String getNewRandomPage() {
        return "http://www.demoshop24.com/index.php?route=product/product&product_id=40";
    }

    public void getCartPageNik() {
        assertEquals("http://www.demoshop24.com/index.php?route=checkout/cart", driver.getCurrentUrl());
    }

    public String getNiconPage() {
        return "http://www.demoshop24.com/index.php?route=product/product&product_id=31&search=Nikon+D300";
    }

    public String getApplePage() {
        return "http://www.demoshop24.com/index.php?route=product/product&path=25_28&product_id=42";
    }

    public void getSamsungSearchPage() {
        assertEquals("http://www.demoshop24.com/index.php?route=product/search&search=Samsung%20Galaxy%20Tab%2010.1", driver.getCurrentUrl());

    }

    public void getSamsungPage() {
        assertEquals("http://www.demoshop24.com/index.php?route=product/product&product_id=49&search=Samsung+Galaxy+Tab+10.1", driver.getCurrentUrl());
    }

    public String getSamsungMonPage() {
        return "http://www.demoshop24.com/index.php?route=product/product&path=25_28&product_id=33";
    }

    public String getAppleSearchnPage() {
        return "http://www.demoshop24.com/index.php?route=product/search&search=Apple%20Cinema%2030%22";
    }

    public void getNiconSearchPage() throws InterruptedException {
        Thread.sleep(1000);
        assertEquals("http://www.demoshop24.com/index.php?route=product/search&search=Nikon%20D300", driver.getCurrentUrl());


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

    public void clickSearchButton() {
        searchButton.click();

    }

    public void addSearch(Map<String, String> cartItem) {
        for (Map.Entry<String, String> e : cartItem.entrySet()) {
            if (e.getKey().equals("item")) {
                searchField.sendKeys(e.getValue());
            }
        }
    }

    public void itemFound(Map<String, String> addedItem) {
        for (Map.Entry<String, String> e : addedItem.entrySet()) {
            if (e.getKey().equals("item")) {
                assertEquals(pageElem.getText(), e.getValue());
            } else if (e.getKey().equals("price")) {
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

        for (int i = 1; i < cartItemsList.size(); i++) {

            for (Map.Entry<String, String> e : cartItemsList.get(i).entrySet()) {
                if (e.getKey().equals("name")) {
                    assertEquals(nikonInCart.getText(), e.getValue());
                } else if (e.getKey().equals("quantity")) {
                    assertEquals(cartElemNum.getText(), e.getValue());
                } else if (e.getKey().equals("price")) {
                    assertEquals(priceFieldCart.getText(), e.getValue());
                } else if (e.getKey().equals("total")) {
                    assertEquals(totalPrice.getText(), e.getValue());
                }
            }
        }

    }

    public void searchdNikon() {
        assertTrue(nikonInSearch.isDisplayed());
    }

    public void clickNikon() {
        nikonInSearch.click();
    }

    public void newSearch(Map<String, String> newItem) {
        for (Map.Entry<String, String> e : newItem.entrySet()) {
            if (e.getKey().equals("item")) {
                searchField.sendKeys(e.getValue());
            }
        }
    }

    public void searchdSamsung() {
        assertTrue(samsungInSearch.isDisplayed());
    }

    public void clickSamsung() {
        samsungInSearch.click();
    }

    public void samsungFound(Map<String, String> samsung) {
        for (Map.Entry<String, String> e : samsung.entrySet()) {
            if (e.getKey().equals("item")) {
                assertEquals(samsungInOrig.getText(), e.getValue());
            }
        }
    }

    public void rightCartItem() throws InterruptedException {
        Thread.sleep(10000);
        assertTrue(listItem.isEnabled());
        assertTrue(alertCartBtn.isDisplayed());
        alertCartBtn.click();
    }

    public void samsungInCart(Map<String, String> inCart) {
        for (Map.Entry<String, String> e : inCart.entrySet()) {
            if (e.getKey().equals("item")) {
                assertEquals(samsungCart.getText(), e.getValue());
            } else if (e.getKey().equals("state")) {
                assertEquals(stateStock.getText(), e.getValue());

            }
        }
    }

    public void alertMessage(String r) {
        String er = alertStock.getAttribute("innerText");
        String[] arrStr = er.split("!", 2);
        assertEquals("rgba(242, 222, 222, 1)", alertStock.getCssValue("background-color"));
        assertEquals(r, arrStr[0]);

    }

    public void noClick() {
        assertNotEquals("http://www.demoshop24.com/index.php?route=checkout/cart", driver.getCurrentUrl());

    }

    public void twoItemsFill() {
        radioSmallapp.click();
        checkBox2app.click();

    }

    public void allItemsFill() {
        radioSmallapp.click();
        checkBox2app.click();
        textFieldapp.sendKeys("Hi!");
        selectApp.click();
        selectColorApp.click();
        textAreaapp.sendKeys("supercalifragilisticexpialidocious");
        //btnUpload.sendKeys("C:\workspace/jvm-options-cheat-sheet.pdf);


    }

}




