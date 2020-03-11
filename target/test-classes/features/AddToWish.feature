
Feature: Adding to Wish list
  As a user
  I want to be able to add an item to website Wish list


  Scenario Outline: As a registered user I want to add items to my wish list
    Given As a registered user I have opened shopping website
    When  I click on button: "Add to wish list"
    And   I click on link wish list"
    Then  I see the selected product name
    And   I see the unit price
    And   I see the count of all items that I have selected
    Examples:


