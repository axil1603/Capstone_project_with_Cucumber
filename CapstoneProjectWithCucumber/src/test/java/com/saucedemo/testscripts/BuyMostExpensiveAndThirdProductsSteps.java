package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.When;

public class BuyMostExpensiveAndThirdProductsSteps extends Driver {
	
	@When("he adds the first and third products to the cart")
	public void he_adds_the_first_and_third_products_to_the_cart() {
	    inventory.addFirstProduct();
	    inventory.addThirdProduct();
	}
	@When("he removes the first product from the cart")
	public void he_removes_the_first_product_from_the_cart() {
	    inventory.removeFirstProduct();
	}
	@When("he verify the text {string} is displayed at the top left corner of the page.")
	public void he_verify_the_text_is_displayed_at_the_top_left_corner_of_the_page(String string) {
	   String expectedText = string;
	   String actualText = shoppingCart.VerifyDisplayedText();
	   Assert.assertEquals(actualText, expectedText);
	}
	@When("he clicks on Continue Shopping button")
	public void he_clicks_on_continue_shopping_button() {
		shoppingCart.clickContinueShoppingBtn();
	}
	@When("he sorts the products based on price from high to low")
	public void he_sorts_the_products_based_on_price_from_high_to_low() {
	   inventory.sortProductPriceHighToLow();
	}
	@When("he adds the most expensive item to the cart")
	public void he_adds_the_most_expensive_item_to_the_cart() {
	    inventory.addMostExpensiveProduct();
	}
	@When("he verifys that there are two items in the cart")
	public void he_verifys_that_there_are_two_items_in_the_cart() {
		int expectedTotalItemsInCart = 2;
		int totalItemsInCart = shoppingCart.verifyTotalItemsInCart();
		Assert.assertEquals(totalItemsInCart, expectedTotalItemsInCart);
	}

}
