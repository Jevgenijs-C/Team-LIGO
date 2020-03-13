Feature: Discount price
  As a user
  I want to see discount price on Product List, Product Page and Order Page

  Background:
    Given I am on page
      | Desktops | http://www.demoshop24.com/index.php?route=product/category&path=20 |

  @discount @elementPresence
  Scenario: Discount check on Product List
    Then I see discount price in Product info container for: "Apple Cinema"
    And I see original price in Product info container for: "Apple Cinema"

  @discount @elementPresence
  Scenario: Discount check on Product Page
    When I click on: "Apple Cinema"
    Then I see discount price in info
    And I see original price in info

  @discount @shoppingCart
  Scenario: Discount check on Shopping Cart Page
    When I click on: "Apple Cinema"
    And I choose options for product
    And I add product to shopping cart
    And I go to
      | Shopping Cart | http://www.demoshop24.com/index.php?route=checkout/cart |
    Then I see price with discount: "$147.20"

  @discount @calculation
  Scenario Outline: Discount Calculation
    Then I see discount for "<product>" is correct: "<price with discount>"
    Examples:
      | product      | price with discount |
      | Apple Cinema | $110.00             |
      | Canon EOS 5D | $98.00              |

