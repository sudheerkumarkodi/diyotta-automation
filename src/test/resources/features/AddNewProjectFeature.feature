@AddNewProject
Feature: Check for Adding New Project

 @TestAddNewProjectScenario
  Scenario: As a user I want to test add new project
    Given I am launching the browser
    When I enter username and password
    Then I click on Diyotta Menus
    Then I click on Admin Menu
    Then I click on project icon
    Then I click on New project button
    Then I select Normal project drop down
    Then I have given project name
    Then I have given project code
    Then I have given project description
    Then I click on Add layer menu
    Then I click on Add layer Plus icon
    Then I click on save button
    Then I click on Logout button and close button
    Then I should be able to close the browser
    
    
    
    