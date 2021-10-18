Feature: Verify the compose message page on elearning website

  Background: Automation testing for login and compose message
    Given user is on elearning website
    When user enters the credentails "user123" and "g"
    And user clicks on login button for loging into the website
    Then user naviagtes to the dashboard page
    And clicks on compose message

  ####################################################################################################################
  Scenario Outline: Verify 'Send to' drop down field
    Given user is on Elearning website
    When user enters charaters in "<sendto>"field

    Examples: 
      | sendto |
      | abc    |
      |    123 |
      | e      |
      |      4 |
      | #%^    |

  ##################################################################################################################
  Scenario: Verify 'send to' drop down selects multiple input
    Given user is on compose message page
    When user gives multiple "<values>" in send to field drop down opens
    And user enters 'subject' for the message
    Then user enters "<message>" in message box
    And user add discription
    Then user clicks on ADD MORE FILE
    And user clicks on SEND MESSAGE

  #################################################################################################################
  Scenario: Verify subject field is mandatory and validation message is displayed
    Given user is on compose page
    When user enters the send to field
    But user does not given subject
    And clicks on send message
    Then validation message is displayed

  ##################################################################################################################
  Scenario: verify the outbox
    Given the user is on compose
    When user clicks on back button
    Then user is directed to My Organization - My education
    And user clicks on outbox
    Then user is able to search the subject line in search text box
    And user clicks on SELECT ALL button
    Then user clicks on UNSELECT ALL
    When user clicks on checkbox and DELETES the message from DETAILS button
    Then user gets alert box!
    And user accepts from alert box
    Then user gets validation message
    And user goes back to outbox page

  ###############################################################################################################
  Scenario: Verify the subject is clicked and user gets to see the entire message
    Given user is on compose message p
    When user clicks on subject of the message
    Then user is directed to the next page-My Organization - My education - View
    And clicks on back button
