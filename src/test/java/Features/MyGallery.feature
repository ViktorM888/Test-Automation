Feature: MyGalleryFeature
  This feature deals with my gallery functionality of the application

  Scenario Outline: Find the correct gallery just created
    Given Web browser is at web page <web page>
    And I click on Login button
    And I enter the email as <email>
    And I enter the password as <password>
    And I click on Submit button
    And I click on My Galleries
    And I enter into Search field <search> for my gallery
    And I click on Filter button


    Examples:
      |  web page                              |  email        |   password     |    search    |
      |  https://gallery-app.vivifyideas.com/  | vvv@gmail.com |   test123456   |    Nope      |

  Scenario Outline: Find the incorrect gallery just created
    Given Web browser is at web page <web page>
    And I click on Login button
    And I enter the email as <email>
    And I enter the password as <password>
    And I click on Submit button
    And I click on My Galleries
    And I enter into Search field <search> for my gallery
    And I click on Filter button



    Examples:
      |  web page                              |  email        |   password     |    search          |
      |  https://gallery-app.vivifyideas.com/  | vvv@gmail.com |   test123456   |    1112455679      |
