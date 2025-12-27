Feature: Login Functionality

  Scenario: Login with valid data
    When Navigate to the web page
    Then Enter username and password
    Then Click login button
    Then Home page opened

    Scenario: Unsuccessfully Login with invalid credentials
      When Navigate to the web page
      Then Enter invalid username and password
      Then Click login button
      Then Verify error message