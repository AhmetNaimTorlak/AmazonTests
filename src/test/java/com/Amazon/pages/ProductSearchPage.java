package com.Amazon.pages;

import com.Amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSearchPage extends BasePage {

    @FindBy(xpath = "//i[@class=\"a-icon a-icon-star-medium a-star-medium-4\"]")
    public WebElement selectStar_loc;

    @FindBy(xpath = "//select[@data-action=\"a-dropdown-select\"]")
    public WebElement dropDownSort_loc;

    @FindBy(xpath = "//img[@data-image-index=\"2\"]")
    public WebElement product_loc;

    @FindBy(xpath = "//input[@id=\"add-to-cart-button\"]")
    public WebElement addToCardBtn_loc;

    @FindBy(xpath = "//span[@class=\"a-size-medium-plus a-color-base sw-atc-text a-text-bold\"]")
    public WebElement added_loc;

    @FindBy(xpath = "//a[@href=\"/gp/cart/view.html?ref_=sw_gtc\"]")
    public WebElement goToCartBtn_loc;

    @FindBy(xpath = "//span[@id=\"productTitle\"]")
    public WebElement productName_loc;


}
