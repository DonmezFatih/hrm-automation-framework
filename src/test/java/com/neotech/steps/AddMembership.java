package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddMembership extends CommonMethods {

	@When("user navigates Membership page")
	public void user_navigates_membership_page() {
		driver.navigate().to("https://hrm.neotechacademy.com/client/#/pim/employees/138/employee_memberships");
		waitForVisibility(membershipPage.addMembership);
	}
	@Then("user should add Membership")
	public void user_should_add_membership() {
		wait(2);
		click(membershipPage.addMembership);
		selectBootstrapDropdown2(membershipPage.membershipDd, "British Computer Society");
		selectBootstrapDropdown2(membershipPage.subPaidByDd, "Individual");
		sendText(membershipPage.subFee, "5400");
		selectBootstrapDropdown2(membershipPage.currencyDd, "United States Dollar");
		sendText(membershipPage.subCommenceDate, "Wed, 13 May 2025");
		sendText(membershipPage.subRenewalDate, "Wed, 13 May 2026");
		click(addEmployeePage.saveBtn);
	}
	
}
