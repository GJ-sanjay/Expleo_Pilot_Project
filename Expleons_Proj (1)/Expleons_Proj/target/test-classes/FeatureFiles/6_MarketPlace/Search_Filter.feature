@tag
Feature: Customise the search filters according to the given parameters
  User should go to advertisement and show advertisement based on the search filter
  
  Background:
	  Given Launch the url of cyclos application "https://demo.cyclos.org/"
    When Click on the login icon
    And Login with the username and password
    And User should click on submit  
    Then User should click on the Marketplace button 
 
  @tag1
  Scenario:  Custom search filters
    Given Click on the advertisements
    And Click on show more filter
    When Enter 'Cupcake' in the keyword textbox
    And Click Favarites only checkbox
    And Enter the minimum price as '20'
    And Enter the maximum price as '100'
    Then Click the advertisement under the filter

  
