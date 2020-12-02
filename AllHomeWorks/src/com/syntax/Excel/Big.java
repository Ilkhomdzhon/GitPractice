package com.syntax.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Big {

	public static void main(String[] args) {

		read("testdata/Test.xls");
		
		System.out.println("What ");

	}

	private static FileInputStream fis;

	private static Properties prop;

	private static void read(String filePath) {

		try {
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);

		} catch (FileNotFoundException fn) {
			//fn.printStackTrace();
			String message=fn.getMessage();
			System.out.println(message);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			try {
				if (fis!=null) {
				fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
