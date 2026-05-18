package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class ReportToPageElements {
	
	@FindBy(xpath = "//div[@ng-if='(reportto.supervisorPermissions.create || reportto.subordinatePermissions.create)']")
	public WebElement addBtn;
	
	@FindBy(xpath = "//a[@ng-click='reportto.addSupervisor()']")
	public WebElement addSupervisor;
	
	@FindBy(xpath = "//a[@ng-click='reportto.addSubordinate()']")
	public WebElement addSubordinate;
	
	@FindBy(id = "selectedEmployee_value")
	public WebElement name;
	
	@FindBy(xpath = "//button[@data-id='reportingMethodId']")
	public WebElement reportingMethodDd;
	
	public ReportToPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

}
