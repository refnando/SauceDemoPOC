Feature: Test Login functionality

  Scenario: Login with valid credentials
    Given I am on the login page
    When I login with valid credentials
    Then I should be redirected to the products page

  Scenario: Login with invalid credentials
    Given I am on the login page
    When I login with invalid credentials
    Then I should see an error message

  Scenario: Logout from the home page
    Given I am logged in
    When I logout from the home page
    Then I should be redirected to the login page