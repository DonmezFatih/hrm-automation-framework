Feature: Add Work Week Details

# https://fatih-donmez.atlassian.net/browse/HRM-10

  @Sprint-10
  Scenario: Add Work Week Details
    When user navigates Employee List page
    Then user verify name in the list and click on it
    When user navigates Work Week page
    Then user enable work week
    And user should set lunch in and lunch out time
    And user should change saturdays working day
    Then user click work week save button
    And user verify "Successfully Saved" is displayed