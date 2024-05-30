Feature: Testing the guru99 Login Functionality.

  Scenario: 
    When user on login Page
    Then user enters ValidUname
    Then user enters ValidPword
    And click on submit button
    And Teardown the Page

  Scenario: 
    When user on login Page again
    Then user enters InValidUname
    Then user enters InValidPword
    And click on submit button again
    And Close the Page
