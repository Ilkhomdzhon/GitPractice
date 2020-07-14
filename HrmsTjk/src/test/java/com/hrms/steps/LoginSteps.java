package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends CommonMethods {

	@Given("user opens a browser and navigates to website")
	public void user_opens_a_browser() {
		setUp();
	}
	@When("user enters valid username")
	public void user_enters_valid_username() {
		//LoginPageElements login= new LoginPageElements();
	    sendText(login.username, ConfigsReader.getProperty("username"));
	    //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	@Then("user closes the browser")
	public void user_closes_the_browser() {
	    tearDown();
	}
	@When("user enters valid password")
	public void user_enters_valid_password() {
	    sendText(login.password,ConfigsReader.getProperty("password"));
	    wait(2);
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	   click(login.loginBtn);
	}
	@Then("user should see Welcome username text")
	public void ilhom() {
	    String actualText=dashboard.welcome.getText();
	    String expectedText= "Welcome Admin";
	    Assert.assertEquals("It is not logged in",expectedText ,actualText);
	    //Assert.assertTrue(expectedText.equals(actualText));
	    wait(3);
	}
	
	@When("user enters invalid username")
	public void user_enters_invalid_username() {
	   
	}

	@When("user enters invalid password")
	public void user_enters_invalid_password() {
	   
	}

}

