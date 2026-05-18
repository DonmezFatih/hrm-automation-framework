package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class PersonalDetailsPageElements {

	// Top Navbar
	
	@FindBy(id = "pim.navbar.employeeName")
	public WebElement pimNavName;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.personal_details']")
	public WebElement pimNavPersonalDetails;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.job']")
	public WebElement pimNavJob;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.salary']")
	public WebElement pimNavSalary;

	@FindBy(id = "top-menu-trigger")
	public WebElement pimNavMore;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.contact_details']")
	public WebElement pimMoreContactDetails;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.social_media']")
	public WebElement pimMoreSocialMediaDetails;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.emergency_contact']")
	public WebElement pimMoreEmergencyContacts;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.dependent']")
	public WebElement pimMoreDependent;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.immigration']")
	public WebElement pimMoreImmigration;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.work_week']")
	public WebElement pimMoreWorkWeek;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.report_to']")
	public WebElement pimMoreReportTo;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.qualifications']")
	public WebElement pimMoreQualifications;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.memberships']")
	public WebElement pimMoreMemberships;

	@FindBy(xpath = "//a[@ui-sref='pim.employees.profile.direct_deposit']")
	public WebElement pimMoreDirectDeposit;
	
	
	// Personal Details

	@FindBy(id = "firstName")
	public WebElement firstName;
	
	@FindBy(id = "middleName")
	public WebElement middleName;
	
	@FindBy(id = "lastName")
	public WebElement lastName;
	
	@FindBy(id = "employeeId")
	public WebElement employeeId;
	
	@FindBy(id = "otherId")
	public WebElement otherId;
	
	@FindBy(xpath = "//div[@name='dateForm']//input[@ng-model=\"model['emp_birthday']\"]/following-sibling::i")
	public WebElement birthdayPicker;
	
	@FindBy(xpath = "//select[@id='emp_marital_status']/preceding-sibling::input")
	public WebElement maritalStatusDd;
	
	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']//input[@class='select-dropdown']")
	public WebElement genderPickerDd;
	
	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']//input")
	public WebElement nationalityDd;
	
	@FindBy(id = "licenseNo")
	public WebElement licenseNo;
	
	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[@class='hidden-date-widget']//i")
	public WebElement licenseExpDatePicker;
	
	@FindBy(id = "nickName")
	public WebElement nickName;
	
	@FindBy(id = "militaryService")
	public WebElement militaryService;
	
	@FindBy(xpath = "//label[@for='smoker']")
	public WebElement smoker;
	
	@FindBy(xpath = "//div[@id='eeo_race_ent_inputfileddiv']//input[@class='select-dropdown']")
	public WebElement raceDd;
	
	@FindBy(xpath = "//form[@id='pimPersonalDetailsForm']//button[@type='submit']")
	public WebElement personalDetailsSaveBtn;
	
	@FindBy(xpath = "//div[@class='toast-message']")
	public WebElement toastMsg;
	
	// Important
	
	@FindBy(xpath = "//form[@name='customFieldsForm_0']//div[@id='1_inputfileddiv']//input[@class='select-dropdown']")
	public WebElement bloodGroupDd;
	
	@FindBy(id = "5")
	public WebElement hobbies;
	
	@FindBy(xpath = "//div[@id='19_inputfileddiv']//input[@class='select-dropdown']")
	public WebElement shirtSizeDd;
	
	@FindBy(xpath = "//form[@name='customFieldsForm_0']//button[text()='save']")
	public WebElement importantSaveBtn;
	
	// Prefrences
	
	// returns list
	@FindBy(xpath = "//form[@name='customFieldsForm_1']//ul[@class='radiobutton-container']//label")
	public WebElement foodRadioList;
	
	// returns list
	@FindBy(xpath = "//div[@ng-model=\"model['14']\"]//div[@class='checkbox ']//label")
	public WebElement activitiesCheckboxList;
	
	@FindBy(xpath = "//div[@ng-model=\"model['15']\"]//div[@class='checkbox ']//label")
	public WebElement sportsList;
	
	@FindBy(xpath = "//form[@name='customFieldsForm_1']//button[text()='save']")
	public WebElement preferencesSaveBtn;
	
	// Attachments
	
	@FindBy(xpath = "//div[@ng-if=\"personal.permissions.personal_attachment.read\"]//a[text()='Add']")
	public WebElement attachmentsAddBtn;
	
	@FindBy(xpath = "//form[@name=\"oxdModalForm\"]//input[@type='file']")
	public WebElement attachmentFile;
	
	@FindBy(xpath = "//form[@name=\"oxdModalForm\"]//textarea")
	public WebElement attachmentDescription;
	
	@FindBy(xpath = "//div[@ng-if='vm.showFooter']//button[text()='Cancel']")
	public WebElement attachmentCancelBtn;
	
	@FindBy(xpath = "//div[@ng-if='vm.showFooter']//button[text()='Save']")
	public WebElement attachmentSaveBtn;
	
	
	public PersonalDetailsPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
