
Feature: Login to account
  As a user I want to be able to see my account's Order History

  Scenario: Login in one step
    When I perform login

    Scenario: As a user I buy item and check it out successfully
    Given I am on web shop homepage
    When I choose item iPhone and add it to cart
    And I click on cart button
    And I click to checkout item
    And I am redirected to checkout form
    And I fill first name
    And I fill second name
    And I fill address1 field
    And I fill city field
    And I fill post code field
    And I select region
    And I click on Continue to move away from Billing details
    And I select existing address for delivery
    And I click Continue to move away from Delivery Details
    And I select flat Rate for shipping
    And I click Continue to move away from Delivery Method
    And I select Cash on Delivery as payment method
    And I select T&C checkbox
    And I click Continue to move away from Payment Method
    And I click on Confirm Order button
    Then I have checked out my purchase successfully

  Scenario:After successful checkout I click on link for history information
    Given I am can see checkout success message
    And I click on link under name History
    And I am redirected to Order history page
    Then I see my recent order in table


    Scenario: As a user view my Order History
    Given I am on account page
    When I click on link "View your order history"
    Then I am directed to order history page
