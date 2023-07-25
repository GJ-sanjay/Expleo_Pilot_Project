Feature: Account information of Cyclos Web Application
    user Should be able to perform Banking Functionality
    
    Background:
    Given: user should launch the cyclos application
    And user should give valid username and password
    And user should click submit
    Then user click the banking menu
    
   @tag1
   Scenario: User check the account summary
      Then click the Member Account
		@tag2
    Scenario: user check the current balance
      Then check member account balance
     @tag3 
    Scenario: user should check the payment history
      Then click on notifications
        
		@tag4
    Scenario: print and export payments
      When clicking on payment to user tab in banking
      Then click on the pickfromyourcontactlist in touser
  		And click anyone from the select a contact
  		Then Enter the Amount
  		And click on next button
  		When click on confirm
  		Then click the print to confirm the payment details downloaded
			
			
			
			
			
			
		@tag5
    Scenario: Search history
  		And click on the Showfilter button
  		And Select the pickfromyourcontactlist on book icon
  		And user click anyone from the select a contact
  		Then click on the period menu
  		And Select any oneoption
 	  	Then select the description enter the content
  		And click on the From amount Enter the amount
  		Then click the filter option
 	  	And Select anyone Option
  		Then click the Direction option
 	  	And Select anyone Option in direction
  		And click the orderBy option
  		Then Select anyone from orderby

		@tag6
  	Scenario: View Payment Details
  		When click anyone from the Account Summary
  		Then payment Details will be Appear to User
 
		@tag7
  	Scenario: Print Payment Details
  		When click anyone from  Account Summary
  		Then click on the print button in the transferDetails