package com.syntax.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FromExcelToMap {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "/testdata/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("TestData");

		int row = sheet.getPhysicalNumberOfRows();

		int col = sheet.getRow(0).getLastCellNum();

		List<Map<String, String>> list = new ArrayList<>();

		for (int r = 1; r < row; r++) {

			Map<String, String> map = new LinkedHashMap<>();

			for (int c = 0; c < col; c++) {

					String key= sheet.getRow(0).getCell(c).toString();
					String values= sheet.getRow(r).getCell(c).toString();
					map.put(key, values);
					
					 
			}
				 list.add(map);
				 
				// System.out.println(map+" ");
				 
				 	Set<Entry<String ,String >>set = map.entrySet();
				 	
				 
				 		    for(Entry<String ,String >loop:set) {
				 		    	System.out.print(loop+" ");
				 		    }
				 		    
				 		     System.out.println();
		}
				
						

	}
}
