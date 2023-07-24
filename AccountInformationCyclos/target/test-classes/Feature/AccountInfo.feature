Feature: Account information of Cyclos Web Application
    user Should be able to perform Banking Functionality
    
    Background:
    Given: user should launch the cyclos application
    And user should give valid username and password
    And user should click submit
    Then user click the banking menu
    
    
   Scenario: User check the account summary
      Then click the Member Account

    Scenario: user check the current balance
      Then check member account balance
      
    Scenario: user should check the payment history
      Then click on notifications
        

    Scenario: print and export payments
      And click anyone acount summary
      Then user should click print button


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


  	Scenario: View Payment Details
  		When click anyone from the Account Summary
  		Then payment Details will be Appear to User
 

  	Scenario: Print Payment Details
  		When click anyone from  Account Summary
  		Then click on the print button in the transferDetails