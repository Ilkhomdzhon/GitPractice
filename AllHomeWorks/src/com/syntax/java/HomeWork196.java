package com.syntax.java;
import java.util.*;
public class HomeWork196 {

	public static void main(String[] args) {
		 
//		Find how many entries are inside the map
//		Remove all entires from the Map
//		Find the Map size again
		    
		     Map<String ,String> map=new LinkedHashMap<>();
		     
		      map.put("Street","Patrick ST");
		      map.put("Suite","265");
		      map.put("City","Vienna");
		      map.put("Zip","22180");
		      map.put("Country","United State");
		      
		      
		      System.out.println(map.size());
		        
		      String a=      map.remove(map);
		        
		      System.out.println(a);
		         
		       
	}
	            

}
