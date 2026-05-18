package com.neotech.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class AddPersonalDetails extends CommonMethods {

	@Then("user verify name in the list and click on it")
	public void user_verify_name_in_the_list_and_click_on_it() {
		wait(1);
		waitForVisibility(employeeListPage.pageTitle);

		List<WebElement> nameList = employeeListPage.nameList;

		String expectedName = "Talen Horton Tucker";

		for (int i = 1; i <= nameList.size(); i++) {

			WebElement name = driver.findElement(By.xpath("//table[@id='employeeListTable']//tr[" + i + "]//td[3]"));

			if (name.getText().equals(expectedName)) {
				click(name);
			}
		}
	}

	@Then("user fill all form item")
	public void user_fill_all_form_item() {
		sendText(personalDetailsPage.otherId, "8");
		selectCalendarDate(personalDetailsPage.birthdayPicker, "November", "5", "2000");
		selectCustomDropdown(personalDetailsPage.maritalStatusDd, "Single");
		selectCustomDropdown(personalDetailsPage.genderPickerDd, "Male");
		selectCustomDropdown(personalDetailsPage.nationalityDd, "American");
		sendText(personalDetailsPage.licenseNo, "D123-123-12-123");
		selectCalendarDate(personalDetailsPage.licenseExpDatePicker, "January", "25", "2027");
		sendText(personalDetailsPage.nickName, "THT");
		sendText(personalDetailsPage.militaryService, "No");
		click(personalDetailsPage.smoker);
		wait(3);
	}

	@Then("user should click save button")
	public void user_should_click_save_button() {
		waitForClickability(personalDetailsPage.personalDetailsSaveBtn);
		click(personalDetailsPage.personalDetailsSaveBtn);
	}

	@Then("user verify {string} is displayed")
	public void user_verify_is_displayed(String string) {
		waitForVisibility(personalDetailsPage.toastMsg);
		Assert.assertEquals(string, personalDetailsPage.toastMsg.getText());
		wait(1);
	}

}
