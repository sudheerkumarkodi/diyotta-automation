Feature: Agent Group Creation

Scenario: As a User i want to create new agent group

Given I am in Diyotta Login Page by launch browser and enter diyotta url
Then I enter username "avinash" and password "P2wd_1234" 
When I click on login button
Then I should be in studio module
When I click on Admin module
Then I should be in Admin Module
And I click on Agent Group tab 
And I click on New in agnet list page
And I enter Agent Group Name
And I assign agents
And I assign project 
Then I click on save
And I logout from Diyotta Admin and close the browser

 