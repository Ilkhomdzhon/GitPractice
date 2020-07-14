package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LoginPageElemnts extends CommonMethods {
	
	
	@FindBy(id="txtUsername")
	public WebElement userName;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginBtn;
	
	@FindBy(id="spanMessage")
	public WebElement errorMsg;
	
	public LoginPageElemnts() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void login (String uid, String pwd) {
		sendText(userName,uid);
		sendText(password,pwd);
		click(loginBtn);
	}
	public void loginAdmin () {
		sendText(userName,ConfigsReader.getProperty("username"));
		sendText(password,ConfigsReader.getProperty("password"));
		click(loginBtn);
	}
	

}
