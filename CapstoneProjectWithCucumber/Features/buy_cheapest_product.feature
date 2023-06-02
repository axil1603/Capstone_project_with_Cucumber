Feature: buy the cheapest product

Scenario: A user should be able to sort the products based on price from low to high and select the first one
Given a user is on the landing page
When he enters the username "standard_user" in the Username textbox
And he enters the password "secret_sauce" in the Password Textbox
And he clicks on Login button
And he sorts the products based on price from low to high
And he adds the cheapest item to the cart
And he verifys the selected item has been added to the cart
And he clicks on Checkout button
And he enters his first name in the First Name textbox
And he enters his last name in the Last Name textbox
And he enters the Postal Code in the Postal Code textbox
And he clicks on Continue button
And he clicks on Finish button on the next page
Then he should see the success message "Thank you for your order!"