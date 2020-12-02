package com.syntax.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		String url = driver.getCurrentUrl();
		System.out.println(url);

		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.id("email")).sendKeys("ilhom_372@list.ru");
		driver.findElement(By.id("pass")).sendKeys("I313e51765372i");
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(6000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		//driver.navigate().refresh();
	 }

}
