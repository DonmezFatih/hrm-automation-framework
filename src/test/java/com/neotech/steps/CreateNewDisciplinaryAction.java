package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class CreateNewDisciplinaryAction extends CommonMethods {

	@Then("user choose disciplinary action")
	public void user_choose_disciplinary_action() {
		click(disciplinaryPage.actionBtn);
		clickRadioOrCheckbox(disciplinaryPage.actionsList, "Give written warning");
		click(disciplinaryPage.selectActionBtn);
	}
	
	@Then("user fill out all action and save")
	public void user_fill_out_all_action_and_save() {
		sendText(disciplinaryPage.owner, "Jasmine Morgan");
		click(disciplinaryPage.selectEmp);
		selectCustomDropdown(disciplinaryPage.statusDd, "Completed");
		sendText(disciplinaryPage.actionDescription, "Problem Solved!");
		wait(2);
		click(disciplinaryPage.saveBtn);
	}

}
