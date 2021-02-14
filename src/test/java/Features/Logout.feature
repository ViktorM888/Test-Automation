Feature: LogoutFeatures
  This feature deals with the logout functionality of the application

  Scenario Outline: Logout with correct email and password
    Given Web browser is at web page <web page>
    And I click on Login button
    And I enter the email as <email>
    And I enter the password as <password>
    And I click on Submit button
    Then I should see the main page
    Then I click on Logout button

    Examples:
      |  web page                              |  email        |   password     |
      |  https://gallery-app.vivifyideas.com/  | vvv@gmail.com |   test123456   |