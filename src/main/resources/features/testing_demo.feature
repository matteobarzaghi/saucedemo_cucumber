Feature: Login Functionality

  Scenario: Successful login with standard user
    Given I am on the login page
    When I login as a standard user
    Then I should be authorized
    And I should see the homepage