Feature: Add Membership Details

# https://fatih-donmez.atlassian.net/browse/HRM-10

  @Sprint-13
  Scenario: Add Membership Details
    When user navigates Membership page
    Then user should add Membership
    And user verify "Successfully Saved" is displayed