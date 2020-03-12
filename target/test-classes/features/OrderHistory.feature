Feature: Login to account
  As a user I want to be able to see my account's Order History

  Scenario: Login in one step
    When I perform login


   Scenario: As a user I see my Order History grid shorter
     Given I perform login
     Then I see my Historical Order Grid

    Scenario: As a User from grid I want to open Order Information page
     Given I perform login
     When I am on Order history page
     And I click button View in grid
     Then I am redirected to Order Information page

    Scenario: As a user I want to manage item from Order Information page
      Given I perform login
      When I am on Order history page
      When I am redirected to Order Information page
      Then I click Reorder
      And I get reorder success alert

  Scenario: As a user I want to review values of return list
    Given I perform login
    When I am on Order history page
    When I am redirected to Order Information page
    Then I click Return
    And I am redirected to Return Product page
    And I see Reason for Return
    And First LOV is Dead On Arrival
    And Second LOV is Faulty, please supply details
    And Third LOV is Payment Error
    And Forth LOV is Other, please supply details
    And Fifth LOV is Received Wrong Item
