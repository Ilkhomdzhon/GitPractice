package com.syntax.crossbrowsingtest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class DynamicDropDown {
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.amazon.com");
		
		driver.manage().window().maximize();
		
		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		
//		driver.findElement(By.xpath("//a[@value='JAI']")).click();
//		
//		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
//		
		List<WebElement> link= driver.findElements(By.tagName("a"));
		
		
				 	System.out.println(link.size());
		
		
		 
		for (int i=0;i<link.size();i++) {
			
			
			WebElement elements=link.get(i);
			
		String url=elements.getAttribute("href");
		
		URL link1 = new URL(url);
		
		HttpURLConnection httpConn=(HttpURLConnection)link1.openConnection();
		  
		 Thread.sleep(2000);
		 
		 httpConn.connect();
		 
		 int  respondCode=httpConn.getResponseCode();
		 
		 if (respondCode>=400) {
			 
			 System.out.println(url+" is BROKEN");
		 }else {
			 System.out.println(url+ " is VALID");
		 }
		  	
		
		
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}

}
