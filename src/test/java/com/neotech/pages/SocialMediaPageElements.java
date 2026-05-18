package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class SocialMediaPageElements {

	@FindBy(xpath = "//div[@data-tooltip='Add Social Media']//i[text()='add']")
	public WebElement addBtn;
	
	@FindBy(id = "typeId")
	public WebElement type;
	
	@FindBy(id = "profileName")
	public WebElement handle;
	
	@FindBy(id = "profileLink")
	public WebElement link;
	
	@FindBy(xpath = "//input[@id='allowShare']/following::label")
	public WebElement share_checkbox;
	
	@FindBy(id = "modal-save-button")
	public WebElement modalSaveBtn;
	
	@FindBy(xpath = "//button[@ng-click='vm.cancel()']")
	public WebElement cancelBtn;
	
	@FindBy(xpath = "//td[@class=' tooltipped']//i")
	public WebElement editBtn;
	
	@FindBy(xpath = "//th[@class='list-options']//i[@class='material-icons icons-color']")
	public WebElement selectBtn;
	
	// Returns List
	@FindBy(xpath = "//tbody[@ng-if='!listData.staticBody']//label")
	public WebElement select_checkboxes;

	// Returns List
	@FindBy(xpath = "//tbody[@ng-if=\"!listData.staticBody\"]//td[2]")
	public List<WebElement> types;
	
	@FindBy(xpath = "//select[@id='typeId']/following-sibling::button")
	public WebElement socialMediaDropdown;
	
	@FindBy(xpath = "//thead[@ng-if='!listData.staticHeader']//a[contains(@class,'dropdown-button')]")
	public WebElement listOptionsDropdown;
	
	@FindBy(xpath = "//div[@id='delete_confirmation_modal']//button[text()='No, Cancel']")
	public WebElement modal_CancelBtn;
	
	@FindBy(xpath = "//div[@id='delete_confirmation_modal']//button[@id='save-button']")
	public WebElement modal_DeleteBtn;
	
	
	public SocialMediaPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}




