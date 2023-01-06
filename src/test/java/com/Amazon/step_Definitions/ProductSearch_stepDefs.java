package com.Amazon.step_Definitions;

import com.Amazon.pages.CartPage;
import com.Amazon.pages.DashboardPage;
import com.Amazon.pages.ProductSearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class ProductSearch_stepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    ProductSearchPage productSearchPage = new ProductSearchPage();
    CartPage cartPage = new CartPage();
    String productName = null;

    @When("The user should be able to search {string} this item")
    public void the_user_should_be_able_to_search_this_item(String productName) {
        dashboardPage.searchBox_loc.sendKeys(productName);
        dashboardPage.searchBtn_loc.click();
    }

    @Then("For the best result choose above four stars and the sort by the {string}")
    public void for_the_best_result_choose_above_four_stars_and_the_sort_by_the(String TypeOfSort) {
        productSearchPage.selectStar_loc.click();
        Select select = new Select(productSearchPage.dropDownSort_loc);
        select.selectByVisibleText(TypeOfSort);

    }


    @Then("The user should be able to see items and add to card it and verify that")
    public void the_user_should_be_able_to_see_items_and_add_to_card_it_and_verify_that() {
        productSearchPage.product_loc.click();
        this.productName = productSearchPage.productName_loc.getText();
        productSearchPage.addToCardBtn_loc.click();
        String expectedMessage = "Subtotal";
        String actualMessage = productSearchPage.subtotal_loc.getText();
        Assert.assertEquals("The product didn't add to cart", expectedMessage, actualMessage);
    }

    @Then("The user should be able to see item in the card")
    public void the_user_should_be_able_to_see_item_in_the_card() {
        productSearchPage.goToCartBtn_loc.click();

        String expectedName = cartPage.productName_loc.getText();
        Assert.assertEquals("Wrong Product",expectedName,this.productName);
    }

}
