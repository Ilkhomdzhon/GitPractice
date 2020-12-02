package com.syntax.Inheritance;

public class Employee{

	 public static String companyName;
	 public int employeeID;
	public double salary;

	public void getPaid() {
		System.out.println("All employees get their salary " + salary);

	}

	public void work() {
		System.out.println("All employees work at " + companyName);
	}
}

class ScrumTeam extends Employee {

	String ceremonies;

	void attendMeeting() {

		System.out.println("All Scrum Team attend " + ceremonies);
	}

}

class ProductOwner extends ScrumTeam {

	void prioritizeBackLog() {

		System.out.println("Product Owner prioritize backlog");
	}

}

class ScrumMaster extends ScrumTeam {

	void navigateTeam() {
		System.out.println("ScrumMaster navigates team to right track");
	}

}

class Developer extends ScrumTeam{

	
	void code() {
		System.out.println("Developers code and develope the application");
	}
	
}

class Tester extends ScrumTeam{

	void test() {
		System.out.println("Tester test application to make it bug free");
	}
	
}

class BusinessAnalyst extends ScrumTeam{
	
	void communicate() {
		System.out.println("BA communicates between client and Dev Team");
	}
}
