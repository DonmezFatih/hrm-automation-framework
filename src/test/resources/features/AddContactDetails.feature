Feature: Add Contact Details

# https://fatih-donmez.atlassian.net/browse/HRM-2

  @Sprint-5
  Scenario: Add All Contact Details
    When user navigates Employee List page
    Then user verify name in the list and click on it
    When user navigates Contact Details page
    Then user fill all contact details form
    Then user should click contact details save button
    And user verify "Successfully Updated" is displayed