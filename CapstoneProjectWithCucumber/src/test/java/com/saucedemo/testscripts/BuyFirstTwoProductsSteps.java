package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyFirstTwoProductsSteps extends Driver {
	
	@Given("a user is on the landing page")
	public void a_user_is_on_the_landing_page() {
		String expectedTitle = "Swag Labs";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	}
	@When("he enters the username {string} in the Username textbox")
	public void he_enters_the_username_in_the_username_textbox(String string) {
	   landingPage.enterUsername(string);
	}

	@When("he enters the password {string} in the Password Textbox")
	public void he_enters_the_password_in_the_password_textbox(String string) {
	   landingPage.enterPassword(string);
	}

	@When("he clicks on Login button")
	public void he_clicks_on_login_button() {
	    landingPage.clickLoginBtn();
	}

	@When("he adds the two first products to the cart")
	public void he_adds_the_two_first_products_to_the_cart() {
	   inventory.addFirstProduct();
	   inventory.addSecoundProduct();
	}

	@When("he clicks on the cart icon at top right corner")
	public void he_clicks_on_the_cart_icon_at_top_right_corner() {
	    inventory.clickOnShoppingCart();
	}

	@When("he clicks on Checkout button")
	public void he_clicks_on_checkout_button() {
	   shoppingCart.clickOnCheckoutButton();
	}

	@When("he enters his first name in the First Name textbox")
	public void he_enters_his_first_name_in_the_first_name_textbox() {
	  checkoutInfo.enterFirstName("Jason");
	}

	@When("he enters his last name in the Last Name textbox")
	public void he_enters_his_last_name_in_the_last_name_textbox() {
		checkoutInfo.enterLastName("Bourne");
		  
	}

	@When("he enters the Postal Code in the Postal Code textbox")
	public void he_enters_the_postal_code_in_the_postal_code_textbox() {
		checkoutInfo.enterPostalCode("10001");
	}

	@When("he clicks on Continue button")
	public void he_clicks_on_continue_button() {
	   checkoutInfo.clickCintinueBtn();
	}

	@When("he clicks on Finish button on the next page")
	public void he_clicks_on_finish_button_on_the_next_page() {
	    checkoutSummary.clickOnFinishBtn();
	}

	@Then("he should see the message {string}")
	public void he_should_see_the_message(String string) {
		String expectedMessage = string;
		String actualMessage = checkoutComplete.getSuccessMsg();
		Assert.assertEquals(actualMessage, expectedMessage);
	    
	}

	
}
