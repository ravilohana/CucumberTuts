Feature: User Registration
	Scenario: User registration with different data
	Given User is on registration page 
	When User enters the following user deatils
		| Manoj | Tewari | manoj@gmail.com | 1234567890 | Bangalore |
		| Anurag | Pant | anurag@gmail.com | 1111222333 | Pune |
		| Deepak | Rawat | deepak@gmail.com | 5556663333 | Delhi |
		| Geeta | Seth | getta@gmail.com | 5654646798789 | Chennai |
		| Neha | Kumari | neha@gmail.com | 2479797984651 | Kochi |
	Then User registration should be successfull
	
	
	
 Scenario: User registration with different data with Columns
	Given User is on registration page
	When User enters the following user deatils  Columns
		| firstname	| lastname | email | phone_No | city |
		| Manoj | Tewari | manoj@gmail.com | 1234567890 | Bangalore |
		| Anurag | Pant | anurag@gmail.com | 1111222333 | Pune |
		| Deepak | Rawat | deepak@gmail.com | 5556663333 | Delhi |
		| Geeta | Seth | getta@gmail.com | 5654646798789 | Chennai |
		| Neha | Kumari | neha@gmail.com | 2479797984651 | Kochi |
	Then User registration should be successfull
	