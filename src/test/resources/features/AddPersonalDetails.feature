Feature: Add Personal Details

# https://fatih-donmez.atlassian.net/browse/HRM-2

  @Sprint-4
  Scenario: Add All Personal Details
    When user navigates Employee List page
    Then user verify name in the list and click on it
    And user fill all form item
    Then user should click save button
    And user verify "Successfully Updated" is displayed