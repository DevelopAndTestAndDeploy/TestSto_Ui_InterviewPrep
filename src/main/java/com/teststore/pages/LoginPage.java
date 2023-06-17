package com.teststore.pages;

import com.teststore.base.BasePage;
import com.teststore.base.GlobalVars;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class LoginPage extends BasePage {

    WebDriver driver;

    public @FindBy(css = "section input[name='email']")
    WebElement textFieldUserName;

    public @FindBy(css = "[name='password']")
    WebElement textFieldPassword;

    public @FindBy(css = "button#submit-login")
    WebElement btnSignIn;

    public @FindBy(css = "[title] .hidden-sm-down")
    WebElement validationMessage;

    public @FindBy(css = ".hidden-sm-down.logout")
    WebElement btnSignOut;

    public LoginPage() throws IOException {
        super();
    }


    public void navigateToTestStore_Login_Page() {
        navigateTo_URL(GlobalVars.TEST_STORE_URL);

    }

    public void enterUserName(String userName) throws IOException {
        sendKeys(textFieldUserName, userName);
    }

    public void enterUserPassword(String password) throws IOException {
        sendKeys(textFieldPassword, password);
    }

    public void clickSignIn() throws IOException {
        btnSignIn.click();
    }

    public void validate_SuccessfulLogin_Message(String message) {
        waitForAlert_And_ValidateText(validationMessage, "Test Test");
    }

    public void clickSignOutBtn(){
        btnSignOut.click();

    }
}
