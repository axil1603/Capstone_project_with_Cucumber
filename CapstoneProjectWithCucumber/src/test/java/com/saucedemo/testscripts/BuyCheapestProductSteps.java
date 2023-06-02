package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyCheapestProductSteps extends Driver {
	
	@When("he sorts the products based on price from low to high")
	public void he_sorts_the_products_based_on_price_from_low_to_high() {
	    inventory.sortProductPriceLowToHigh();
	}
	@When("he adds the cheapest item to the cart")
	public void he_adds_the_cheapest_item_to_the_cart() {
	    inventory.addCheapestProduct();
	}
	@When("he verifys the selected item has been added to the cart")
	public void he_verifys_the_selected_item_has_been_added_to_the_cart() {
	   inventory.clickOnShoppingCart();
	   String expectedProductName = "Sauce Labs Onesie";
	   String actualProductName = shoppingCart.verifySelectedProduct();
	   Assert.assertEquals(actualProductName, expectedProductName);
	}
	@Then("he should see the success message {string}")
	public void he_should_see_the_success_message(String string) {
		String expectedMessage = string;
		String actualMessage = checkoutComplete.getThankYouMessage();
		Assert.assertEquals(actualMessage, expectedMessage);
	}

}
