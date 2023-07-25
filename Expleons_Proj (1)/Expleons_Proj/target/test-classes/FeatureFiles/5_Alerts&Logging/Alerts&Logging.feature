@tag
Feature: Check the alert in the marketplace
  User has to check the alert message in the advertisements

	Background: 
	  Given Launch the given url "https://demo.cyclos.org/"
    When Click on the login button
    And Login with the username 'demo' and password "1234"
    And Click  submit button with valid credentials
    Then Click Marketplace button
    
    
  @tag1
  Scenario: Check the alert message
    Given Click on the Advertisements button
    And Click on show advertisements
    When Select the required product
    And Click on ask a question
    And Enter the question on the alert box as 'Price of donut?'
    Then Click submit button
