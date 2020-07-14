package com.syntax.java;
import java.util.*;
import java.util.Map.Entry;
public class HomeWork199 {

	public static void main(String[] args) {
		
		   Map <String ,Integer> map=new HashMap<>();
		   
		   map.put("mango", 10); 
		   map.put("apple", 30); 
		   map.put("orange",20); 
		   map.put("mango", 40); 
		   map.put("mango", 40);     

		    Iterator<Entry<String,Integer>> it=map.entrySet().iterator();
		    
		     while (it.hasNext()){
		       Entry<String,Integer>entry=it.next();
		       
		     
		    System.out.println("Key = "+entry.getKey()+" and value = "+entry.getValue());
		  }
		  
		
	}

}
