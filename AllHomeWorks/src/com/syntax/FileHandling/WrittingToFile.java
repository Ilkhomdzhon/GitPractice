package com.syntax.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class WrittingToFile {

	public static void main(String[] args) throws IOException {

		String filePath = "configs/Examples.properties";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();

		prop.load(fis);

		FileOutputStream fos = new FileOutputStream(filePath);

		prop.setProperty("country", "Tajikistan");
		prop.setProperty("computer", "macbook");
		prop.setProperty("Loop", "Advanced Loop");
		

		prop.store(fos, "Adding country");

		Set<Entry<Object, Object>> set = prop.entrySet();
 
		for (Entry<Object, Object> loop : set) {
			
				 System.out.println(loop.getKey()+" "+loop.getValue());

		}

	}

}
