package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class ContactDetailsPageElements extends CommonMethods {
	
	@FindBy(id = "street1")
	public WebElement addressStreet1;
	
	@FindBy(id = "street2")
	public WebElement addressStreet2;
	
	@FindBy(id = "city")
	public WebElement city;
	
	@FindBy(xpath = "//div[@id='country_inputfileddiv']//input")
	public WebElement country;
	
	@FindBy(xpath = "//div[@id='province_inputfileddiv']//input")
	public WebElement province;
	
	@FindBy(id = "emp_zipcode")
	public WebElement zipcode;
	
	@FindBy(id = "emp_hm_telephone")
	public WebElement homeTelephone;
	
	@FindBy(id = "emp_mobile")
	public WebElement mobile;
	
	@FindBy(id = "emp_work_telephone")
	public WebElement workTelephone;
	
	@FindBy(id = "emp_work_email")
	public WebElement workEmail;
	
	@FindBy(id = "emp_oth_email")
	public WebElement otherEmail;
	
	@FindBy(xpath = "//div[@id='contact_details_tab']//button[@id='modal-save-button']")
	public WebElement saveBtn;
	
	
	public ContactDetailsPageElements()
	{
		PageFactory.initElements(driver, this);
	}

}
