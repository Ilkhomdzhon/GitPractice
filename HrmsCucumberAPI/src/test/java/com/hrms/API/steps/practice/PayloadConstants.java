package com.hrms.API.steps.practice;

public class PayloadConstants {
	
	
	/**
	 * Create employee body 
	 * @return 
	 * @return 
	 */
	
	
	 public static String createEmployeeBody() {
		 
		 
		 String createEmployeeBody = "{\n" + 
		 		"  \"emp_firstname\": \"Joseph\",\n" + 
		 		"  \"emp_lastname\": \"Abraham\",\n" + 
		 		"  \"emp_middle_name\": \"Ahmad\",\n" + 
		 		"  \"emp_gender\": \"M\",\n" + 
		 		"  \"emp_birthday\": \"2012-07-08\",\n" + 
		 		"  \"emp_status\": \"Worker\",\n" + 
		 		"  \"emp_job_title\": \"Developer\"\n" + 
		 		"}";
		 return createEmployeeBody;
		 
	 }
	 
		  
		 /**
		  *  Created method to return payload - to reduce messy code 
		  *  @return
		  */
		 
		 
		 String updateBody = "{\n" + 
				"            \"employee_id\": \"" + HardcodedExamples.employeeID + " \",\n" + 
				"            \"emp_firstname\": \"Joseph\",\n" + 
				"            \"emp_middle_name\": \"Ahmad\",\n" + 
				"            \"emp_lastname\": \"Ilhomi\",\n" + 
				"            \"emp_birthday\": \"2012-07-08\",\n" + 
				"            \"emp_gender\": \"M\",\n" + 
				"            \"emp_job_title\": \"Developer\",\n" + 
				"            \"emp_status\": \"Worker\"\n" + 
				"        \n" + 
				"    \n" + 
				"}";
		 
//		
		 return updateBody;
		 
	 }
}
