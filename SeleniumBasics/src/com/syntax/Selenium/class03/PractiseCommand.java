package com.syntax.Selenium.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseCommand {

	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";

	public static WebDriver driver;
	
	public static String userName ="Tester";
	
	public static String passWord= "test";
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		WebElement userNam = driver.findElement(By.xpath("//input[contains(@id,'username')]"));

		userNam.sendKeys(userName);

		WebElement passWor = driver.findElement(By.xpath("//input[contains(@id,'password')]"));

		passWor.sendKeys(passWord);

		WebElement logIn = driver.findElement(By.xpath("//input[contains(@id,'button')]"));

		logIn.click();

		WebElement welcome = driver.findElement(By.xpath("//div[@class='login_info']"));

		String actualText = welcome.getText();
		System.out.println(actualText);

		String expectedText = "Welcome, Tester! | Logout";

//		if (actualText.equals(expectedText)) {
//			System.out.println("Test case passed");
//		} else {
//			System.out.println("Test case failed ! Check again");
//		}
		
			 boolean logoIsDisplayed = driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
		
			 if (logoIsDisplayed) {
				 System.out.println("Test Case is passed!!!! ");
			 }else {
				 System.out.println("Check your script ");
			 }
			 	 
			 	 
		
			 Thread.sleep(3000);
			 driver.quit();
	}

}
