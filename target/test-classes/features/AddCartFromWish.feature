@RunWith(CucumberClass)
Feature: Adding from Wish list to Cart
  As a user
  I want to add an item from my Wish list to cart

  @addCartFromWish
  Scenario Outline: I want to add an item from my wish list to cart:
    Given  I am on my wish list page: "http://www.demoshop24.com/index.php?route=account/wishlist"
    And    I see the items which I have added to my Wish list
    And    Next to each item I see button 'Add to cart' and button 'Remove'
    When   I click on the button 'Add to cart' "< Button>" next to item "<item>"
    And    I open my shopping cart page "http://www.demoshop24.com/index.php?route=checkout/cart"
    Then   I can see that my selected product is added to shopping cart
    And    I see the product name "<name>"
    And    I see products quantity "<quantity>" in my shopping cart
    And    I see an Unit price "<price>"
    And    I see the total sum "<total>" of my ordered item type
    Examples:
| Button     | Item    | Product name             | Quantity | Unit price | Total sum |
|Add to cart | Mac     | iMac                     | 1        | $100.00    | $100      |
|Add to cart | Monitor | Samsung SyncMaster 941BW | 1        | $200.00    | $200      |
