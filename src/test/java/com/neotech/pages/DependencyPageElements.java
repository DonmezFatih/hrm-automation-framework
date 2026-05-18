package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class DependencyPageElements {
	
	@FindBy(xpath = "//div[@data-tooltip='Add Dependent']//i")
	public WebElement addDependent;
	
	@FindBy(id = "name")
	public WebElement name;
	
	@FindBy(id = "date_of_birth")
	public WebElement dateOfBirthInput;
	
	@FindBy(xpath = "//input[@id='date_of_birth']/following::i[@class='material-icons date-picker-open-icon']")
	public WebElement dateOfBirth;
	
	@FindBy(xpath = "//label[@for='relationship_type']//following::i[@class='material-icons']")
	public WebElement relationshipDd;
	
	@FindBy(id = "relationship")
	public WebElement relationshipSpecify;
	
	@FindBy(id = "3")
	public WebElement certificateNo;
	
	@FindBy(xpath = "//input[@id='4']/following-sibling::span//i")
	public WebElement registrationDateCalendar;
	
	@FindBy(xpath = "//form[@name='customFieldsForm_0']//button[@type='submit']")
	public WebElement marriageSaveBtn;
	
	public DependencyPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

}
