package com.neotech.testbase;

import com.neotech.pages.ContactDetailsPageElements;
import com.neotech.pages.AddEmployeePageElements;
import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.DependencyPageElements;
import com.neotech.pages.DisciplinaryCasesPageElements;
import com.neotech.pages.EmergencyContactsPageElements;
import com.neotech.pages.EmployeeListPageElements;
import com.neotech.pages.ImmigrationDetailsPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.MembershipPageElements;
import com.neotech.pages.NavbarElements;
import com.neotech.pages.PersonalDetailsPageElements;
import com.neotech.pages.QualificationsPageElements;
import com.neotech.pages.ReportToPageElements;
import com.neotech.pages.SocialMediaPageElements;
import com.neotech.pages.WorkWeekPageElements;

public class PageInitializer extends BaseClass {

	
	public static LoginPageElements loginPage;
	public static NavbarElements navbar;
	public static AddEmployeePageElements addEmployeePage;
	public static PersonalDetailsPageElements personalDetailsPage;
	public static DashboardPageElements dashboardPage;
	public static EmployeeListPageElements employeeListPage;
	public static ContactDetailsPageElements contactDetailsPage;
	public static SocialMediaPageElements socialMediaPage;
	public static EmergencyContactsPageElements emergencyPage;
	public static DependencyPageElements dependencyPage;
	public static ImmigrationDetailsPageElements immigrationPage;
	public static WorkWeekPageElements workWeekPage;
	public static ReportToPageElements reportToPage;
	public static QualificationsPageElements qualificationsPage;
	public static MembershipPageElements membershipPage;
	public static DisciplinaryCasesPageElements disciplinaryPage;
	
	
	public static void initialize()
	{
		loginPage = new LoginPageElements();
		navbar = new NavbarElements();
		addEmployeePage = new AddEmployeePageElements();
		personalDetailsPage = new PersonalDetailsPageElements();
		dashboardPage = new DashboardPageElements(); 
		employeeListPage = new EmployeeListPageElements();
		contactDetailsPage = new ContactDetailsPageElements();
		socialMediaPage = new SocialMediaPageElements();
		emergencyPage = new EmergencyContactsPageElements();
		dependencyPage = new DependencyPageElements();
		immigrationPage = new ImmigrationDetailsPageElements();
		workWeekPage = new WorkWeekPageElements();
		reportToPage = new ReportToPageElements();
		qualificationsPage = new QualificationsPageElements();
		membershipPage = new MembershipPageElements();
		disciplinaryPage = new DisciplinaryCasesPageElements();
	}

}
