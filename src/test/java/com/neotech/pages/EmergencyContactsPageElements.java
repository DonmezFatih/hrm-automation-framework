package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class EmergencyContactsPageElements {
	
	@FindBy(xpath = "//div[@data-tooltip='Add Emergency Contact']//i")
	public WebElement addContactBtn;
	
	@FindBy(id = "name")
	public WebElement name;
	
	@FindBy(id = "relationship")
	public WebElement relationship;
	
	@FindBy(id = "mobile_phone")
	public WebElement mobile_phone;
	
	
	public EmergencyContactsPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}




