Feature: Add Work Week Details

# https://fatih-donmez.atlassian.net/browse/HRM-10

  @Sprint-11
  Scenario: Add Report To Details
    When user navigates Employee List page
    Then user verify name in the list and click on it
    When user navigates Report To page
    Then user should add Supervisor
    And user verify "Successfully Saved" is displayed
    Then user should add Subordinate
    And user verify "Successfully Saved" is displayed