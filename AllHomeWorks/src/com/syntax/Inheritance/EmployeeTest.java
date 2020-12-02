package com.syntax.Inheritance;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.employeeID = 372;
		emp.salary = 85000;
		Employee.companyName = "SAP FieldGlass";

		emp.getPaid();
		emp.work();

		ScrumTeam sct = new ScrumTeam();

		sct.ceremonies = "Spring Planning";
		sct.employeeID = 373;
		sct.salary = 90000;
		sct.attendMeeting();
		sct.getPaid();

		ProductOwner po = new ProductOwner();

		po.ceremonies = "Sprint BackLog";
		po.employeeID = 374;

		po.salary = 95000;
		po.attendMeeting();
		po.work();
		po.prioritizeBackLog();

		BusinessAnalyst ba = new BusinessAnalyst();

		ba.ceremonies = "Parking Lot";
		ba.employeeID = 374;
		ba.salary = 75000;
		ba.attendMeeting();
		ba.communicate();
		ba.work();

	}

}
