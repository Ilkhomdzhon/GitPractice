package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class ContactDetails extends CommonMethods {
	
	@FindBy(xpath="//*[@id=\"sidenav\"]/li[2]/a")
	public WebElement contactDetails;
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement editBtn;
	
	
	
	@FindBy(id="contact_street1")
	public WebElement addressStr;
	
	@FindBy(id="contact_city")
	public WebElement contactCity;
	
	@FindBy(id="contact_province")
	public WebElement provinceState;
	
	@FindBy(id="contact_emp_zipcode")
	public WebElement zipCode;
	
	@FindBy(id="contact_country")
	public WebElement country;
	
	@FindBy(id="contact_emp_hm_telephone")
	public WebElement homePhone;
	
	@FindBy(id="contact_emp_mobile")
	public WebElement cellPhone;
	
	@FindBy(id="contact_emp_work_telephone")
	public WebElement workPhone;
	
	@FindBy(id="contact_emp_work_email")
	public WebElement workEmail;
	
	@FindBy(id="contact_emp_oth_email")
	public WebElement otherEmail;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	

	
	public ContactDetails() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	
	 public void clickToContactDelail() {
		 jsClick(editBtn);
		 jsClick(saveBtn);
		 
	 }
	

}
