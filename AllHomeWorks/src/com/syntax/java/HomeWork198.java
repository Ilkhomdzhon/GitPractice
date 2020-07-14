package com.syntax.java;

import java.util.*;
import java.util.Map.Entry;

public class HomeWork198 {
	 
	

	public static void main(String[] args){
	    
	    Map <String,String> map=new TreeMap<>();
	    
	     map.put("1 item" ,"apple");
	     map.put("2 item" ,"banana");
	     map.put("3 item" ,"pear");
	     map.put("4 item" ,"tomato");
	     map.put("5 item" ,"mango");
	     map.put("6 item ","kiwi");
	     
	     Set<Entry<String, String>> entries=map.entrySet();
	     
	     for(Entry e: entries) {
	    	 System.out.println("Key is "+e.getKey()+" and values is "+e.getValue());
	     }
	    
		
			
	}

	}
	  
	
	


