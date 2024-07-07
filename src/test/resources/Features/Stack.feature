Feature: Stack Module

  Scenario: Selection of Stack Module from Data Structure Page
    Given User Should land on Data Structure Page
    When User should Sign in with username "AkshitaA"  and password "Test@123"
    And User should Click Get Started Link in Stack panel or select Stack option from DataStructure Dropdown
    Then User should land on Stack page

  Scenario: Operations in Stack Link
    Given User should be on Stack Page
    When User Should Click on Operations in Stack  link
    And Click Try Here button of Operations in Stack
    Then The User should land on tryEditor page of Operations in Stack

  Scenario Outline: Verify Inputs of TryEditor page of Operations in Stack
    Given User Should be on  TryEditor page of Operations in Stack
    When The user checks correct output for Various <Input> and <code> of  Operations in Stack
    And Clicks on Run button to validate the code of Operations in Stack page
    Then The output should be expected <expectedOutput> Operations in Stack

    Examples: 
      | Input         | code                        | expectedOutput                     |
      | Valid Input   | "print(\\"hello world\\")"  | "hello world"                      |
      | Empty Input   | ""                          | ""                                 |
      | Invalid Input | "print(\\"hello world\\"):" | "SyntaxError: bad input on line 1" |

  Scenario: Implementation Link
    Given User should be on Operations in Stack page
    When User should click on Implementation page
    And Click Try Here button of Implementation
    Then The User should land on tryEditor page of Implementation

  Scenario Outline: Verify Inputs of TryEditor page of Implementation Page
    Given User Should be on TryEditor page of Implementation
    When The user checks correct output for Various <Input> and <code> of  Implementation
    And Clicks on Run button to validate the code of Implementation
    Then The output should be expected <expectedOutput> Implementation Page

    Examples: 
      | Input         | code                        | expectedOutput                     |
      | Valid Input   | "print(\\"hello world\\")"  | "hello world"                      |
      | Empty Input   | ""                          | ""                                 |
      | Invalid Input | "print(\\"hello world\\"):" | "SyntaxError: bad input on line 1" |

  Scenario: Applications Link
    Given User Should be on Implementation in Stack page
    When User Should Click on Applications Page
    And Click Try Here button of Applications Page
    Then The User should land on tryEditor page of Applications Page

  Scenario Outline: Verify Inputs of TryEditor page of Applications Link
    Given User Should be on TryEditor page of Applications Page
    When The user checks correct output for Various <Input> and <code> of  Applications Page
    And Clicks on Run button to validate the code of Application
    Then The output should be expected <expectedOutput> Applications Page

    Examples: 
      | Input         | code                        | expectedOutput                     |
      | Valid Input   | "print(\\"hello world\\")"  | "hello world"                      |
      | Empty Input   | ""                          | ""                                 |
      | Invalid Input | "print(\\"hello world\\"):" | "SyntaxError: bad input on line 1" |

  Scenario: Practice Questions Link
    Given User Should be on  Applications page
    When User Should Click on Practice Questions
    # And Click Try Here button of Practice Questions Page
    Then The User should land on blank Page

  Scenario: Scenario: Stack Navigation to Home page
    Given The user redirected to Stack page from blank page
    When The user clicks back button
    Then The user directed to home page of Numpy Ninja
