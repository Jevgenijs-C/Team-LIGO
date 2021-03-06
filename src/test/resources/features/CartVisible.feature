Feature: As a user I check that shopping cart is visible in all pages

  Background:

    Given I open a page

  @First
  Scenario: As a user I check a shopping cart
    When I find a cart button on the right menu
    And  I find a cart link on the top menu
    And A move to another page
    And I check a cart link on the top menu
    And I check a cart button on the right menu
    And I go to new page
    And I see a cart link on the top menu
    And I see a cart button on the right menu
    And I click on the shopping cart button on the right
    And I see the message "Your shopping cart is empty!"
    Then I back on previous page


  @Second
  Scenario: As a user I add one item into the cart
    When I search the item using search field
      | item | Nikon D300 |
    And I direct into the search page with item
    And I direct into the item page
    And Correct Item are exist
      | item  | Nikon D300 |
      | price | $98.00     |
    And I press add button on the page
    And I move on the cart using top menu link
    And I check product are exist into the cart
      | name       | quantity | price  | total  |
      | Nikon D300 | 1        | $98.00 | $98.00 |
    And I delete product from the cart
    Then I check cart is empty "Your shopping cart is empty!"

  @Third
  Scenario: As a use I add an item which is marked as out of stock
    When I add item into the search field
      | item | Samsung Galaxy Tab 10.1 |
    And I move to the search page with item
    And I click on exist element
    And I go to the correct page
      | item | Samsung Galaxy Tab 10.1 |
    And I click add to cart
    And I open a cart using right menu button
    And  I see item marked as out of stock
      | item  | Samsung Galaxy Tab 10.1 |
      | state | ***                     |
    Then I see red color note that item out of stock with message " Products marked with *** are not available in the desired quantity or not in stock"

  @Forth
  Scenario: As a user I add an item with required fields

    When I put item into the search field
      | item | Apple Cinema 30 |
    And I move to the search Apple field
    And I move into the item page
    And I check name of the item
    And I click on the cart button
    And I fill two “fields”
    And I click on the cart button again
    And I fill all fields
    And I click cart button one more time
    Then check correct items and price there

@Fifth
  Scenario: I check that items displayed correctly on the cart
    When I find a “item”  using a search field
    And I go on product page
    And I choose item and put it into cart
    And I see note that product add into the cart button
    And I go to the cart throw top menu
    And I check the number of items and price
    And I back to product page
    And I click on cart in  right menu
    And I move to the cart
    And I check item in cart
    And I back into the item page
    And I check note on the button product is in cart
    And I go to cart again
    And I delete item from the cart
    And I back on the page
    Then  I see no items into the cart on the button




