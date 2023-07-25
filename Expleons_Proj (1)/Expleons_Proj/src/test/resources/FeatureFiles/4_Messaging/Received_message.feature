
@tag
Feature: View Message history
	User has to view the message history of inbox,sent and trash 

  Background:
    Given Launch the cyclos url "https://demo.cyclos.org/"
    When Click the login button
    And Login with username as 'demo' and password as "1234"
    And Click submit with valid username and password
    When Click the messages icon
    
  @tag1
  Scenario: Message history of inbox
    Given Click the inbox radio button
    When Select the user from dropdown
    And Enter the Keyword for index as 'Regarding Mail'
    And Enter the user as 'ac'
    Then Click the inbox message history
    
    
  @tag2
  Scenario: Message history of sent 
     Given Click the sent radio button
     When Select sent to as user
     And Enter the Keyword for sent as 'repairing car'
     And Select the user as 'Car repair'
     Then Click the sent message history
    
  
  @tag3
  Scenario: Message history of trash 
    Given Click the trash radio button
    When Select the sent to as administration
    And Enter the keyword of trash as 'loan'
    Then Click the trash message history
   