Feature: Order History management
  As a user I want to be able to see my account's Order History
  Background:
    Given I perform login

  @first
  Scenario: Login in one step

  @first
   Scenario: As a user I see my Order History grid
     Then I see my Historical Order Grid
      And I see grid pagination
      And see how many rows are in grid
  @first
    Scenario: As a User from History grid I want to view Order Information
     When I am on Order history page
     And I click button View in grid
     Then I am redirected to Order Information page

  @first
  Scenario: As a user I want to reorder item using Order History
    When I am on Order history page
    When I am redirected to Order Information page
    Then I can reorder some item
  @first
  Scenario: As a user I want return item and select reason for return
    When I am on Order history page
    When I am redirected to Order Information page
    Then I click Return
    And I am redirected to Return Product page
    Then I can see all return options