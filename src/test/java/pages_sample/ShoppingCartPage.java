package pages_sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static org.junit.Assert.*;


public class ShoppingCartPage {
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart-total\"]")
    private WebElement rightButton;
    @FindBy(how = How.XPATH, using = "//*[@id='top-links']/ul/li[4]/a")
    private WebElement topButton;
    @FindBy(how = How.XPATH, using = "//*[@id='cart']/ul/li/p")
    private WebElement listCart;


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

}



