Feature: Add New Employee Functionality

# https://fatih-donmez.atlassian.net/browse/HRM-2

  @Sprint-2
  Scenario: Adding new Employee
    When user navigates Add Employee page
    And user enters employee first and last name
    Then user selects "Canadian Development Center" location
    Then user clicks save button
    And user verify name on Personal Details page