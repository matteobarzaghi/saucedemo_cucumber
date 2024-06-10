Feature: Login Functionality

  @smoke
  Scenario Outline: Successful login with standard user
    Given I am on the login page
    When I login as a "<role>"
    Then I should see the homepage

    Examples:
      | role          |
      | standard_user |
      | visual_user   |