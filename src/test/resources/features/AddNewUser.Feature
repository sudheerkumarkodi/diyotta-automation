@UserCreation
Feature: Create New User

  @TestNewUserScenario
  Scenario: To create New User
    When After launch the browser I am in Login Page
    Given Username and password
    Then I click on Main Menu
    And I click on Admin Module
    Then I go to User Tab
    Then I Click on new User
    Given All Required fields
    Then save
    Then logout
    And close the browser
