package com.syntax.java;

import java.util.*;
import java.util.Map.Entry;

public class Hm197 {
	
	public static void main(String[] args) {
		
		 
	     Map <String , String> ma=new HashMap<>();
	     
	      ma.put("Street","Patrick ST");
	      ma.put("Suite","265");
	      ma.put("City","Vienna");
	      ma.put("Zip","22180");
	      ma.put("Country","United State");
//	      
	            Set<Entry<String, String>> key=ma.entrySet();
		      for (Entry<String, String > k:key){
		        System.out.println(k);
		      }
//	      Set<String> keys=ma.keySet();
//	      for(String k:keys) {
//	    	  System.out.println(k);
	      }
	   }
	