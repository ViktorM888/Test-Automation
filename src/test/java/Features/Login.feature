Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario Outline: Login with correct email and password
    Given Web browser is at web page <web page>
    And I click on Login button
    And I enter the email as <email>
    And I enter the password as <password>
    And I click on Submit button
    Then I should see the main page

    Examples:
   |  web page                              |  email        |   password     |
   |  https://gallery-app.vivifyideas.com/  | vvv@gmail.com |   test123456   |

  Scenario Outline: Login with incorrect email and password
    Given Web browser is at web page <web page>
    And I click on Login button
    And I enter the email as <emailWithoutMonkey>
    And I enter the password as <incorrectPassword>
    And I click on Submit button
    And I refresh the page
    And I enter the email as <incorrectEmail>
    And I enter the password as <incorrectPassword>
    And I click on Submit button
    Then I should see the error message

    Examples:
      |  web page                              |  incorrectEmail     |   incorrectPassword    |   emailWithoutMonkey |
      |  https://gallery-app.vivifyideas.com/  | v12345@gmail.coasik |   v12345@gmail.coasik  |   ASDLKJHSDF         |

  Scenario Outline: Login with empty username and password
    Given Web browser is at web page <web page>
    And I click on Login button
    And I click on Submit button

    Examples:
      |  web page                              |
      |  https://gallery-app.vivifyideas.com/  |

