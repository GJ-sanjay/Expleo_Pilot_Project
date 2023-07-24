
@tag1
Feature: User to System payment option
User should be able to login to the cyclos website and make payment to the system

Background: The user launches the application and login then make a payment to the system
When The user launches the url
And login to the website 
And goes into banking tab 
And clicks on Payment to System
And User enter the amount 

@tag1
Scenario: User should be able to make transaction to his accounts by clicking Scheduled

When user selects the scheduled option
And Enter the date 
And enter some description in the textbox
And click next
And confirm the payment and click confirm
Then Check if the transaction is successfull

@tag2
Scenario:  User should be able to make transaction to his accounts by clicking Monthly Installments
When user selects the Monthly Installment option
And user enters the number of installments
And clicks on now
And enter some description in the textbox
And click next
And confirm the payment and click confirm
Then Check if the transaction is successfull
