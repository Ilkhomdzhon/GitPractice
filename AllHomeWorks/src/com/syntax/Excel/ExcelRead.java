package com.syntax.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {

		String filePath = "/Users/ilkhomdzhonishonkulov/Desktop/Test.xlsx";

		FileInputStream fis = new FileInputStream(filePath);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("TestData");

		String bach = sheet.getRow(3).getCell(5).toString();

		System.out.println(bach);

		String bibo = sheet.getRow(4).getCell(5).toString();
		System.out.println(bibo);

		String mishka = sheet.getRow(5).getCell(5).toString();
		System.out.println(mishka);

	}

}
