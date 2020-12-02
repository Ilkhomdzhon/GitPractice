package com.syntax.Selenium.class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands {

	public static String url = "http://uitestpractice.com/Students/Form";
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		driver = new ChromeDriver();

		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("ilhom");;
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Mahmud");
		
			 List<WebElement> hobby = driver.findElements(By.xpath("//input[@type='checkbox']"));
			 
			 	 for (WebElement hob:hobby) {
			 		 
			 		 	 String values= hob.getAttribute("value");
			 		 	 System.out.println(values);
			 		 	 
			 		 	 if (values.equalsIgnoreCase("cricket")) {
			 		 		hob.click();
			 		 		
			 		 	 }else if (values.equals("read")) {
			 		 		 hob.click();
			 		 	 }else if (values.equals("dance")) {
			 		 		 hob.click();
			 		 		
			 		 	 }
			 		 	 
		
			 	 }
	}
	
		
		
		

	}


