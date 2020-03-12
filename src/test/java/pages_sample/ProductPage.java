package pages_sample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ProductPage {

    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"content\"]/div[1]/div[2]/ul[2]/li[1]/span")
    private WebElement DiscountPrice;
    @FindBy(how = How.NAME, using = "//*[@id=\"input-option218\"]/div[1]/label/input")
    private WebElement SmallSizeRadio;
    @FindBy(how = How.XPATH, using = "//*[@id=\"input-option218\"]/div[2]/label/input")
    private WebElement MediumSizeRadio;
    @FindBy(how = How.XPATH, using = "//*[@id=\"input-option218\"]/div[3]/label/input")
    private WebElement LargeSizeRadio;
    @FindBy(how = How.XPATH, using = "//*[@id=\"input-option223\"]/div[1]/label/input")
    private WebElement Checkbox1;
    @FindBy(how = How.XPATH, using = "//*[@id=\"input-option217\"]/option[3]")
    private WebElement TextInput;
    @FindBy(how = How.ID, using = "input-option217")
    private WebElement Select;
    @FindBy(how = How.XPATH, using = "//*[@id='input-option217']/option[4]")
    private WebElement ColorGreenSelect;
    @FindBy(how = How.ID, using = "input-option209")
    private WebElement Textarea;
    @FindBy(how = How.CSS, using = "button ~ input[id^='input-option']")
    private WebElement UploadButton;
    @FindBy(how = How.ID, using = "button-cart")
    private WebElement AddToCartButton;

    public void CheckDiscountPresence() {
        assertTrue(DiscountPrice.isDisplayed());
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
    public void UploadFile(){
        //document.querySelector("#input-option222").type = 'file';
        ((JavascriptExecutor)driver).executeScript("document.querySelector(\"#input-option222\").type = 'file';");

        UploadButton.sendKeys("C:\\Users\\ianina.spirova\\Downloads\\AT3.pdf");
    }
    public void AddToCart(){
        AddToCartButton.click();
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
