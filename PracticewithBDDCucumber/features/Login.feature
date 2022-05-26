@SimpleLogin
Feature: This is the login feature for orange HRM
@Positive
Scenario: This is login scenario

Given user is on the login page

When the user enters the valid username and password

And clicks on the login button

Then the user should be navigates to the home page


@Negative
Scenario: This is login scenario

Given user is on the login page

When the user enters the valid username and password

And clicks on the login button

Then the user should be navigates to the home page