Feature: This is to test google search
Scenario: Google search sceanrio
	Given user is entering google.co.in
	When user is typing the search term "roseflower"
	And enters the return key
	Then the user sould see the search results