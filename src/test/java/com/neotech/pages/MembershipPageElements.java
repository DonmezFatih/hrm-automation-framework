package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class MembershipPageElements {
	
	@FindBy(xpath = "//a[@ng-click='memberships.addMembership()']")
	public WebElement addMembership;
	
	@FindBy(xpath = "//select[@id='membership']//following-sibling::button")
	public WebElement membershipDd;
	
	@FindBy(xpath = "//select[@id='subscriptionPaidBy']//following-sibling::button")
	public WebElement subPaidByDd;
	
	@FindBy(id = "subscriptionFee")
	public WebElement subFee;
	
	@FindBy(xpath = "//select[@id='subscriptionCurrency']//following-sibling::button")
	public WebElement currencyDd;
	
	@FindBy(id = "subscriptionCommenceDate")
	public WebElement subCommenceDate;
	
	@FindBy(id = "subscriptionRenewalDate")
	public WebElement subRenewalDate;
	
	public MembershipPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

}
