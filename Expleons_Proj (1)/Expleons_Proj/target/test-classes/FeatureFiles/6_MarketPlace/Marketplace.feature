Feature: Market Place of Cyclos Web Application
    user Should be able to check Market Place

    Background:
    Given launch the cyclos application with url
    And user should give valid username and password
    And user should click submit
    And user click the MarketPlace menu
    Then user click the Advertisements 

    Scenario: new advertisement field published recently
     And user should click on showadveritisements
     And User click on Order by
     Then select the last published

      Scenario: To browse the adverstisement in which category the user needs
      Given I want to click on the keywords search field
      And user should pass the requiered information in keyword

      Scenario: To Verify the advertisement funcitonality with multiple advertisement categories  
      Then user should click on the community field

      Scenario: To add a customized search for a advertisement field
       And user should click on activity in the community field
       Then select any one Ad