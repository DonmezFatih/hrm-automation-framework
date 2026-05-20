package com.neotech.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewEmployeeList extends CommonMethods {
	
	@When("user navigates Employee List page")
	public void user_navigates_employee_list_page() {
		click(navbar.PIM);
		click(navbar.PIMEmployeeListLink);
	}
	@Then("user verify name in the list")
	public void user_verify_name_in_the_list() {
		waitForVisibility(employeeListPage.pageTitle);
		
		List<WebElement> nameList = employeeListPage.nameList;
		
		String expectedName = "Horton Tucker";

		for (int i = 1; i <= nameList.size(); i++) {

		    WebElement name = driver.findElement(
		            By.xpath("//table[@id='employeeListTable']//tr[" + i + "]//td[3]")
		    );
		    
		    if (name.getText().equals(expectedName)) {
				Assert.assertEquals(expectedName, name.getText());
			}
		}
		
		Assert.assertTrue(false);
	}

}
