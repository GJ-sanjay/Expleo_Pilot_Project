Feature: UserFunction

@tag1
Scenario: Update your Profile
Given User Should go to the login pages
When User should submit username and password and login to the application
    |Mprakash|
    |prakash@123|
And User click on profile icon and then edit button
And User should upload a profile image
And User should click name text field & email text field and enter valid detailss
Then User Should click name field in addresses & enter valid name
And User Should click address line1 field in addresses & enter valid details
When User Should click city field & enter city name
And User Should click region/state field in addresses & enter valid details

@tag2
Scenario: Add Multiple Address
Given User Should click Add address button
Then User Should click name text field & enter "Prakash"
Then User Should click Address line1 text field and enter "chennai,tambaram"
And User Should click city text field and enter "madras"
And User Should click Zipcode text field and enter "600096"
And User Should click country text field & enter valid country

@tag3
Scenario: Add Multiple Phone
Given User Should click edit button
And User Should click Add mobile button
When User Should enter the valid mobile phone name in mobile phone name text field
Then User Should enter the valid mobile phone number in mobile phone number text field
And click on save button

@tag4
Scenario: Manage setting 
Given User Should click the Profile button
 And  User Should Navigate to Setting 
 And   User Should click Dark button
 
@tag5
Scenario: Manage contacts
Given User Should contacts
And Click on list view

@tag6
Scenario: Manage passwords
And User Should click password and change button
And User Should enter the valid password in old password text field
And User Should enter the valid password in new password text field
Then User Should enter the valid password in password confirmation text field
And Click on Submit button

@tag7
Scenario: Manage Documents
Given User should Click  Document
And User should click download button and verify

@tag8
Scenario: Notification preferences
Given Click on notification
And Click on unread checkbox

@tag9
Scenario: Manage References
Given Click on References
And user should take Screenshot
