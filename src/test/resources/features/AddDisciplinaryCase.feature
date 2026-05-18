Feature: Add New Disciplinary Case

# https://fatih-donmez.atlassian.net/browse/HRM-2

  @Sprint-14
  Scenario: Add New Disciplinary Case
    When user navigates Disciplinary page
	Then user add new diciplinary case with "Talen Horton Tucker" and "Verbal abuse" and "Verbal abuse against a co-worker"
    And user verify "Successfully Saved" is displayed