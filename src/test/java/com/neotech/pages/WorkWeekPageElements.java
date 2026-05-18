package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class WorkWeekPageElements {
	
	@FindBy(xpath = "//div[@class='switch']//span")
	public WebElement enableBtn;
	
	@FindBy(xpath = "//form[@id='work-week-form']//tr[@day='Monday']//td[5]//i")
	public WebElement mondayLunchIn;
	
	@FindBy(xpath = "//form[@id='work-week-form']//tr[@day='Monday']//td[6]//i")
	public WebElement mondayLunchOut;
	
	@FindBy(xpath = "//div[@class='clockpicker picker picker--opened']//div[@class='clockpicker-dial clockpicker-hours']//div[text()='9']")
	public WebElement hoursP9;
	
	@FindBy(xpath = "//div[@class='clockpicker picker picker--opened']//div[@class='clockpicker-dial clockpicker-hours']//div[text()='12']")
	public WebElement hoursP12;
	
	@FindBy(xpath = "//div[@class='clockpicker picker picker--opened']//div[@class='clockpicker-dial clockpicker-hours']//div[text()='13']")
	public WebElement hoursP13;
	
	@FindBy(xpath = "//div[@class='clockpicker picker picker--opened']//div[@class='clockpicker-dial clockpicker-hours']//div[text()='14']")
	public WebElement hoursP14;
	
	@FindBy(xpath = "//div[@class='clockpicker picker picker--opened']//div[@class='clockpicker-dial clockpicker-minutes']//div[text()='00']")
	public WebElement minuteP00;
	
	@FindBy(xpath = "//div[@class='clockpicker picker picker--opened']//div[@class='picker__footer']/button[text()='OK']")
	public WebElement okBtn;
	
	@FindBy(xpath = "//form[@id='work-week-form']//tr[@day='Saturday']//td[2]//input")
	public WebElement saturdayWorkDd;
	
	@FindBy(xpath = "//form[@id='work-week-form']//tr[@day='Saturday']//td[3]//i")
	public WebElement saturdayShiftIn;
	
	@FindBy(xpath = "//form[@id='work-week-form']//tr[@day='Saturday']//td[4]//i")
	public WebElement saturdayShiftOut;
	
	@FindBy(xpath = "//a[@ng-click='vm.onSubmitWorkWeek(salaryDetailsForm);']")
	public WebElement saveBtn;
	
	public WorkWeekPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

}
