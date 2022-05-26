Feature: This is the login feature for orange HRM

Scenario Outline: This is login scenario

Given  login page will be displayed

When  enter the  credentials "<UserName>" and "<Password>"

And click the login button

Examples:
|UserName | Password| 
|Admin    | admin123|
|Admin    | admin13|


