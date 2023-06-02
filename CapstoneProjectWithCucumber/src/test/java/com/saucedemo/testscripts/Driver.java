package com.saucedemo.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.saucedemo.pages.CheckoutComplete;
import com.saucedemo.pages.CheckoutInfo;
import com.saucedemo.pages.CheckoutSummary;
import com.saucedemo.pages.Inventory;
import com.saucedemo.pages.LandingPage;
import com.saucedemo.pages.ShoppingCart;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	protected static Inventory inventory;
	protected static ShoppingCart shoppingCart;
	protected static CheckoutInfo checkoutInfo;
	protected static CheckoutSummary checkoutSummary;
	protected static CheckoutComplete checkoutComplete;
	
	public static void init() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://saucedemo.com/");
		
		landingPage = new LandingPage(driver);
		inventory = new Inventory(driver);
		shoppingCart = new ShoppingCart(driver);
		checkoutInfo = new CheckoutInfo(driver);
		checkoutSummary = new CheckoutSummary(driver);
		checkoutComplete = new CheckoutComplete(driver);
		
	}

}
