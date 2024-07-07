Feature: User Sign in

  Scenario: Redirect to register page
    Given The user is on home page
    When The user should click on Register link
    Then The user is redirected to Register page

  Scenario: To Verify Sign with Empty fields
    Given The user is on  Sign in page
    When User clicks on login button with all empty fields
    Then User should verify the msg at username as "Please fill out this field."

  Scenario: To verify Sign in with Username only
    Given The user is on DS Algo Sign in page
    When User enters Username as "Akshitaa"
    And User clicks on login button with empty password
    Then User should verify the message at Password as "Please fill out this field."

  Scenario: To verify Sign in with password only
    Given The user is on DS Algo Sign in page
    When User enters password as "Test@123"
    And User clicks on login button with empty Username
    Then User can verify the  message  "Please fill out this field."

  #Scenario Outline: Unsuccessful Login with invalid credentials
  # Given The user is on DS Algo Sign in page
  # When The user enters the "<Username>" in text box and "<Password>" in text box
  # And User clicks login button
  # Then The user should see the error message as  "Invalid Username and Password"
  # Examples:
  # | Username | Password    |
  # | Rashmi   | Test@123    |
  # | AkshitaA | Test@321    |
  #| AkshitaA | Dsalgo@2024 |
  Scenario Outline: Unsuccessful Login with invalid Username and Password credentials
    Given The user is on DS Algo Sign in page
    When User enters sheetname "<Sheetname>" and rownumber <RowNumber>
    And User clicks login button
    Then The user should see the error message "Invalid Username and Password"

    Examples: 
      | Sheetname | RowNumber |
      | SignIn    |         0 |
      | SignIn    |         1 |
      | SignIn    |         2 |

  Scenario: Successfull Login with valid credentials
    Given The user is on DS Algo Sign in page
    When User Enters Email as "AkshitaA"
    And Password as "Test@123"
    And Clicks on Login link
    Then User should verify the msg "You are logged in" in Ds Algo homepage

  Scenario: Successfull LogOut
    Given The user is on DS Algo Sign in page
    When User clicks on sign out link
    Then User should look the  successfull logout message "Logged out successfully"
