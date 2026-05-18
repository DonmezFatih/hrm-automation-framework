package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class DashboardPageElements {

	@FindBy(xpath = "//li[@class='page-title']")
	public WebElement pageTitle;
	
	public DashboardPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
