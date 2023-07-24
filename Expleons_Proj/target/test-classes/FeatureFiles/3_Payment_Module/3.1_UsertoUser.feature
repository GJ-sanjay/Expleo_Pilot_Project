@tag
Feature: User to User Payment
User should be able to login to the cyclos website and make payment to the another user

@tag1
Scenario: User should be able to make transaction to another user of his choice
Given User should be able to launch the cyclos website and login with the valid credentials
And user should click on banking tab
And user should click on payment to user tab
When user selects the list of user and selects the particular user
And click on amount field and enter amount to transfer
And enter some description in the textbox
And click next
And confirm the payment and click confirm
Then Check if the transaction is successful

@tag2
Scenario: 