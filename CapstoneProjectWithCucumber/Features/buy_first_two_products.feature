Feature: Buy the first two products from the list of products on Saucedemo

Scenario: A user should be able to buy the first two products on Saucedemo successfully
Given a user is on the landing page
When he enters the username "standard_user" in the Username textbox
And he enters the password "secret_sauce" in the Password Textbox
And he clicks on Login button
And he adds the two first products to the cart
And he clicks on the cart icon at top right corner
And he clicks on Checkout button
And he enters his first name in the First Name textbox
And he enters his last name in the Last Name textbox
And he enters the Postal Code in the Postal Code textbox
And he clicks on Continue button
And he clicks on Finish button on the next page
Then he should see the message "Your order has been dispatched, and will arrive just as fast as the pony can get there!"