Feature: Add Qualifications Details

# https://fatih-donmez.atlassian.net/browse/HRM-10

  @Sprint-12
  Scenario: Add Qualifications Details
    When user navigates Employee List page
    Then user verify name in the list and click on it
    When user navigates Qualifications page
    Then user should add Work Experience
    And user verify "Successfully Saved" is displayed
    Then user should add Education
    And user verify "Successfully Saved" is displayed
    Then user should add Skills
    And user verify "Successfully Saved" is displayed
    Then user should add Languages
    And user verify "Successfully Saved" is displayed
    Then user should add License
    And user verify "Successfully Saved" is displayed