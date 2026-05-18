Feature: Add Emergency Contact Details

# https://fatih-donmez.atlassian.net/browse/HRM-2

  @Sprint-7
  Scenario: Add All Emergency Contact Details
    When user navigates Employee List page
    Then user verify name in the list and click on it
    When user navigates Emergency Contacts page
    Then user add Add Emergency Contact with "LeBron" and "Brother" and "(321)6547788"
    Then user should click modal save button
    And user verify "Successfully Saved" is displayed