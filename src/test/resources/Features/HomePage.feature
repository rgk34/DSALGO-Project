Feature: Home Page

  Scenario: Starting the Ds Algo portal  home page
    Given User should open the Ds algo potal link
    When User should click on Get Started Page
    Then User should land on home page

  Scenario Outline: User is on home page and clicks the Data structure dropdown without sign in
    Given User is on home page
    When User clicks on Data Structure dropdown without sign in
    Then The user selects any of the options from dropdown menu "<value>"
    Then User sould see the message "You are not logged in"

    Examples: 
      | value       |
      | Array       |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  Scenario Outline: User is on home page and clicks on any Get started link
    Given User is on home page
    When User clicks on any of the Get Started link before Signin "<value>" in homepage
    Then User should see the message "You are not logged in"

    Examples: 
      | value       |
      | Array       |
      | Linked List |
      | Stack       |
      | Queue       |
      | Tree        |
      | Graph       |

  Scenario: User clicks on Sign in link
    Given User is on home page
    When User clicks on  the Sign in link
    Then User should land on login page

  Scenario: User clicks on Register link
    Given User is on home page
    When User clicks on  the Register link
    Then User should land on register page
