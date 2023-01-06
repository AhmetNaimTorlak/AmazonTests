package com.Amazon.pages;

import com.Amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//span[@class=\"nav-line-2 \"]")
    public WebElement signInBtn_loc;

    @FindBy(xpath = "//a[@id=\"nav-logo-sprites\"]")
    public WebElement amazonLogo_loc;

    @FindBy(xpath = "//input[@id=\"twotabsearchtextbox\"]")
    public WebElement searchBox_loc;

    @FindBy(xpath = "//input[@id=\"nav-search-submit-button\"]")
    public WebElement searchBtn_loc;

    @FindBy(xpath = "//a[@href=\"/gp/css/order-history?ref_=nav_orders_first\"]")
    public WebElement returnAndOrders_loc;

    @FindBy(xpath = "//span[@class=\"nav-cart-icon nav-sprite\"]")
    public WebElement cardIcon_loc;

    public WebElement allBtns_loc(String chooseBtn){
        //Today's Deal, Buy Again, Customer Service, Gift Card, Registry, Sell
        return Driver.get().findElement(By.xpath("//a[text()='"+chooseBtn+"'][@tabindex='0']"));
    }

    @FindBy(xpath = "//a[@id=\"swm-link\"]")
    public WebElement shopDealsInElectronic_loc;

}
