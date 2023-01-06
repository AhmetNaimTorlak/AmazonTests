package com.Amazon.step_Definitions;

import com.Amazon.pages.BasePage;
import com.Amazon.pages.DashboardPage;
import com.Amazon.pages.LoginPage;
import com.Amazon.utilities.BrowserUtils;
import com.Amazon.utilities.ConfigurationReader;
import com.Amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPage_stepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @Given("The user on the home page")
    public void the_user_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        dashboardPage.signInBtn_loc.click();
    }
    @When("The user enters email {string} and password {string}")
    public void the_user_enters_email_and_password(String email, String password) {
        loginPage.inputUserNameorEmailInput_loc.sendKeys(email);
        loginPage.continiueBtn_loc.click();
        BrowserUtils.waitForVisibility(loginPage.passwordInput_loc,5);
        loginPage.passwordInput_loc.sendKeys(password);
        loginPage.signInBtn_loc.click();
    }
    @Then("The user should be on the home page after logged in")
    public void the_user_should_be_on_the_home_page_after_logged_in() {
        BrowserUtils.waitForVisibility(dashboardPage.signInBtn_loc,3);
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("You are on wrong page",expectedTitle,actualTitle);
    }


}
