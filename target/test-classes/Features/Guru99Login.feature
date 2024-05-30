Feature: Testing login functionality of guru website.

  Scenario Outline: 
    Given user navigates on login page
    Then user enters "<Username>" and "<Password>"
    And click on login button.

    Examples: 
      | Username  | Password      |
      | Sandbkip  | Sandip@123    |
      | Sandip    | Sanjhkjdi@123 |
      | Sandip    | Sandip@123    |
      | Skjhoandp | Sandip@123    |
