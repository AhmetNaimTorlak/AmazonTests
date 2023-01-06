package com.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//span[@class=\"a-truncate-cut\"][@style=\"height: 2.6em;\"]")
    public WebElement productName_loc;

}
