package com.neotech.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddSocialMediaDetails extends CommonMethods {

	@When("user navigates Social Media Details page")
	public void user_navigates_social_media_details_page() {
		click(personalDetailsPage.pimNavMore);
		click(personalDetailsPage.pimMoreSocialMediaDetails);
		waitForVisibility(socialMediaPage.selectBtn);
	}

	@Then("user fill {string} Social Media forms with {string} and {string}")
	public void user_fill_social_media_forms_with_and(String string, String string2, String string3) {
		click(socialMediaPage.addBtn);

		selectBootstrapDropdown(socialMediaPage.socialMediaDropdown, string);

		sendText(socialMediaPage.handle, string2);
		sendText(socialMediaPage.link, string3);
		click(socialMediaPage.share_checkbox);
	}

	@Then("user should click modal save button")
	public void user_should_click_modal_save_button() {
		wait(3);
		click(socialMediaPage.modalSaveBtn);
	}

	@Then("user should update {string} handle with {string}")
	public void user_should_update_handle_with(String string, String string2) {

		List<WebElement> types = socialMediaPage.types;

		for (int i = 1; i <= types.size(); i++) {

			WebElement type = driver
					.findElement(By.xpath("//tbody[@ng-if=\"!listData.staticBody\"]//tr[" + i + "]//td[2]"));

			if (type.getText().equals(string)) {
				click(driver.findElement(By.xpath("//tbody[@ng-if=\"!listData.staticBody\"]//tr[" + i + "]/td[5]//i")));

				socialMediaPage.handle.clear();
				wait(2);
				sendText(socialMediaPage.handle, "tw");
				wait(2);
			}

		}

	}

	@Then("user should delete {string} from the list with {string}")
	public void user_should_delete_from_the_list_with(String string, String string2) {

		List<WebElement> types = socialMediaPage.types;

		for (int i = 1; i <= types.size(); i++) {

			WebElement type = driver
					.findElement(By.xpath("//tbody[@ng-if='!listData.staticBody']//tr[" + i + "]//td[2]"));

			if (type.getText().equals(string)) {

				click(driver.findElement(By.xpath("//tbody[@ng-if='!listData.staticBody']//tr[" + i + "]//td[1]")));

				selectActionDropdown(socialMediaPage.listOptionsDropdown, string2);
				
				wait(2);

				click(socialMediaPage.modal_DeleteBtn);
			}

		}
	}

}
