package com.java.practise01;

public class StringManipulation {

	public static void main(String[] args) {
		
		String school ="Syntax"; 
		
		String str =new String ("HELLO");
		
		String str1 = "Here can be anything  76712&^%$";
		
		
		
		String newString=str1.replaceAll("Here", "There");
		System.out.println(newString);
		
		
		 /// how many characters String has (count)
		
	System.out.println(school.length());
	
	 int size=str.length();
	 System.out.println(size);
				
	 System.out.println(school.toUpperCase());
	 
	 str=str.toLowerCase();
	 System.out.println(str);
		
//		String newString=str+" "+school;
//		System.out.println(newString);
//		
		String day ="Thursday";
		String date = "19";
		
		String Dday=day.concat(date);
		System.out.println(Dday+" ");
		
		
		String car = "I have a Honda Civic SE";
		car =car.replaceAll("Honda", "Toyota");
		System.out.println(car);
		
		String function="I m practising split function";
		 String[] newStrong=function.split("i");
		 
		 for (String arr:newStrong) {
			 System.out.println(arr);
		 }
	}

}
