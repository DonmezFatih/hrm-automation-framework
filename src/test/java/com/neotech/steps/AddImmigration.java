package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddImmigration extends CommonMethods {

	@When("user navigates Immigration page")
	public void user_navigates_immigration_page() {
		click(personalDetailsPage.pimNavMore);
		click(personalDetailsPage.pimMoreImmigration);
		waitForVisibility(immigrationPage.addImmigrationBtn);
	}

	@Then("user should click icon and open a modal form")
	public void user_should_click_icon_and_open_a_modal_form() {
		click(immigrationPage.addImmigrationBtn);
	}

	@Then("user choose {string} and fill {string} and {string}")
	public void user_choose_and_fill_and(String string, String string2, String string3) {
		waitForVisibility(immigrationPage.number);
		clickRadioOrCheckbox(immigrationPage.documentTypes, "Visa");
		sendText(immigrationPage.number, string2);
		selectBootstrapDropdown(immigrationPage.issuedByDd, string3);
	}

	@Then("user should fill dates with {string} and {string} and {string}")
	public void user_should_fill_dates_with_and_and(String string, String string2, String string3) {
		sendText(immigrationPage.issuedDate, string);
		sendText(immigrationPage.expiryDate, string2);
		sendText(immigrationPage.reviewDate, string3);
	}

	@Then("user fill {string} and {string}")
	public void user_fill_and(String string, String string2) {
		sendText(immigrationPage.eligibleStatus, string);
		sendText(immigrationPage.comments, string2);
	}

}
