package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class ImmigrationDetailsPageElements {
	
	@FindBy(xpath = "//div[@id='immigrationDiv']//i[text()='add']")
	public WebElement addImmigrationBtn;
	
	// Returns List
	@FindBy(xpath = "//oxd-decorator[@form='schemaForm.form[0]']//label[@class='custom-control-label']")
	public List<WebElement> documentTypes;
	
	@FindBy(id = "number")
	public WebElement number;
	
	@FindBy(xpath = "//button[@data-id='countryCode']")
	public WebElement issuedByDd;
	
	@FindBy(id = "issuedDate")
	public WebElement issuedDate;
	
	@FindBy(id = "expiryDate")
	public WebElement expiryDate;
	
	@FindBy(id = "reviewDate")
	public WebElement reviewDate;
	
	@FindBy(id = "status")
	public WebElement eligibleStatus;
	
	@FindBy(id = "notes")
	public WebElement comments;
	
	public ImmigrationDetailsPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

}
