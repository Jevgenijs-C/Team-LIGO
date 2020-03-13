
@RunWith(CucumberClass)
Feature: Adding to Wish list
  As a registered user
  I want to be able to add an item to website Wish list

  @addToWish
  Scenario Outline: I want to add an item to my wish list
    Given I perform login
    And I an on the shopping website
    When  I search an items category "<Category>" in website
    And   I click to add item "<Item>"
    And   I click to open the wish list link
    Then   I can see the selected product name "<Selected product name>"
    And   I can see the unit price "<Product price>"
    Then I delete from Wishlist
    Examples:
| Category | Item            | Selected product name | Product price |
| Monitors | Apple Cinema 30| Apple Cinema 30      | $90.00        |

