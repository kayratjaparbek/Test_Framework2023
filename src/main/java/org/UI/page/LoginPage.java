package org.UI.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author Kayrat Japarbek
 */

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginInputField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputField;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[@class='help-inline']")
    public WebElement emptyErrorMessage;

    public LoginPage fillUpUsernameAndPassword(String userName, String password) {
        webElementActions.sendKeys(loginInputField, userName)
                .sendKeys(passwordInputField, password);
        return this;
    }

    public LoginPage clickSubmitBtn() {
        webElementActions.click(submitBtn);
        return this;
    }


}
