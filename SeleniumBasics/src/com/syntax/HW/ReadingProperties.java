package com.syntax.HW;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingProperties {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

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
			
			List<WebElement> all=driver.findElements(By.tagName("a"));
			
				 //System.out.println("All Links from ebay "+all);
				 
				 
				 for (WebElement webElement : all) {
					 
					 System.out.println(webElement);
					
				}
			
	}

}
