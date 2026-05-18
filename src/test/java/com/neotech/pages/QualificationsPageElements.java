package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class QualificationsPageElements {
	
	@FindBy(xpath = "//a[@data-activates='additem-options-dropdown-qualifications']")
	public WebElement addBtn;
	
	
	// Work Experience
	@FindBy(xpath = "//a[@ng-click='qualifications.addWorkExperience()']")
	public WebElement addWorkExperience;
	
	@FindBy(id = "employer")
	public WebElement company;
	
	@FindBy(id = "jobtitle")
	public WebElement jobtitle;
	
	@FindBy(id = "from_date")
	public WebElement fromDate;
	
	@FindBy(id = "to_date")
	public WebElement toDate;
	
	@FindBy(xpath = "//input[@id='creditable']//following-sibling::label")
	public WebElement creditable;
	
	@FindBy(id = "comments")
	public WebElement comment;
	
	
	// Education
	@FindBy(xpath = "//a[@ng-click='qualifications.addEducation()']")
	public WebElement addEducation;
	
	@FindBy(xpath = "//select[@id='educationId']//following-sibling::button")
	public WebElement levelDd;
	
	@FindBy(id = "institute")
	public WebElement institute;
	
	@FindBy(id = "major")
	public WebElement major;
	
	@FindBy(id = "year")
	public WebElement year;
	
	@FindBy(id = "score")
	public WebElement score;
	
	@FindBy(id = "startDate")
	public WebElement startDate;
	
	@FindBy(id = "endDate")
	public WebElement endDate;
	
	
	// Skill
	@FindBy(xpath = "//a[@ng-click='qualifications.addSkill()']")
	public WebElement addSkill;
	
	@FindBy(xpath = "//select[@id='skillId']//following-sibling::button")
	public WebElement skill;
	
	@FindBy(id = "years_of_exp")
	public WebElement yearsOfExp;
	
	
	// Language
	@FindBy(xpath = "//a[@ng-click='qualifications.addLanguage()']")
	public WebElement addLanguage;
	
	@FindBy(xpath = "//select[@id='langId']//following-sibling::button")
	public WebElement language;
	
	@FindBy(xpath = "//select[@id='fluency']//following-sibling::button")
	public WebElement langSkill;
	
	@FindBy(xpath = "//select[@id='competency']//following-sibling::button")
	public WebElement fluency;
	
	
	// License
	@FindBy(xpath = "//a[@ng-click='qualifications.addLicense()']")
	public WebElement addLicense;
	
	@FindBy(xpath = "//select[@id='licenseId']//following-sibling::button")
	public WebElement licence;
	
	@FindBy(id = "licenseNo")
	public WebElement licenseNo;
	
	@FindBy(id = "licenseIssuedDate")
	public WebElement issuedDate;
	
	@FindBy(id = "licenseExpiryDate")
	public WebElement expiryDate;
	
	
	public QualificationsPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

}
