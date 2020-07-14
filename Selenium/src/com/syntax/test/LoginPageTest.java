package com.syntax.test;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		LoginPageElements login = new LoginPageElements();
		
		 sendText(login.username, ConfigsReader.getProperty("username"));
		 sendText(login.password, ConfigsReader.getProperty("password"));
		
	
		
		

	}

}
