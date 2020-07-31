package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
/**
 * Rest assured static packages
 */

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/**
 * importing JUnit packages
 */

import org.junit.Assert;
import org.junit.Test;

import org.junit.*;
import org.junit.runners.MethodSorters;

//import org.apache.hc.core5.http.ContentType;

/**
 * This @FixMethodOrder(MethodSorter.Name_Ascending)will execute @Test
 * annotation is ascending alphabetical order
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardcodedExamples {

	/**
	 * Rest Assured 
	 * 
	 * given - prepare your request 
	 * when - you are making the call to the endpoint 
	 * then - validating
	 * 
	 * @param args
	 * 
	 */

	static String baseURI = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTU3MzM1ODcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTc3Njc4NywidXNlcklkIjoiNzAxIn0.gsdG7-LTMx8sa53zEx6aP5rwviFWL3rk73erTBQ8WHA";
	static String employeeID;

	@Test
	public void sampleTestNotes() {

		/**
		 * BaseURI for calls
		 */

		/**
		 * JWT required for calls - expires every 12 hours
		 */

		/**
		 * Preparing /getOneEmployee.php request
		 */

		RequestSpecification getOneEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token).queryParam("employee_id", "16508A");// log().all(); this code gives you
																					// all the information

		/**
		 * Storing response
		 */

		Response getOneEmployeeResponse = getOneEmployeeRequest.when().get("/getOneEmployee.php");

		/**
		 * Two ways to print response prettyPrint() method converts JSON object into
		 * String and prints - no need to SOP
		 */
		getOneEmployeeResponse.prettyPrint();

		String response = getOneEmployeeResponse.body().asString();

		/**
		 *
		 --> Verifying response status code is 200
		 */
		

		getOneEmployeeResponse.then().assertThat().statusCode(200);

		// ---> System.out.println("Goodbye world");

	}

	@Test
	public void aPOSTcreateEmployee() {

		RequestSpecification createEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token)
				.body("{\n" + 
						"            \"employee_id\": \"20796A\",\n" + 
						"            \"emp_firstname\": \"Joseph\",\n" + 
						"            \"emp_middle_name\": \"Ahmad\",\n" + 
						"            \"emp_lastname\": \"Ilhomi\",\n" + 
						"            \"emp_birthday\": \"2012-07-08\",\n" + 
						"            \"emp_gender\": \"M\",\n" + 
						"            \"emp_job_title\": \"Developer\",\n" + 
						"            \"emp_status\": \"Worker\"\n" + 
						"        \n" + 
						"    \n" + 
						"}");

		Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");

		createEmployeeResponse.prettyPrint();

		/**
		 * jsonPath() to view response body which lets us get the employee ID we store
		 * employee ID as a global so that we can use it with other calls
		 * 
		 * 
		 */

		employeeID = createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");

		/** optional to print employee ID */

		System.out.println(employeeID);

		/**
		 * Verifying response status code is 201 .
		 */
		createEmployeeResponse.then().assertThat().statusCode(201);

		/**
		 * Verifying message using equalTo() method -manually import static package -->
		 * import static org.hamcrest.Matchers.*;
		 */

		createEmployeeResponse.then().body("Message", equalTo("Entry Created"));

		/**
		 * Verifying created first name
		 */
		createEmployeeResponse.then().body("Employee[0].emp_firstname", equalTo("Joseph"));

		/**
		 * Verifying server using then().header()
		 */
		createEmployeeResponse.then().header("Server", "Apache/2.4.39 (Win64) PHP/7.2.18");

		/**
		 * Verifying Content-Type using asserThat().header()
		 */

		createEmployeeResponse.then().assertThat().header("Content-Type", "application/json");

	}

	@Test
	public void bGETcreatedEmployee() {
		/**
		 * Preparing request for /getOneEmployee.php Using log().all(). see all
		 * information being sent with request
		 */
		RequestSpecification getCreatedEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token).queryParam("employee_id", employeeID);//.log().all();
		/**
		 * Making call to retrieve created employee
		 */
		Response getCreatedEmployeeResponse = getCreatedEmployeeRequest.when().get("/getOneEmployee.php");
		/**
		 * Printing response using prettyPrint()
		 */
		String response = getCreatedEmployeeResponse.prettyPrint();
		/**
		 * Storing response employeeID into empID which will be used for verification
		 * against stored global employee ID
		 */
		String empID = getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
		/**
		 * matching exact employeeID's
		 */
		boolean verifyingEmpoyeeIDsMatch = empID.contentEquals(employeeID);

		System.out.println("Employee ID's match " + verifyingEmpoyeeIDsMatch);

		/**
		 * Asserting employee ID's match
		 */
		Assert.assertTrue(verifyingEmpoyeeIDsMatch);

		getCreatedEmployeeResponse.then().assertThat().statusCode(200);

		/**
		 * Using JsonPath class to retrieve values from responses
		 */

		JsonPath js = new JsonPath(response);

		String emplID = js.getString("employee[0].employee_id");

		String firstName = js.getString("employee[0].emp_firstname");

		String middleName = js.getString("employee[0].emp_middle_name");

		String lastName = js.getString("employee[0].emp_lastname");

		String emp_bday = js.getString("employee[0].emp_birthday");

		String gender = js.getString("employee[0].emp_gender");

		String jobTitle = js.getString("employee[0].emp_job_title");

		String empStatus = js.getString("employee[0].emp_status");

//		System.out.println(emplID);
//		System.out.println("firstName: " + firstName);
//		System.out.println("midddleName: " + middleName);
//		System.out.println("lastName: " + lastName);

		/**
		 * Verifying employee ID's match
		 */
		Assert.assertTrue(emplID.contentEquals(employeeID));

		// Second way of asserting
		Assert.assertEquals(employeeID, emplID);

		// Verifying expected first name matches actual firstname
		Assert.assertTrue(firstName.contentEquals("Joseph"));

		// Verifying expected first name matches actual middlename
		Assert.assertTrue(middleName.contentEquals("Ahmad"));

		// Verifying expected first name matches actual lastname
		Assert.assertTrue(lastName.contentEquals("Ilhomi"));

		// Verifying expected first name matches birthday
		Assert.assertTrue(emp_bday.contentEquals("2012-07-08"));

		// Verifying expected first name matches Gender
		Assert.assertTrue(gender.contentEquals("Male"));

		// Verifying expected first name matches job title
		Assert.assertTrue(jobTitle.contentEquals("Developer"));

		//// Verifying expected first name matches employee status
		Assert.assertTrue(empStatus.contentEquals("Worker"));

	}

	@Test
	public void cGETallEmployees() {
		/**
		 * Preparing /getAllEmployees.php request
		 */

		RequestSpecification getAllEmployeesRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token);

		/**
		 * Storing response into getAllEmployeesResponse
		 */

		Response getAllEmployeesResponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");

		/**
		 * Printing all employees
		 */

		String allEmployees = getAllEmployeesResponse.body().asString();

		/**
		 * The below will pass but incorrect
		 * 
		 */

		// allEmployees.constains(EmployeeID);
		/**
		 * ----------DO RESEARCH-------------
		 */

		JsonPath js = new JsonPath(allEmployees);

		/**
		 * Retrieving size of Employees List
		 */

		int sizeOfList = js.getInt("Employees.size()");

		System.out.println(sizeOfList);

		/**
		 * Print out all employee ID's
		 * 
		 */
//		for (int i = 0; i < sizeOfList; i++) {
//
//			/**
//			 * Printing all employee ID's
//			 */
//
//			String allEmployeeIDs = js.getString("Employees[" + i + "].employee_id");
//
//			//System.out.println(allEmployeeIDs);
//			
//			
//			/**
//			 * 
//			 */
// 
//			if (allEmployeeIDs.contentEquals(employeeID)) {
//				
//				 System.out.println("Employee ID :" + employeeID + " is present in body");
//				 
//			    String employeeFirstName = js.getString("Employees[" + i + "].emp_firstname");
//			    System.out.println(employeeFirstName);
//			    
//			    break ; 
//			    
//			}
//		

	}

	@Test
	public void dPUTupdateCreatedEmployee() {
		
		/**
		 * Preparing request to update created employee 
		 * calling static method updateCreatedEmpBody() from HardcodedConstants class
		 */

		RequestSpecification updateCreatedEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token)
				.body(PayloadConstants.updateCreatedEmpBody());


	  	/**
	  	 * Storing response into a updateCreatedEmployeeResponse 
	  	 */
		
		Response updateCreatedEmployeeResponse = updateCreatedEmployeeRequest.when().put("/updateEmployee.php");


			
		  		 /**
		  		  * Storing response into a String 
 		  		  */
			 
		String response = updateCreatedEmployeeResponse.prettyPrint();
			
		 /**
		  * Asserting using hamcrest matchers equalTo() method to verify employee is updated 
		  * 
		  */
		
		updateCreatedEmployeeResponse.then().assertThat().body("Message", equalTo("Entry updated"));
		
		/** 
		 * Retreiving response body employee ID using jsonPath()
		 */
		
		String empID=updateCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
		 
		/**
		  * Asserting that response body employee ID matches globally stored employee ID 
		 */
		
		Assert.assertTrue(empID.contentEquals(employeeID));
		 
		
	}
	@Test
	public void eGETUpdatedEmployee() {
		
		
		/**
		 * Preparing request to get updated employee
		 */
		
		RequestSpecification getUpdatedEmployeeRequest = given().header("Content-Type","application/json").header("Authorization", token).queryParam("employee_id", employeeID);
		 
		 /**
		  * Storing response into getUpdatedEmployeeResponse
		  */
		
		Response getUpdatedEmployeeResponse = getUpdatedEmployeeRequest.when().get("/getOneEmployee.php");
		 
	 /**
	  * Printing response
	  */
		  // getUpdatedEmployeeResponse.prettyPrint();
		
		
		
		/**
		 * Asserting expected first name 
		 */
		getUpdatedEmployeeResponse.then().assertThat().body("employee[0].emp_firstname", equalTo("Joseph"));
		
		
		    /**
		     * Verifying response employee ID is equal to globally stored employee ID 
		     */
		 
		getUpdatedEmployeeResponse.then().assertThat().body("employee[0].employee_id", equalTo(employeeID));
	 
 }
	@Test
	public void fPATCHpartiallyUpdatedEmployee() {
		
		
		 RequestSpecification partiallyUpdatingEmployeeRequest = given().header("Content-Type","application/json").header("Authorization",token).body("{\n" + 
				"  \"employee_id\": \""+employeeID+"\",\n" + 
				"  \"emp_firstname\": \"PartiallyUpdate\"\n" + 
				"  \n" + 
				"}\n" + 
				"");
		 
		 Response partiallyUpdatingEmployeeResponse = partiallyUpdatingEmployeeRequest.when().patch("/updatePartialEmplyeesDetails.php");
		  
		 //partiallyUpdatingEmployeeResponse.prettyPrint();
		 
		 partiallyUpdatingEmployeeResponse.then().assertThat().statusCode(201);
		 
		 partiallyUpdatingEmployeeResponse.then().assertThat().body("Message", equalTo("Entry updated"));
		 
	} 
	
	 @Test
	public void gDELETEemployee() {
	    		
	    	RequestSpecification deleteEmployeeRequest = given().header("Content-Type","application/json").header("Authorization",token).queryParam("employee_id", employeeID);
	    	
	    	Response deleteEmployeeResponse = deleteEmployeeRequest.when().delete("/deleteEmployee.php");
	    	 
	    	deleteEmployeeResponse.prettyPrint();
	    	
	    	deleteEmployeeResponse.then().assertThat().body("message", equalTo("Entry deleted")); 
	    	
	    	 
	    }
	
	 


}
