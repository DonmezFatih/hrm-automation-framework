package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class NavbarElements {
	
	@FindBy(id = "side-menu-hamburger")
	public WebElement navbarCollapseBtn;
	
	@FindBy(xpath = "//div[@id='ohrm-small-logo']//div")
	public WebElement logo;

	@FindBy(id = "account-name")
	public WebElement accountName;
	
	@FindBy(id = "logoutLink")
	public WebElement logoutLink;
	
	@FindBy(id = "home-menu-trigger")
	public WebElement homeMenu;
	
	@FindBy(id = "shortcut-menu-trigger")
	public WebElement shortcutMenu;
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminDd;

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement PIMEmployeeListLink;
	
	@FindBy(linkText = "Add Employee")
	public WebElement PIMaddEmployeeLink;
	
	@FindBy(id = "menu_pim_viewMyDetails")
	public WebElement myInfoLink;
	
	@FindBy(id = "menu_discipline_defaultDisciplinaryView")
	public WebElement disciplineLink;
	
	@FindBy(xpath = "//div[@style='display: block;']//a[@id='menu_discipline_viewDisciplinaryCases']")
	public WebElement disciplinaryCases;
	
	@FindBy(id = "menu_admin_reportsCatalog")
	public WebElement reportsCatalogLink;
	
	@FindBy(id = "menu_news_More")
	public WebElement moreLink;
	
	@FindBy(id = "menu__Maintenance")
	public WebElement maintenanceLink;
	
	
	public NavbarElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
}
