package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDependent extends CommonMethods {

	@When("user navigates Dependendent page")
	public void user_navigates_dependendent_page() {
		click(personalDetailsPage.pimNavMore);
		click(personalDetailsPage.pimMoreDependent);
		waitForVisibility(dependencyPage.addDependent);
	}
	
	@Then("user add Add Dependendent with {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_add_add_dependendent_with_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6) {
		click(dependencyPage.addDependent);
		sendText(dependencyPage.name, string);
//		selectBoostrapCalendarDate(dependencyPage.registrationDateCalendar, string2, string3, string4);
		sendText(dependencyPage.dateOfBirthInput, "Tue, 05 May 2026");
		selectBootstrapDropdown2(dependencyPage.relationshipDd, string5);
		wait(1);
		sendText(dependencyPage.relationshipSpecify, string6);
	}
	
	@Then("user add Marriage info with {string} and {string} and {string} and {string}")
	public void user_add_marriage_info_with_and_and_and(String string, String string2, String string3, String string4) {
		sendText(dependencyPage.certificateNo, string);
		selectCalendarDate(dependencyPage.registrationDateCalendar, string2, string3, string4);
		click(dependencyPage.marriageSaveBtn);
	}
	
}
