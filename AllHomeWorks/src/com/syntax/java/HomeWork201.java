package com.syntax.java;
import java.util.*;
public class HomeWork201 {

	public static void main(String[] args) {
     
		     Map<String,String>map=new HashMap<>();
		     
		     map.put("Street","Patrick ST");
		     map.put("Suite","265");
		     map.put("City","Vienna");
		     map.put("Zip","22180");
		     map.put("Country","United State");
		     
		     
		      

	      Collection<String> value= map.values();
		      for(String v:value) {

		      
		      System.out.println(v.toUpperCase());
		      }
		   }

		
		
	}


