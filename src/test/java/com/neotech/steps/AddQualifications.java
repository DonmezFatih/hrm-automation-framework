package com.neotech.steps;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddQualifications extends CommonMethods {
	
	@When("user navigates Qualifications page")
	public void user_navigates_qualifications_page() {
		click(personalDetailsPage.pimNavMore);
		click(personalDetailsPage.pimMoreQualifications);
		waitForVisibility(qualificationsPage.addBtn);
	}
	
	@Then("user should add Work Experience")
	public void user_should_add_work_experience() {
		new Actions(driver).moveToElement(qualificationsPage.addBtn).pause(Duration.ofSeconds(1)).perform();
		click(qualificationsPage.addWorkExperience);
		sendText(qualificationsPage.company, "NeoTech Academy");
		sendText(qualificationsPage.jobtitle, "QA Analyst");
		sendText(qualificationsPage.fromDate, "Mon, 10 Feb 2025");
		sendText(qualificationsPage.toDate, "Tue, 16 Sep 2025");
		click(qualificationsPage.creditable);
		sendText(qualificationsPage.comment, "Well done!");
		wait(2);
		click(addEmployeePage.saveBtn);
	}
	
	@Then("user should add Education")
	public void user_should_add_education() {
		new Actions(driver).moveToElement(qualificationsPage.addBtn).pause(Duration.ofSeconds(1)).perform();
		click(qualificationsPage.addEducation);
		selectBootstrapDropdown2(qualificationsPage.levelDd, "College Undergraduate");
		sendText(qualificationsPage.institute, "NeoTech University");
		sendText(qualificationsPage.major, "Software Testing");
		sendText(qualificationsPage.year, "2025");
		sendText(qualificationsPage.score, "4.5");
		sendText(qualificationsPage.startDate, "Mon, 10 Feb 2025");
		sendText(qualificationsPage.endDate, "Tue, 16 Sep 2025");
		click(addEmployeePage.saveBtn);
	}
	
	@Then("user should add Skills")
	public void user_should_add_skills() {
		new Actions(driver).moveToElement(qualificationsPage.addBtn).pause(Duration.ofSeconds(1)).perform();
		click(qualificationsPage.addSkill);
		selectBootstrapDropdown2(qualificationsPage.skill, "Programming");
		sendText(qualificationsPage.yearsOfExp, "1");
		sendText(qualificationsPage.comment, "Medium Level Programming");
		click(addEmployeePage.saveBtn);
	}
	
	@Then("user should add Languages")
	public void user_should_add_languages() {
		new Actions(driver).moveToElement(qualificationsPage.addBtn).pause(Duration.ofSeconds(1)).perform();
		click(qualificationsPage.addLanguage);
		selectBootstrapDropdown2(qualificationsPage.language, "English");
		selectBootstrapDropdown2(qualificationsPage.langSkill, "Speaking");
		selectBootstrapDropdown2(qualificationsPage.fluency, "Good");
		sendText(qualificationsPage.comment, "Pretty good");
		click(addEmployeePage.saveBtn);
	}
	
	@Then("user should add License")
	public void user_should_add_license() {
		new Actions(driver).moveToElement(qualificationsPage.addBtn).pause(Duration.ofSeconds(1)).perform();
		click(qualificationsPage.addLicense);
		selectBootstrapDropdown2(qualificationsPage.licence, "Professional License");
		sendText(qualificationsPage.licenseNo, "5432123");
		sendText(qualificationsPage.issuedDate, "Mon, 10 Feb 2025");
		sendText(qualificationsPage.expiryDate, "Tue, 16 Sep 2025");
		click(addEmployeePage.saveBtn);
	}

}
