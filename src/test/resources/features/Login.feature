
Feature: Login to account
  As a user
  I want to be able to login on a website

  
  Scenario: As a user I  login account 
    Given I am on login page
    When I enter email: "email" in E-Mail Address field
    And I enter a "password" in password field
    And I click login button
    Then I am directed to account page

  Scenario: Login in one step
    When I perform login
 
