package com.saucedemo.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Then;

public class VerifyLockedOutUserMessageSteps extends Driver{
	
	@Then("he should see the error message {string}")
	public void he_should_see_the_error_message(String string) {
	    
		String expectedErrMsg = string;
		String ActualErrMsg = landingPage.getErrorMessage();
		Assert.assertEquals(ActualErrMsg, expectedErrMsg);
	}
}
