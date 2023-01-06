package com.Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(xpath = "//input[@id=\"ap_email\"]")
    public WebElement inputUserNameorEmailInput_loc;

    @FindBy(xpath = "//input[@id=\"continue\"]")
    public WebElement continiueBtn_loc;

    @FindBy(xpath = "//input[@id=\"ap_password\"]")
    public WebElement passwordInput_loc;

    @FindBy(xpath = "//input[@id=\"signInSubmit\"]")
    public WebElement signInBtn_loc;
}
