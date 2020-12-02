package com.syntax.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQALogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();

		driver.findElement(By.id("firstName")).sendKeys("Ilhom");
		driver.findElement(By.id("lastName")).sendKeys("Ishonkulov");
		driver.findElement(By.className("mr-sm-2 form-control")).sendKeys("ilhom_372@list.ru");
		

	}

}
