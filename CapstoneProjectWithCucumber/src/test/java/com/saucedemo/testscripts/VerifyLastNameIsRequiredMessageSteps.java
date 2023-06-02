package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyLastNameIsRequiredMessageSteps extends Driver {
	
	@When("he adds the first product to the cart")
	public void he_adds_the_first_product_to_the_cart() {
	   inventory.addFirstProduct(); 
	}

	@Then("he should see an error message {string}")
	public void he_should_see_an_error_message(String string) {
		String expectedErrMsg = string;
		String actualErrMessage = checkoutInfo.getErrMsg();
		Assert.assertEquals(actualErrMessage, expectedErrMsg);
	}

}
