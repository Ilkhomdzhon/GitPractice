package com.java.practise01;

public class Main1 {
	
	static String countryName, continent;
	  
	  public static void display(String str1 ,String str2){
	    System.out.println(countryName+" located on " +continent);
	  }
	 
	  public static void main(String[] args){
	    
	       Main1 con=new Main1();
	       
	       con.countryName="Morocco";
	       con.continent="Africa";
	       
	       con.display(countryName, continent);
	       
	  }
	  
	}


