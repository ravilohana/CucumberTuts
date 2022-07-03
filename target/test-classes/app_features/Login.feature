Feature: Login Feature

	Scenario Outline: Login Fail - possible combination
	Given User is on Application landing page
	When User click on Sign In button
	Then User is displayed login screen
	When User enters "<Username>" in username field
	And User enters "<Password>" in password field
	And User click on Sign In button
	Then User gets login failed error message
	
		Examples:
			| Username 					| Password 					|
			| IncorrectUsername | 123456 						|
			| ravilohana 				| IncorrectPassword |
			| incorrectUsername | IncorrectPassword |