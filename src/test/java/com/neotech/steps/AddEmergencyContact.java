package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmergencyContact extends CommonMethods {

	@When("user navigates Emergency Contacts page")
	public void user_navigates_emergency_contacts_page() {
		click(personalDetailsPage.pimNavMore);
		click(personalDetailsPage.pimMoreEmergencyContacts);
		waitForVisibility(emergencyPage.addContactBtn);
	}
	
	@Then("user add Add Emergency Contact with {string} and {string} and {string}")
	public void user_add_add_emergency_contact_with_and_and(String string, String string2, String string3) {
		click(emergencyPage.addContactBtn);
		sendText(emergencyPage.name, string);
		sendText(emergencyPage.relationship, string2);
		sendText(emergencyPage.mobile_phone, string3);
	}
	
}
