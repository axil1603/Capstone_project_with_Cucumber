Feature: Verify the error message generated for a locked out user

Scenario: A locked out user should see an error message when trying to login 
Given a user is on the landing page
When he enters the username "locked_out_user" in the Username textbox
And he enters the password "secret_sauce" in the Password Textbox
And he clicks on Login button
Then he should see the error message "Epic sadface: Sorry, this user has been locked out."