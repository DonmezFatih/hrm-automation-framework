package com.neotech.steps;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddReportToDetails extends CommonMethods {
	
	@When("user navigates Report To page")
	public void user_navigates_report_to_page() {
		click(personalDetailsPage.pimNavMore);
		click(personalDetailsPage.pimMoreReportTo);
		waitForVisibility(reportToPage.addBtn);
	}
	
	@Then("user should add Supervisor")
	public void user_should_add_supervisor() {
		new Actions(driver).moveToElement(reportToPage.addBtn).pause(Duration.ofSeconds(2)).perform();
		click(reportToPage.addSupervisor);
		sendText(reportToPage.name, "Brody Alan");
		selectBootstrapDropdown(reportToPage.reportingMethodDd, "Direct");
		wait(1);
		click(addEmployeePage.saveBtn);
	}
	
	@Then("user should add Subordinate")
	public void user_should_add_subordinate() {
		new Actions(driver).moveToElement(reportToPage.addBtn).pause(Duration.ofSeconds(2)).perform();
		click(reportToPage.addSubordinate);
		sendText(reportToPage.name, "Amanda Cooper");
		selectBootstrapDropdown(reportToPage.reportingMethodDd, "Indirect");
		wait(1);
		click(addEmployeePage.saveBtn);
	}


}
