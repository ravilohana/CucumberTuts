Feature: Amazon Search

  Scenario: Search a product
    Given I have a Search field on Amazon Page
    When I search a product with name "Apple MacBook Pro" and price 1000
    Then Product with name "Apple MacBook Pro" should be displayed
