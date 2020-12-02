package com.syntax.Inheritance;

public class PersonTest {
	
	public static void main(String[] args) {
		
		
		Employee1 emp = new Employee1("Joe","Smith",35,3500);
			
		 emp.empInfo();
		
		
		Student st= new Student("Adam","Smith",15,10);
			 
			 st.studentInfo();
		
		
		Retiree rt = new Retiree("Frank","Smith",15,"tour");
		
			 rt.retireeInfo();
		
		
				
				
				
				/*
				 *		Joe Smith 35 35000
						Adam Smith 15 10
						Frank Smith 15 tour
				 */
		
		
	}

}
