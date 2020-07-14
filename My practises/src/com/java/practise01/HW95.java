package com.java.practise01;

public class HW95 {

	public static void main(String[] args) {
//	Create a String given="Hello Syntax friends". 
//	Using String methods from given String create new String "Welcome Syntax family"
//		Expected Output:
//			Welcome Syntax family
//		
		String given= "Hello Syntax friends";
		String give;
		
		
		given=given.replaceAll("Hello", "Welcome");
		
		//System.out.println(given);
		give=given.replaceAll("friends", "family");
		System.out.println(give);
	}

}
