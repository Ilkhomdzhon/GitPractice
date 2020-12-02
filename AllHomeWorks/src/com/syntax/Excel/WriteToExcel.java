package com.syntax.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException {
		
		
		String filePath=System.getProperty("user.dir")+"/testdata/Test.xlsx";
		
			 FileInputStream fis=new FileInputStream(filePath);
			 
			Workbook workbook =new  XSSFWorkbook(fis);
			
				Sheet sheet= workbook.getSheet("TestData");
					
				 sheet.getRow(0).createCell(7).setCellValue("Dilshod");
				 
				 	FileOutputStream fos = new FileOutputStream(filePath);
				 	
				 		 workbook.write(fos);
				 	
				 
			 
		
		
	}
    
}
