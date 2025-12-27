Feature: Login Functionality

  Scenario: Login with valid data
    When Navigate to the web page
    Then Enter username and password
    Then Click login button
    Then Home page opened
