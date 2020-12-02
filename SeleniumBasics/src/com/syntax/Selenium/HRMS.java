package com.syntax.Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMS {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();

		prop.load(fis);

		String browser = prop.getProperty("browser");

		switch (browser) {

		case "chrome":

			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");

			driver = new FirefoxDriver();
			break;

		}
		      
		    	 driver.manage().window().maximize();
			 driver.get(prop.getProperty("url"));
			 
			 
			 driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
			 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hum@nhrm123");
			 
			 driver.findElement(By.xpath("//input[@type='submit']")).click();
			 
			 	 String expected = "Welcome Admin";
			 	String actual = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
			 	System.out.println("Actual text in dashboar : "+actual);
			 	
			 	if (actual.equals(expected)) {
			 		System.out.println("Validation Ok ");
			 	}else {
			 		System.out.println("Check again");
			 	}
			 	
			 	Thread.sleep(2000);
			 	driver.quit();
	}

}
//if (pr.equalsIgnoreCase("Mac OS X")){ 
// this method will give you information about operating system.
