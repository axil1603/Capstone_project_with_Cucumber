Feature: Last name requirement 

Scenario: a user must enter his last name before chekout 
Given a user is on the landing page
When he enters the username "problem_user" in the Username textbox
And he enters the password "secret_sauce" in the Password Textbox
And he clicks on Login button
And he adds the first product to the cart
And he clicks on the cart icon at top right corner
And he clicks on Checkout button
And he enters his first name in the First Name textbox
And he enters his last name in the Last Name textbox
And he enters the Postal Code in the Postal Code textbox
And he clicks on Continue button
Then he should see an error message "Error: Last Name is required"