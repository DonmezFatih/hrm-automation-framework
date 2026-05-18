package com.neotech.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewEmployee extends CommonMethods {

	@When("user navigates Add Employee page")
	public void user_navigates_add_employee_page() {
		waitForVisibility(navbar.PIM);
		click(navbar.PIM);
		click(navbar.PIMaddEmployeeLink);
	}

	@When("user enters employee first and last name")
	public void user_enters_employee_first_and_last_name() {
		waitForVisibility(addEmployeePage.firstName);
		sendText(addEmployeePage.firstName, "Talen");
		sendText(addEmployeePage.middleName, "Horton");
		sendText(addEmployeePage.lastName, "Tucker");
	}

	@Then("user selects {string} location")
	public void user_selects_location(String string) {
		waitForClickability(driver.findElement(By.cssSelector("button[data-id='location']"))).click();

		waitForClickability(
				driver.findElement(By.xpath("//span[@class='text' and text()='Canadian Development Center']"))).click();
		wait(2);
	}

	@Then("user clicks save button")
	public void user_clicks_save_button() {
		click(addEmployeePage.saveBtn);
	}

	@Then("user verify name on Personal Details page")
	public void user_verify_name_on_personal_details_page() {
		waitForVisibility(personalDetailsPage.pimNavName);
		Assert.assertEquals("Talen Tucker", personalDetailsPage.pimNavName.getText());
		wait(2);
	}

}
