@Smoke
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
  Scenario: LogIn With Invalid UserName

    Given I am on the homepageLogin
    When I enter invalid username "Moh@med"
    And I click on the Login button
    Then I should see an error message "User does not exist."

    Scenario: LogIn With Invalid Password
      Given I am on  homepageLogin
      When I enter invalid password "123456"
      And I click on  Login button
      Then I should see  error message "Wrong password."

