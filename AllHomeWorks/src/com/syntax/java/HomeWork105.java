package com.syntax.java;

public class HomeWork105 {
	

//		1. Create method name it as newLine
//		2. Add print statement inside method body as "newLine method implementation"
//		3. Call newLine method three times
//
//		Expected Output:
//		newLine method implementation
//		newLine method implementation
//		newLine method implementation
	
	void newLine() {
		System.out.println("newLine method implementation");
		
	}
	public static void main(String[] args) {
		HomeWork105 obj=new  HomeWork105();
		for (int i=0; i<3;i++) {
			obj.newLine();
			
		}
		
		
	}

}
