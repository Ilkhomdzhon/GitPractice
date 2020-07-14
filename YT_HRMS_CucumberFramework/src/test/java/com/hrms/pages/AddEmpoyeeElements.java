package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddEmpoyeeElements extends CommonMethods {
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	
	@FindBy(id="middleName")
	public WebElement middleName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(id="employeeId")
	public WebElement empID;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	public AddEmpoyeeElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
