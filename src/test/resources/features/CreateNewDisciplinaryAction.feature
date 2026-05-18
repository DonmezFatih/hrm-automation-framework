Feature: Search New Disciplinary Case with filter

# https://fatih-donmez.atlassian.net/browse/HRM-15

  @Sprint-16
  Scenario: Search New Disciplinary Case with filter
    When user navigates Disciplinary page
	Then user search diciplinary case with "Talen Horton Tucker"
	And user choose disciplinary action
	And user fill out all action and save
    And user verify "Successfully Added" is displayed