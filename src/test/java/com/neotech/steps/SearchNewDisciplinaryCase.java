package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class SearchNewDisciplinaryCase extends CommonMethods {

	@Then("user search diciplinary case with {string}")
	public void user_search_diciplinary_case_with(String string) {
		click(disciplinaryPage.search);
		sendText(disciplinaryPage.employeeNameSearch, string);
		wait(1);
		click(disciplinaryPage.selectEmp);
		wait(1);
		click(disciplinaryPage.searchBtn);
		wait(2);
		click(disciplinaryPage.caseNamePicker);
		wait(3);
	}


}
