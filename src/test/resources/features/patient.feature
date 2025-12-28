Feature: Patient Functionality

  Background:
    Given Navigate to the web page
    When Enter username and password
    Then Click login button
    Then Verify Home page opened

    @Regression
  Scenario Outline: Create a new patient
    Then Click add patient button
    Then Enter firstname "<firstname>" and lastname "<lastname>"
    Then Select gender "<number>"
    Then Enter birthday year "<year>" month "<month>"
    Then Click register patient button
    Examples:
      | firstname | lastname | year | month | number |
      | test      | user     | 19   | 4     | 1      |
      | tester    | users    | 25   | 8     | 2      |