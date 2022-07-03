Feature: Calculate Billing Amount
	Scenario Outline: Billing Amount
		Given User is on billing page
		When User enters the billing amount "<billingAmount>"
		When User enters tax amount "<taxAmount>"
		And User clicks on calculate button
		Then It gives the final amount "<finalAmount>"
		
			Examples:
				| billingAmount | taxAmount	| finalAmount |
				| 1000					| 10				| 1010				|
				| 500						| 20				| 520					|
				| 100						| 5.5				| 105.5				|