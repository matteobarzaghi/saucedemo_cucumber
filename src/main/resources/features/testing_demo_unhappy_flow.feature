Feature: Login Functionality

  Background:
    Given I am on the login page

  @smoke
  Scenario Outline: Successful visualization of the homepage for each usertype
    When I login as a "<role>"
    Then I should see the homepage
    And I see the label "Swag Lag"
    Examples:
      | role          |
      | standard_user |
      | visual_user   |