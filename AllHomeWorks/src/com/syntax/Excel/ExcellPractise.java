package com.syntax.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellPractise {

	public static void main(String[] args) throws IOException {
		
		
		String filePath = "/Users/ilkhomdzhonishonkulov/Desktop/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		 Workbook workbook=	new XSSFWorkbook(fis);
		 
		 	 
		  	Sheet sheet=workbook.getSheet("TestData");
		  	
		  		 String rowInfo=sheet.getRow(4).getCell(2).toString();
		  		 System.out.println(rowInfo);
		 	
		 	 
		
		
		

	}

}
