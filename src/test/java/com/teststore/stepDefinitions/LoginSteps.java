package com.teststore.stepDefinitions;

import com.teststore.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    WebDriver driver;

    public LoginSteps() throws IOException {
    }

//    public LoginSteps(LoginPage loginPage) throws IOException {
//        this.loginPage = loginPage;
//
//    }

    @Given("I am on the test-store website")
    public void i_am_on_the_test_store_website() {
        loginPage.navigateToTestStore_Login_Page();
    }
    @When("I enter a username {string}")
    public void i_enter_a_username(String userName) throws IOException {
        loginPage.enterUserName(userName);

    }
    @And("I enter a password {string}")
    public void i_enter_a_password(String password) throws IOException {
        loginPage.enterUserPassword(password);

    }
    @When("I click sign in")
    public void i_click_sign_in() throws IOException {
        loginPage.clickSignIn();
    }
    @Then("I should be on the store page")
    public void i_should_be_on_the_store_page() {
        loginPage.clickSignOutBtn();
        System.out.println("done");
        //loginPage.validate_SuccessfulLogin_Message("Test Test");
    }

}
