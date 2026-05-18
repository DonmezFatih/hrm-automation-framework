package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddWorkWeekDetails extends CommonMethods {

	@When("user navigates Work Week page")
	public void user_navigates_work_week_page() {
		click(personalDetailsPage.pimNavMore);
		click(personalDetailsPage.pimMoreWorkWeek);
		waitForVisibility(workWeekPage.enableBtn);
	}
	
	@Then("user enable work week")
	public void user_enable_work_week() {
		click(workWeekPage.enableBtn);
	}
	
	@Then("user should set lunch in and lunch out time")
	public void user_should_set_lunch_in_and_lunch_out_time() {
		click(workWeekPage.mondayLunchIn);
		click(workWeekPage.hoursP12);
		click(workWeekPage.minuteP00);
		click(workWeekPage.okBtn);
		click(workWeekPage.mondayLunchOut);
		click(workWeekPage.hoursP13);
		click(workWeekPage.minuteP00);
		click(workWeekPage.okBtn);
	}
	
	@Then("user should change saturdays working day")
	public void user_should_change_saturdays_working_day() {
		selectCustomDropdown(workWeekPage.saturdayWorkDd, "Working Day");
		click(workWeekPage.saturdayShiftIn);
		click(workWeekPage.hoursP9);
		click(workWeekPage.minuteP00);
		click(workWeekPage.okBtn);
		click(workWeekPage.saturdayShiftOut);
		click(workWeekPage.hoursP14);
		click(workWeekPage.minuteP00);
		click(workWeekPage.okBtn);
	}
	
	@Then("user click work week save button")
	public void user_click_work_week_save_button() {
		click(workWeekPage.saveBtn);
	}
	
}
