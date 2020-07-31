package com.hrms.API.steps.practice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class WorkflowAllSteps {
	
	String BaseURI	= RestAssured.baseURI= "http://18.232.148.34/syntaxapi/api";
	RequestSpecification request ;

	@Given("a request is prepared to create an employee")
	public void a_request_is_prepared_to_create_an_employee() {
		
		given().header("Content-Type","application/json").header("Authorization",TokenGenerationSteps.token);
		
		//given().header(header)
		
		
		
	}

	@When("a POST call is made to create an employee")
	public void a_POST_call_is_made_to_create_an_employee() {
		
		 request = given().header("Content-Type","application/json").header("Authorization",TokenGenerationSteps.token).body("{\n" + 
				"  \"emp_firstname\": \"Joseph\",\n" + 
				"  \"emp_lastname\": \"Abraham\",\n" + 
				"  \"emp_middle_name\": \"Ahmad\",\n" + 
				"  \"emp_gender\": \"M\",\n" + 
				"  \"emp_birthday\": \"2012-07-08\",\n" + 
				"  \"emp_status\": \"Worker\",\n" + 
				"  \"emp_job_title\": \"Developer\"\n" + 
				"}");
		
	}

	@Then("the status code for creating an employee is {int}")
	public void the_status_code_for_creating_an_employee_is(Integer int1) {
	}

	@Then("employee is created")
	public void employee_is_created() {
	}

	@Then("the employee ID is store as a global variable to be used for other calls")
	public void the_employee_ID_is_store_as_a_global_variable_to_be_used_for_other_calls() {
	   
	}

	
	
	
	 

}
