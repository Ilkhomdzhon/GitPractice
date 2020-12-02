package com.syntax.Interface;

public class EncapDemo {
	/*
	 * Create Class EncapsulationDemo that will have 2 variables empName and empAge;
	 * Create the getter/setter methods for each variable.
	 * 
	 * In Main Class and main method
	 * 
	 * Using setter methods assign the values as "Mario" and "32" Using getter
	 * methods print the values as below outputs.
	 * 
	 * Expected Output: Employee Name: Mario Employee Age: 32
	 */

	private String empName;
	private int empAge;

	public void setName(String empName) {
		this.empName = empName;

	}

	public String getName() {
		return empName;

	}
	
	public void setAge(int empAge) {
		this.empAge=empAge;
		
	}
	
	public int getAge() {
		return empAge;
	}

}
