
@tag
Feature: Testing Neo Site as All Functionality
 
  
  Scenario: Testing Login Functionality
    Given User is on Login Page 
    And User enters valid Login ID
   And User enters Valid Password
    And User Click on submit button.
    
   Scenario: Testing Login Functionality with invalid details
    Given User is on Login Page 
    And User enters valid Login ID
   And User enters Valid Password
    And User Click on submit button.
  
  
