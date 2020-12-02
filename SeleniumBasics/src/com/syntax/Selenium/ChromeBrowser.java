package com.syntax.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://amazon.com");

		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.amaezon.com/";

		if (actualURL.equals(expectedURL)) {
			String title = driver.getTitle();
			System.out.println(title);
		} else {
			System.out.println("URL does not match");
		}
		
			 Thread.sleep(2000);
			 driver.close();

	}

}
