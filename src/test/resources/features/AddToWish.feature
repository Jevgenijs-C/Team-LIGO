
Feature: Adding to Wish list
  As a user
  I want to be able to add an item to website Wish list


    Scenario: As a registered user I want to add items to my wish list
    Given As a registered user I have opened my Account page "http://www.demoshop24.com/index.php?route=common/home"
    And   I see a menu <" ">
    When  I clik on menu field: <" "
    And   I click on items "iPhone" button: <"">
    And   I click on link <""> of the wish list
    Then  I see the selected product name <"">
    And   I see the unit price
 Examples:


