package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageFunctionality extends CommonMethods {

	@When("user enters admin credentials")
	public void user_enters_admin_credentials() {
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		click(loginPage.loginBtn);
	}

	@Then("user should be navigated to Dashboard page")
	public void user_should_be_navigated_to_dashboard_page() {
		waitForVisibility(dashboardPage.pageTitle);
		Assert.assertEquals(dashboardPage.pageTitle.getText(), "Dashboard");
	}

	@Then("main logo should be displayed at the top of the page")
	public void main_logo_should_be_displayed_at_the_top_of_the_page() {
		Assert.assertTrue(navbar.logo.isDisplayed());
	}

	@Then("user should see error messages")
	public void user_should_see_error_messages() {
		Assert.assertEquals(loginPage.usernameError.getText(), "Username cannot be empty");
		Assert.assertEquals(loginPage.passwordError.getText(), "Password cannot be empty");
	}

	@When("user enters invalid credentials")
	public void user_enters_invalid_credentials() {
		sendText(loginPage.username, "admin12");
		sendText(loginPage.password, "123456");
	}

	@Then("user should be navigated to retry login page")
	public void user_should_be_navigated_to_retry_login_page() {
		Assert.assertEquals("https://hrm.neotechacademy.com/securityAuthentication/retryLogin", driver.getCurrentUrl());
	}

	@Then("user should see {string} error message")
	public void user_should_see_error_message(String string) {
		wait(10);
		waitForVisibility(loginPage.invalidPassword);
		String actual = loginPage.invalidPassword.getText();
		Assert.assertEquals(actual, string);
	}

}
