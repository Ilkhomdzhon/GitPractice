package com.syntax.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class FileHandlingPractice {

	public static void main(String[] args) throws IOException {

		String filePath = "configs/Examples.properties";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();

		prop.load(fis);

//		Set<Entry<Object, Object>> set = prop.entrySet();
//
//		for (Entry<Object, Object> obj : set) {
//
//			System.out.println("Keys " + obj.getKey() + " " + " Value :" + obj.getValue());
//			
//			
			FileOutputStream fos = new FileOutputStream(filePath);
			
				 prop.setProperty("Son", "Mahmud");
				 prop.setProperty("Son1", "Ibrohim");
				 prop.setProperty("Son2", "Ahmad");
				 
				 	
				 prop.store(fos, "All kids");
				 
				 
				Set<Entry<Object,Object>>set =prop.entrySet();
				
					 for (Entry<Object, Object> entry : set) {
						 
						 	System.out.println("Keys :"+entry.getKey()+" Values : "+entry.getValue());
						
					}
				
				 	 
				
					
			

		}

	}


