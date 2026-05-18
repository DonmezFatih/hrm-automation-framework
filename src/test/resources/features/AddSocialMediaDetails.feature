Feature: Add Social Media Details

# https://fatih-donmez.atlassian.net/browse/HRM-2

  @Sprint-6
  Scenario: Add All Social Media Details
    When user navigates Employee List page
    Then user verify name in the list and click on it
    When user navigates Social Media Details page
    Then user fill "Facebook" Social Media forms with "fb" and "https://www.facebook.com/"
    Then user should click modal save button
    And user verify "Successfully Saved" is displayed
    Then user fill "LinkedIn" Social Media forms with "lkd" and "https://www.linkedin.com/"
    Then user should click modal save button
    And user verify "Successfully Saved" is displayed
    Then user fill "Twitter" Social Media forms with "twt" and "https://www.twitter.com/"
    Then user should click modal save button
    And user verify "Successfully Saved" is displayed
    Then user should update "Twitter" handle with "tw"
    Then user should click modal save button
    And user verify "Successfully Updated" is displayed
    Then user should delete "Facebook" from the list with "Delete Selected"
    And user verify "Successfully Deleted" is displayed