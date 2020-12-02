package com.syntax.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMap {

	public static void main(String[] args) throws IOException {

		String filePath = "/Users/ilkhomdzhonishonkulov/Desktop/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("TestData");

		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();

		List<Map<String, String>> list = new ArrayList<>();

		for (int r = 1; r < rows; r++) {

			Map<String, String> map = new LinkedHashMap<>();

			for (int c = 0; c < cols; c++) {

				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();

				map.put(key, value);

			}

			list.add(map);
			
				 System.out.println(list);  

		}

	}

}
