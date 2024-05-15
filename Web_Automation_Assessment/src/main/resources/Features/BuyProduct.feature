@Smoke
Feature: Purchase Products
  As a user
  I want to purchase two products successfully
  So that I can complete a successful purchase transaction

  Scenario: Verify that two products are purchased successfully
    Given I am on the homepage
    When I click on Login button in Header
    And I fill in username  and password  in Login Form
    And I validate that account is opened Successfully
    And I click on Laptops in categories on home page
    And I choose product one
    And I click on Add to cart button for product one
    And I validate that product one is successfully added to cart
    And I choose product two
    And I click on Add to cart button for product two
    And I validate that product two is successfully added to cart
    And I click on Cart button in header
    Then I validate that both products are successfully added in products page
    And I validate that the total amount is calculated correctly
    And I click on Place order button
    And I validate that the total amount is calculated correctly in place order page
    And I fill in  place order form
    And I click on Purchase button in place order Form
    Then I validate that 'Thank you for your purchase!' is displayed