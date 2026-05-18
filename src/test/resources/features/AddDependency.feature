Feature: Add Dependency Details

# https://fatih-donmez.atlassian.net/browse/HRM-2

  @Sprint-8
  Scenario: Add All Dependency Details
    When user navigates Employee List page
    Then user verify name in the list and click on it
    When user navigates Dependendent page
    Then user add Add Dependendent with "Stephen Curry" and "May" and "15" and "1998" and "Other" and "Father"
    Then user should click modal save button
    And user verify "Successfully Saved" is displayed
    Then user add Marriage info with "1234-123214-44" and "January" and "22" and "2010"
    And user verify "Successfully Updated" is displayed