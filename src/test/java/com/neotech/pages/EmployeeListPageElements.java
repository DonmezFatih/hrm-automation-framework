package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class EmployeeListPageElements {
	
	@FindBy(xpath = "//li[@class='page-title']")
	public WebElement pageTitle;
	
	@FindBy(id = "employee_name_quick_filter_employee_list_value")
	public WebElement searchInput;
	
	@FindBy(id = "quick_search_icon")
	public WebElement searchButton;
	
	@FindBy(xpath = "//table[@id='employeeListTable']//th[@data-field='employeeId']")
	public WebElement employeeIdHeader;
	
	@FindBy(xpath = "//table[@id='employeeListTable']//th[@data-field='name']")
	public WebElement nameHeader;
	
	@FindBy(xpath = "//table[@id='employeeListTable']//th[@data-field='title']")
	public WebElement titleHeader;
	
	@FindBy(xpath = "//table[@id='employeeListTable']//th[@data-field='status']")
	public WebElement statusHeader;
	
	@FindBy(xpath = "//table[@id='employeeListTable']//th[@data-field='sub_unit']")
	public WebElement subUnitHeader;
	
	@FindBy(xpath = "//table[@id='employeeListTable']//th[@data-field='cost_centre']")
	public WebElement costCenterHeader;
	
	@FindBy(xpath = "//table[@id='employeeListTable']//th[@data-field='location']")
	public WebElement locationHeader;
	
	@FindBy(xpath = "//table[@id='employeeListTable']//th[@data-field='supervisor']")
	public WebElement supervisorHeader;

	// returns list
	@FindBy(xpath = "//table[@id='employeeListTable']//tr//td[2]")
	public WebElement employeeIdList;
	
	// returns list
	@FindBy(xpath = "//table[@id='employeeListTable']//tr//td[3]")
	public List<WebElement> nameList;
	
	public EmployeeListPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
