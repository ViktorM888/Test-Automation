Feature: CreateGalleryFeature
  This feature deals with the create gallery functionality of the application

  Scenario Outline: Create new correct gallery
    Given Web browser is at web page <web page>
    And I click on Login button
    And I enter the email as <email>
    And I enter the password as <password>
    And I click on Submit button
    And I click on Create Gallery
    And I enter title <title> for the Gallery
    And I enter description <description> for the Gallery
    And I enter URL <image> of image for the Gallery
    And I click on Submit button
    And I click on All Galleries
    Then image is shown in gallery

    Examples:
      |  web page                              |  email        |   password     |   title   |   description         |     image                                                                                                   |
      |  https://gallery-app.vivifyideas.com/  | vvv@gmail.com |   test123456   |    Nope   |   Definitely Nope     | https://meme-generator.com/wp-content/uploads/mememe/2020/02/mememe_d9ce6df678eb34da9fd4892d5352fc96-1.jpg  |


  Scenario Outline: Create new incorrect gallery with missing image
    Given Web browser is at web page <web page>
    And I click on Login button
    And I enter the email as <email>
    And I enter the password as <password>
    And I click on Submit button
    And I click on Create Gallery
    And I enter title <title> for the Gallery
    And I enter description <description> for the Gallery
    And I enter URL <image> of image for the Gallery
    And I click on Submit button
    Then I should see the main page

    Examples:
      |  web page                              |  email        |   password     |   title   |   description         |     image                 |
      |  https://gallery-app.vivifyideas.com/  | vvv@gmail.com |   test123456   |  !@#$%^   |   !@#$%^              | https://google.com/1.jpg  |