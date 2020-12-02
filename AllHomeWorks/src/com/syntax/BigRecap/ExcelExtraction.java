package com.syntax.BigRecap;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExtraction {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "/testdata/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("TestData");

		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getLastCellNum();

		List<Map<String, String>> xlData = new ArrayList<>();

		for (int r = 1; r < row; r++) {

			Map<String, String> map = new LinkedHashMap<>();

			for (int c = 0; c < col; c++) {

				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();

				map.put(key, value);

			}

			xlData.add(map);

		}
		System.out.println(xlData);

		for (Map<String, String> xl : xlData) {

			Set<Entry<String, String>> set = xl.entrySet();

			Iterator<Entry<String, String>> it = set.iterator();

			while (it.hasNext()) {

				Entry<String, String> keys = it.next();

				System.out.println("Keys : " + keys.getKey());
				System.out.println("Value : " + keys.getValue());
			}

		}

	}

}
