package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDisciplinaryCase extends CommonMethods {

	@When("user navigates Disciplinary page")
	public void user_navigates_disciplinary_page() {
		click(navbar.disciplineLink);
		click(navbar.disciplinaryCases);
		
		// Sneaky little b
		switchToFrame("noncoreIframe");
	}

	@Then("user add new diciplinary case with {string} and {string} and {string}")
	public void user_add_new_diciplinary_case_with_and_and(String string, String string2, String string3) {
		click(disciplinaryPage.addDisciplinaryCaseBtn);
		sendText(disciplinaryPage.empoyeeName, string);
		click(disciplinaryPage.selectEmp);
		sendText(disciplinaryPage.caseName, string2);
		sendText(disciplinaryPage.description, string3);
		click(disciplinaryPage.saveBtn);
		wait(2);
		click(disciplinaryPage.cancelBtn);
	}

}
