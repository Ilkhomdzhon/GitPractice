package com.syntax.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {

		String filePath = "configs/Examples.properties";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();

		prop.load(fis);

		Set<Entry<Object, Object>> set = prop.entrySet();

		
		System.out.println("==============For Loop ==================");
			 
		for (Entry<Object, Object> loop : set) {

			//System.out.println("Keys : " + loop.getKey() + " " + " Values : " + loop.getValue());
		}
		
			 	 System.out.println("==============Iterator ==================");
			Iterator<Entry<Object, Object>>iter= set.iterator();
				 while (iter.hasNext()) {
					 Entry<Object , Object>a=iter.next();
					  
					 	 System.out.println("Keys : "+a.getKey()+" "+" Values :"+a.getValue());
					 	 
					 
					 
					 
				 }

	}

}
