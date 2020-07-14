package com.java.practise01;

public class Main2 {
	
	
	String firsValue, secondValue;
	  
	 public static String mixString(String s1 ,String s2){
		  String str ="";
		  for(int i=0; i<s1.length(); i++) {
			  //str=s1+s2;//12345abcde
			  str+=s1.charAt(i)+s2.charAt(i); 
			  //str=s1.substring(i,i++)+s2.substring(i, i++);
		  }
		  return str;
	           
	              
	  }

		//test case below (dont change):
		public static void main(String[] args){
		  Main2 obj=new Main2();
		  
		  String firstValue = mixString("12345","abcde"); 
			System.out.println(firstValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
		}
	}


