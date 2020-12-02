package com.syntax.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		String face = "https://wwww.facebook.com";

		driver.manage().window().maximize();
		driver.manage().window().getSize();

		driver.get(face);
		driver.navigate().refresh();
		Thread.sleep(3000);
		String fa = driver.getTitle();
		System.out.println(fa);

		driver.navigate().to("https://www.mail.ru");
		driver.navigate().to(face);

		String mail = driver.getTitle();
		System.out.println(mail);
		
		Thread.sleep(3000);

			 driver.close();
		
		
		

	}

}
