@tag
Feature: Payment Requests
Scenario: The user select Payment requests and makes the request	
Given The user logs in and switches to banking and clicks on payment request and selects send a new request
And selects user from contact book 
And enters amount then sends date
And clicks on Recurring payment
And clicks on first occurence 
And sends Description for the payment
And clicks on confirm 
And clicks on confirm again
Then Checks if it is successfully sent 
