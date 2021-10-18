Feature: 
  verify if user is able to login and edit profile

  Background: Automation login and navigate to edit profile page
    Given user is on Elearning Application
    When user enters the "user123" and "g"
    And user clicks on signup
    Then user navigates to dashboard
    And user clicks on edit profile on menu bar
    Then user gets directed to Edit profile page

  ############################################################################################################
  Scenario: Verify that language is selected from dropdown list
    Given user is on edit profile page
    When user clicks on language
    Then user is able to select language

  ############################################################################################################
  Scenario: Verify that oldpassword is incorrect and newpassword and confirm password field take
    valid input and confirmation message is displayed

    Given user is on edit profile
    When user enters "<oldpassword>" ,"<password>","<confirmpassword"
    Then user is able to click on save settings field

  ################################################################################################################
  Scenario: Verify that oldpassword is correct ,newpassword and confirm password field take
    invalid input and validation message is displayed

    Given user is on edit_profile
    When user enter "<oldpassword>" ,"<password>","<confirmpassword>"
    Then user gets a message after clicking on save setting

  ################################################################################################################
  Scenario: Verify skype url and linkedIn url field
    Given user is on edit.profile
    When user enters Skype url
    And user enter LinkedIn url
    Then user is able to click on save settings again

  #############################################################################################################
  Scenario: Verify Add image field added the image
    When user clicks on profile image
    And user is able to click on remove image checkbox
    Then user clicks on save changes

  ##################################################################################################################
  Scenario: verify Skype and linkedin url should not be same
    When user enters skype url
    Then linkedIn url
    And clicks on save setting
    Then user should get validation message
