package com.syntax.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadAll {

	public static void main(String[] args) throws IOException {

		String filePath = "/Users/ilkhomdzhonishonkulov/Desktop/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("TestData");

		int row = sheet.getPhysicalNumberOfRows();

		int col = sheet.getRow(0).getLastCellNum();

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {

				String allValues = sheet.getRow(r).getCell(c).toString();

				System.out.print(allValues+"   ");

			}
			System.out.println();
		}
		

	}

}
