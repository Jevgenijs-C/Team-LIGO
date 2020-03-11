Feature: As a user I check that shopping cart is visible in all pages

  Background:

    Given I open a page

    Scenario: As a user I check a shopping cart
      When I find a cart button on the right menu
      And  I find a cart button on the top menu
      And A move to another page
      And I check a cart button on the top menu
      And I check a cart button on the right menu
      And I go to new page
      And I see a cart button on the top menu
      And I see a cart button on the right menu
      And I click on the shopping cart button on the right
      And I see the message "Your shopping cart is empty!"
      And I back on previous page
      Then I click on the chart button on the top menu




