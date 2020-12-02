package com.syntax.Selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksFromEbay {

	public static String url = "https://www.amazon.com/";

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
			System.out.println( links.size());

		int count = 0;

		for (WebElement link : links) {

			String text = link.getText();

			if (!text.isEmpty()) {

				System.out.println(text);

				count++;
				
				
				 List <String > list = new ArrayList<>();
				 	 list.add(text);
				 	 
				 	//System.out.print("Array List ***"+list);
				 	
				 	
				 	 	for (String lis:list) {
				 	 		
				 	 		System.out.println(lis+" -- ");
				 	 		 
				 	 	}
				 	 	 

			}
		}
		 System.out.println("The total NET links in Amazon is :: "+count);
		 
		 
		
		 
		 	 	

	}

	
}
