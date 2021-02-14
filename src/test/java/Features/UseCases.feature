Feature: CreateUseCases
  This feature deals with the use cases functionality of the application

  Scenario Outline: Create new use cases
    Given Web browser is at web page <web page>
    And I click on Login button
    And I enter the email as <email>
    And I enter the password as <password>
    And I click on Submit button
    And I click on Use Cases Label
    And I click on Create Use Cases Button
    And I enter <title> as title for new Use Case
    And I enter <description> as description for new Use Case
    And I enter <expResult> as expected result for new Use Case
    And I click on toggle for automated tests
    And I enter <steps> as case steps for new Use Case
    And I click on Submit button

    Examples:
      |  web page                              |  email                   |   password     |      title         |     description                                                          |    expResult                   |       steps                                                                                                                                             |
      |  https://qa-sandbox.apps.htec.rs/      | viktormarjanac@gmail.com |   test123456   |    ATM Transaction |    This Use Case is an ATM Transaction with positive input               |    Transaction should pass     |   User inserts card, System validates card and asks for PIN, User enters PIN, System validates PIN, User is allowed access to account                   |
      |  https://qa-sandbox.apps.htec.rs/      | viktormarjanac@gmail.com |   test123456   |    Login Module    |    This Use Case is a Login Module                                       |    Process should not pass     |   User opens webpage, System opens webpage and shows two input fields for username and password, User enters wrong username, System doesn't recognize username, User is not allowed access to account |
      |  https://qa-sandbox.apps.htec.rs/      | viktormarjanac@gmail.com |   test123456   |    Reset Password  |    This Use Case is a Reset Password Module                              |    Process should pass         |   User opens webpage, System opens webpage and shows two input fields for username and password and a link for Resetting password, User clicks on Reset Password, System opens Page with Textfields for new password, User enters new password and clicks Submit |
      |  https://qa-sandbox.apps.htec.rs/      | viktormarjanac@gmail.com |   test123456   |    Forgot Password |    This Use Case is a Forgot Password Module                             |   Process should pass          |   User opens webpage, System opens webpage and shows link for Forgot Password, User clicks on Forgot Password, System opens Page with Textfields for User to enter email, User receives new email with password credentials |


  Scenario Outline: Edit Use Cases
    Given Web browser is at web page <web page>
    And I click on Login button
    And I enter the email as <email>
    And I enter the password as <password>
    And I click on Submit button
    And I click on Use Cases Label
    And I click on First Use Case to edit
    And I input how many letters were in the previous field
    And I click on Submit button
    And I click on Second Use Case to edit
    And I input how many letters were in the previous field
    And I click on Submit button
    And I click on Third Use Case to edit
    And I input how many letters were in the previous field
    And I click on Submit button
    And I click on Fourth Use Case to edit
    And I input how many letters were in the previous field
    And I click on Submit button

    Examples:
      |  web page                              |  email                   |   password     |
      |  https://qa-sandbox.apps.htec.rs/      | viktormarjanac@gmail.com |   test123456   |