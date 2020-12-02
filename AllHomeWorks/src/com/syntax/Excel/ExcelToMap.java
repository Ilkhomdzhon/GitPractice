package com.syntax.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToMap {

	public static void main(String[] args) throws FileNotFoundException {

		String filePath = System.getProperty("user.dir") + "/testdata/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.getSheet("TestData");

		int row = sheet.getPhysicalNumberOfRows();

		Map<String, String> map = new LinkedHashMap();

		for (int r = 1; r <= row; r++) {

			String key = sheet.getRow(r).getCell(0).getStringCellValue();
			String value = sheet.getRow(r).getCell(1).getStringCellValue();

			map.put(key, value);

		}
			 	Set<Entry<String ,String >>set= map.entrySet();
			 	
			 		 for (Entry<String, String> entry : set) {
			 			 	 
			 			 	String a = entry.getKey();
			 			 	String b = entry.getValue();
			 			 	
			 			 	System.out.println(a+" : "+b);
			 			 	 
						
					}

	}

}
