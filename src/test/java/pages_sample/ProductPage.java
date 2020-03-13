package pages_sample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.StringSelection;

public class ProductPage {

    WebDriver driver;

    @FindBy(how = How.CSS, using = ".col-sm-4 ul h2")
    private WebElement DiscountPrice;
    @FindBy(how = How.CSS, using = ".col-sm-4 ul span")
    private WebElement OriginalPrice;
    @FindBy(how = How.CSS, using = ".radio input[value='5']")
    private WebElement SmallSizeRadio;
    @FindBy(how = How.CSS, using = ".radio input[value='6']")
    private WebElement MediumSizeRadio;
    @FindBy(how = How.CSS, using = ".radio input[value='7']")
    private WebElement LargeSizeRadio;
    @FindBy(how = How.CSS, using = ".checkbox input[value='8']")
    private WebElement Checkbox1;
    @FindBy(how = How.ID, using = "input-option208")
    private WebElement TextInput;
    @FindBy(how = How.ID, using = "input-option217")
    private WebElement Select;
    @FindBy(how = How.CSS, using = "#input-option217 option[value='1']")
    private WebElement ColorGreenSelect;
    @FindBy(how = How.ID, using = "input-option209")
    private WebElement Textarea;
    @FindBy(how = How.CSS, using = "label ~ button[id^='button-upload']")
    private WebElement UploadButton;
    @FindBy(how = How.CSS, using = "button#button-cart")
    private WebElement AddToCartButton;
    @FindBy(how = How.ID, using = "input-quantity")
    private WebElement QuantityInput;

    public void CheckDiscountPresence() {
        assertTrue(DiscountPrice.isDisplayed());
    }

    public void CheckOriginalPricePresence() {
        assertTrue(OriginalPrice.isDisplayed());
    }

    public void CheckOriginalPriceDecor() {
        assertEquals("line-through", OriginalPrice.getCssValue("text-decoration-line"));
    }

    public void ChooseProductSize() {
        MediumSizeRadio.click();
    }

    public void ChooseCheckbox() {
        Checkbox1.click();
    }

    public void SelectColor() {
        Select.click();
        ColorGreenSelect.click();
    }

    public void TextIntoTextarea() {
        Textarea.sendKeys("Heeeeeeey");
    }

    public void UploadFile() {
        //document.querySelector("#input-option222").type = 'file';
        // ((JavascriptExecutor) driver).executeScript("document.querySelector(\"#input-option222\").type = 'file';");
      //   UploadButton.sendKeys("C:\\Users\\ianina.spirova\\Downloads\\AT3.pdf");


    }
    public void ClickUpload(){
        UploadButton.click();
    }

    public void ChooseQuantity() {
        QuantityInput.clear();
        QuantityInput.sendKeys("2");
    }

    public void AddToCart() {
        AddToCartButton.click();
    }
}
