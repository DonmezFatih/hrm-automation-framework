Feature: Add Dependency Details

# https://fatih-donmez.atlassian.net/browse/HRM-2

  @Sprint-9
  Scenario: Add All Dependency Details
    When user navigates Employee List page
    Then user verify name in the list and click on it
    When user navigates Immigration page
    Then user should click icon and open a modal form
    And user choose "Visa" and fill "3214-1234-776" and "United States"
    And user should fill dates with "Mon, 04 May 2026" and "Mon, 10 May 2027" and "Tue, 09 Jun 2026"
    And user fill "No Status" and "Good to go"
    Then user should click modal save button
    And user verify "Successfully Saved" is displayed