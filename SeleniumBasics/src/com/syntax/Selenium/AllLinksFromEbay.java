package com.syntax.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksFromEbay {

	public static String url = "https://www.amazon.com/";

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		driver = new ChromeDriver();

		driver.get(url);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		int size = links.size();

		System.out.println(size);

		int count = 0;

		for (WebElement link : links) {

			String text = link.getText();

			if (!text.isEmpty()) {

				// System.out.println(text);
				count++;

				List<String> list = new ArrayList<>();

				list.add(text);

				Iterator<String> iterator = list.iterator();

				while (iterator.hasNext()) {
					String allLinks = iterator.next();

					// System.out.println("All links from ArrayList "+ allLinks+" ");

					String filePath = System.getProperty("user.dir") + "/TestOutput/Test.xlsx";

					FileInputStream fis = new FileInputStream(filePath);

					Workbook workbook = new XSSFWorkbook();

					Sheet sheet = workbook.getSheet("Demo");

					FileOutputStream fos = new FileOutputStream(filePath);

					workbook.write(fos);

				}

			}

		}

		System.out.println(count);

	}

}
