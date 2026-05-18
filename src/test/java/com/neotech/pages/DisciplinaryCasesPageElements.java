package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class DisciplinaryCasesPageElements {
	
	@FindBy(id = "addItemBtn")
	public WebElement addDisciplinaryCaseBtn;
	
	@FindBy(id = "addCase_employeeName_empName")
	public WebElement empoyeeName;
	
	@FindBy(xpath = "//div[@class='ac_results']//li[1]")
	public WebElement selectEmp;
	
	@FindBy(id = "addCase_caseName")
	public WebElement caseName;
	
	@FindBy(id = "addCase_description")
	public WebElement description;
	
	@FindBy(id = "btnSave")
	public WebElement saveBtn;
	
	@FindBy(id = "btnBack")
	public WebElement cancelBtn;
	
	@FindBy(id = "btnEdit")
	public WebElement editBtn;
	
	@FindBy(id = "btnAction_closeDisciplinaryCase")
	public WebElement closeCaseBtn;
	
	@FindBy(id = "actionButtons")
	public WebElement actionBtn;
	
	
	// Filter/Search Case
	
	@FindBy(id = "searchModal")
	public WebElement search;
	
	@FindBy(id = "DisciplinaryCaseSearch_empName_empName")
	public WebElement employeeNameSearch;
	
	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//table[@id='resultTable']//td[3]//a")
	public WebElement caseNamePicker;
	
	
	
	// Disciplanry Action
	
	// Returns List
	@FindBy(xpath = "//div[@id='disciplinaryActions']//label")
	public List<WebElement> actionsList;
	
	@FindBy(id = "selectDisciplinaryAction")
	public WebElement selectActionBtn;
	
	@FindBy(xpath = "//div[@id='disciplinaryActions']//a[text()='Cancel']")
	public WebElement cancelActionBtn;
	
	@FindBy(id = "defaultAction_owner_empName")
	public WebElement owner;
	
	@FindBy(xpath = "//label[@for='defaultAction_dueDate']")
	public WebElement dueDateCalendar;
	
	@FindBy(xpath = "//select[@id='defaultAction_status']//preceding-sibling::input")
	public WebElement statusDd;
	
	@FindBy(id = "defaultAction_description")
	public WebElement actionDescription;
	
	public DisciplinaryCasesPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

}
