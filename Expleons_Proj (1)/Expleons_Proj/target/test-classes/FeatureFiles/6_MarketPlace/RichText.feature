@tag
Feature: Launch the cyclos Application and create rich Text for Advertisement editing
  User has to launch the cyclos website and click on marketplace for advertisement editing
	
	Background:
	 Given Launch cyclos website url "https://demo.cyclos.org/"
    When Click on login button
    And Login with username and password
    And Click on submit button
    Then Click on the Marketplace button
	
  @tag1
  Scenario: Rich text advertisement editing
    Given Click on My Advertisement button
    When Click on add new button 
    And Enter the name for advertisement
    And Enter the category of advertisement
    And Enter the price of the advertisement
    And Enter the publication period of the advertisement
    And Enter the rich text message in the description
    Then Click on the save button
    