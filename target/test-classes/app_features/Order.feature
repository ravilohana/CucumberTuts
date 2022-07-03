Feature: Amazon Order Page
	In order to check my order detail
	As a register user
	I want to specify the features of order details page
	
	
Background:
	Given a registered user exits
	Given user is on Amazon login page
	When user enters username
	And user enters password
	And user click on login button
	Then user navigates to order page
	
Scenario: Check Previous Order Details
	When user click on Order link
	Then user checks the previous order deatils
	
	
Scenario: Check Open Order Details
	When user click on Open Order link
	Then user check the open order details
	
	
Scenario: Check Cancelled Order Details
	When user click on Cancelled Order link
	Then user check the cancelled order details
	

	

