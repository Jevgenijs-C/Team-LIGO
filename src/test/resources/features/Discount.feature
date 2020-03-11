Feature: Discount Price
  As a user
  I want to see if there is discount for product, old and new prices for product with discount

  Background:
    Given I am on page "Desktops"

  Scenario: Product with discount presence check
    Then I see discount for "Apple Cinema 30"

  Scenario: Product without discount presence check
    When I go to page "Laptops&Notebooks"
    Then I see no discount for "HP LP3065"

  Scenario: Discount check on Product page
    When I go to page "Apple Cinema 30"
    Then I see discount for "Apple Cinema 30"

  Scenario: Discount check on Shopping Cart page
    When I click Add to Cart for "Apple Cinema 30"
    And I see that "Apple Cinema 30" is added to Cart
    And I go to page "Shopping cart"
    Then I see discount for "Apple Cinema 30"

  Scenario Outline: Discount Calculation check
    When I click on "<Product>"
    Then I see discount for "<Product>" is "<Discount>"
    Examples:
      | Product         | Discount |
      | Apple Cinema 30 | 10%      |
      | Canon EOS 5D    | 20%      |