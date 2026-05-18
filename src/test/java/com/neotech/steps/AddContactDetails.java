package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddContactDetails extends CommonMethods {
	
	@When("user navigates Contact Details page")
	public void user_navigates_contact_details_page() {
		click(personalDetailsPage.pimNavMore);
		click(personalDetailsPage.pimMoreContactDetails);
		waitForVisibility(contactDetailsPage.addressStreet1);
	}

	@Then("user fill all contact details form")
	public void user_fill_all_contact_details_form() {
		sendText(contactDetailsPage.addressStreet1, "Lakeshore Rd");
		sendText(contactDetailsPage.addressStreet2, "The Colony");
		sendText(contactDetailsPage.city, "San Mateo");
		selectCustomDropdown(contactDetailsPage.country, "United States");
		selectCustomDropdown(contactDetailsPage.province, "Colorado");
		sendText(contactDetailsPage.zipcode, "63842");
		sendText(contactDetailsPage.homeTelephone, "(956) 646-8598");
		sendText(contactDetailsPage.mobile, "(550) 957-6757");
		sendText(contactDetailsPage.workTelephone, "(962) 664-0802");
		sendText(contactDetailsPage.workEmail, "TalenTucker@example.com");
		sendText(contactDetailsPage.otherEmail, "THT@gmail.com");
	}

	@Then("user should click contact details save button")
	public void user_should_click_contact_details_save_button() {
		waitForClickability(contactDetailsPage.saveBtn);
		click(contactDetailsPage.saveBtn);
		wait(1);
	}

}
