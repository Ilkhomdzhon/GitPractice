package com.syntax.AllTasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee {

	private String fullName;
	private int ssn;
	private double salary;

	public Employee(String fullName, int ssn, double salary) {
		this.fullName = fullName;
		this.ssn = ssn;
		this.salary = salary;

	}

	public String getName() {
		return fullName;

	}

	public int getSSN() {
		return ssn;

	}

	public double getSalary() {
		return salary;

	}

	public void display() {

		System.out.print(getName()+" ");

		System.out.print(getSSN()+" ");

		System.out.print(getSalary()+" ");
	}

}

public class Task15 {
	public static void main(String[] args) {
		
		Employee emp = new Employee("John",343423,8000.34);
		Employee emp1 = new Employee("Ilhom",343423,9000.34);
		Employee emp2 = new Employee("Mahmud",343423,10000.34);
		
		Set<Employee>set = new HashSet<>();
		
			 set.add(emp);
			 set.add(emp1);
			 set.add(emp2);
			 
			Iterator<Employee>it= set.iterator();
				 
				 while (it.hasNext()) {
					Employee a= it.next();
					a.display();
				 }
			
	}

}
