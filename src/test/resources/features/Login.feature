@Login
Feature: Login functionlity

  @Smoke @TestSceanrio1
  Scenario: As a user I want to test valid user loging
    Given I am in diyotta login page
    Then I enter username "swetha1223" and password "password123"
    When I click on Login button
    Then I should be in home page

  @Regression @TestSceanrio2
  Scenario Outline: As a user I want to test inavlid user loging
    Given I am in diyotta login page
    Then I enter username "<username>" and password "<pasword>"
    When I click on Login button
    Then I should see the error message "<errorMessage>"

    Examples: 
      | username | pasword | errorMessage          |
      | test123  |     123 | invalid login details |
      | test123  |         | enter valid password  |

  @TestSceanrio3
  Scenario Outline: As a user I want to test inavlid user loging-new
    Given I am in diyotta login page
    Then I enter username "<username>" and password "<pasword>"
    When I click on Login button
    Then I should see the error message "<errorMessage>"

    @Regression
    Examples: 
      | username | pasword | errorMessage          |
      | test123  |     123 | invalid login details |
      | test123  |         | enter valid password  |

    @Smoke
    Examples: 
      | username | pasword | errorMessage          |
      | test123  |     123 | invalid login details |
      | test123  |         | enter valid password  |
