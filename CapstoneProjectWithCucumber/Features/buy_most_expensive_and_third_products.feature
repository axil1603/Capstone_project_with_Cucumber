Feature: Buy third and most expensive products

Scenario: A user should be able to add two products to the cart, delete one of them, and sort the products based on price from high to low to select the most expensive one.
Given a user is on the landing page
When he enters the username "standard_user" in the Username textbox
And he enters the password "secret_sauce" in the Password Textbox
And he clicks on Login button
And he adds the first and third products to the cart
And he removes the first product from the cart
And he clicks on the cart icon at top right corner
And he verify the text "Your Cart" is displayed at the top left corner of the page.
And he clicks on Continue Shopping button
And he sorts the products based on price from high to low
And he adds the most expensive item to the cart
And he clicks on the cart icon at top right corner
And he verifys that there are two items in the cart
And he clicks on Checkout button
And he enters his first name in the First Name textbox
And he enters his last name in the Last Name textbox
And he enters the Postal Code in the Postal Code textbox
And he clicks on Continue button
And he clicks on Finish button on the next page
Then he should see the success message "Thank you for your order!"