Feature: Make my trip Booking Flight

Scenario: Book a flight Delhi to Bangalore
Given User must be login in make my trip app
When click on flight link 
And select on Round trip option
And Slect From location "Delhi"
And Select To location "Bangalore"
And select departure date "27May2022"
And select  return date  "30May2022"
Then click on Search button
And slect the flight 
And Do the payments
 

 
Scenario: Book a flight Mumbai to Pune
Given User must be login in make my trip app
When click on flight link 
And select on Round trip option
And Slect From location "Mumbai"
And Select To location "Pune"
And select departure date "1May2022"
And select  return date  "15May2022"
Then click on Search button
And slect the flight 
And Do the payments
 