package com.syntax.java;

import com.syntax.Inheritance.Employee;


public class WaterFall extends Employee{

	public static void main(String[] args) {
		

		WaterFall wt = new WaterFall();
		wt.employeeID=24243;
		wt.salary=3423223;
	
		Employee.companyName="SAP FieldGlass";
		
		wt.work();
		
	}

}
