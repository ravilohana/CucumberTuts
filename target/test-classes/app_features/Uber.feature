@All
Feature: Uber Booking Feature

	@Smoke
  Scenario: Booking Cab Sedan
    Given User wants to select a car type "Sedan" from uber app
    When User selects car "Sedan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
   
  @Smoke @Regression 
  Scenario: Booking Cab SUV
    Given User wants to select a car type "SUV" from uber app
    When User selects car "Sedan" and pick up point "Mumbai" and drop location "Hyderabad"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 2000 USD
   
   
  @Prod 
  Scenario: Booking Cab MiniCar
    Given User wants to select a car type "Mini Car" from uber app
    When User selects car "Mini Car" and pick up point "Chennai" and drop location "Kochi"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 3000 USD
    
 