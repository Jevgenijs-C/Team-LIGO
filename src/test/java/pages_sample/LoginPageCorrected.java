package pages_sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPageCorrected {

    @FindBy(how = How.ID, using = "input-email")
    private WebElement emailInput;
    @FindBy(how = How.ID, using = "input-password")
    private WebElement passwordInput;
    @FindBy(how = How.CSS, using = "submit")
    private WebElement loginButton;




    public String getLoginPageUrl() {
        return "http://www.demoshop24.com/index.php?route=account/login";
    }

    public String getAccountPageUrl() {
        return "http://www.demoshop24.com/index.php?route=account/account";
    }

    public void enterEmail(String name) {
        emailInput.click();
        emailInput.sendKeys("ivan@ivanov.lv");
    }
    public  void enterPassword(String password) {
        passwordInput.click();
        passwordInput.sendKeys("123456");
    }
    public void clickLogin() {
        loginButton.click();

    }
}
