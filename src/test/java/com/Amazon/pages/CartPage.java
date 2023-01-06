package com.Amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//span[@class=\"a-size-base-plus a-color-base sc-product-title sc-grid-item-product-title\"]")
    public WebElement productName_loc;

}
