Feature: Login Page Functionality

# https://fatih-donmez.atlassian.net/browse/HRM-1

  @Sprint-1
  Scenario: Login using valid admin credentials
    When user enters admin credentials
    And user clicks on login button
    Then user should be navigated to Dashboard page
    Then main logo should be displayed at the top of the page

  @Sprint-1
  Scenario: User should see error messages when credentials are empty
    When user clicks on login button
    Then user should see error messages

  @Sprint-1
  Scenario: User should be redirected to Retry Login page with invalid credentials
    When user enters invalid credentials
    And user clicks on login button
    Then user should be navigated to retry login page
    #And user should see "Invalid Credentials" error message