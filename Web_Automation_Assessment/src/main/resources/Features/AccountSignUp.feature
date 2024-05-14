@test
Feature: User Signup
  As a user
  I want to sign up for an account
  So that I can access the platform

  Scenario: Verify that user can sign up successfully
    Given I am on the homepage
    When I click on the Sign up button in the Header
    And I fill in the username and password in the sign up form
    And I submit the sign up form
    Then I should see the message "Sign up successful."