package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.junit.Test;


public class ProstoTest {
	
	
	 static String baseURI= RestAssured.baseURI="http://18.232.148.34/syntaxapi/api";
	 
	 static String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUxMzE2NjEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTE3NDg2MSwidXNlcklkIjoiNzAxIn0.ZH5xVFvir7HzLexIEw9vBXyMUNar7gk_EgAWP-BcNgs";

	 @Test
	 public void HamaTest() {
		 
	RequestSpecification getAllEmployeeRequest = given().header("Content-Type","application/json").header("Authorization",token);
		 
	    Response getAllEmployeeResponse = when().get("/getAllEmployees.php");
	    
	    getAllEmployeeResponse.prettyPrint();
	    
	    getAllEmployeeResponse.body().asString();
	    
		 
	 }
	  
}
