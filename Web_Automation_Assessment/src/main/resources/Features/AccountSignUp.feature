@Smoke
Feature: User Signup
  As a user
  I want to sign up for an account
  So that I can access the platform

  Scenario: Verify that user can sign up successfully
    Given I click on the Sign up button in the Header
    When I fill in the username and password in the sign up form
    And I submit the sign up form
    Then I should see the message "Sign up successful."

  Scenario: LogIn With Invalid UserName
    Given I enter invalid username "Moh@med"
    When I click on the Login button
    Then I should see an error message "User does not exist."


    Scenario: LogIn With Invalid Password
      Given I enter invalid password "123456"
      When I click on  Login button
      Then I should see  error message "Wrong password."

