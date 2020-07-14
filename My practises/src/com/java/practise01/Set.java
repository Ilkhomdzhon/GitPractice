package com.java.practise01;
import java.util.*;
public class Set {
	
	public static void main(String[] args) {
	    
//		nstructions from your teacher:
//			Create a Map that will preserve an order of entry objects
//			Add below pair to it . 
//			"Street" = "Patrick ST"
//			"Suite" = "265"
//			"City" = "Vienna"
//			"Zip" = "22180"
//			"Country" = "United State"
//
//			Print all values using iterator
//
//			Expected output:
//			Patrick ST
//			265
//			Vienna
//			22180
//			United State
		
		Map<String, String> str=new LinkedHashMap<>();
			    
     str.put("Street","Patrick ST");
     str.put("Suite", "265");
     str.put("City", "Vienna");
     str.put("Zip", "22180");
     str.put("Country", "United States");
     
     
     
      System.out.println(str.values());
			     
			     
			    
			    
			
		
		
		
		
	}

}
