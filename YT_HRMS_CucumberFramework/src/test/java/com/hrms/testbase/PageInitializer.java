package com.hrms.testbase;

import com.hrms.pages.AddEmpoyeeElements;
import com.hrms.pages.ContactDetails;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElemnts;

public class PageInitializer extends BaseClass {
	
	public static LoginPageElemnts login;
	public static DashboardPageElements dashboard;
	public static ContactDetails contacts;
	public static AddEmpoyeeElements addEmp;
	
	
	
	public static void initialize () {
		
		login= new LoginPageElemnts();
		dashboard=new DashboardPageElements();
		contacts=new ContactDetails();
		addEmp=new AddEmpoyeeElements();
		
		
	}

}
