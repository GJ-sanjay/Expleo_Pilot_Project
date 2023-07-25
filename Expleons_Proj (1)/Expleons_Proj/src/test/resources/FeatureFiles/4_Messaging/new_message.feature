@tag
Feature: Launch the cyclos application
  User has to send message to the user

  @tag1
  Scenario: Send rich text message to user
    Given Launch the url "https://demo.cyclos.org/"
    When Click login button
    And Login with username 'demo' and password "1234"
    And Click submit with valid credentials
    And Click messages icon
    And Click new messages button
    When Sent to 'User' for rich text message
    And Enter the To User name
    When Enter the subject of the message as 'Banking'
    And Enter the rich text message on the textbox
    Then Click send button 

  