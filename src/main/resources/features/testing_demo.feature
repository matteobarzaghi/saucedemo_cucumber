Feature: Login Functionality

  Scenario: Successful login with standard user
    Given I am on the login page
    When I login as a "standard_user"
    Then I should see the homepage