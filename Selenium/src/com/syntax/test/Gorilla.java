package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.CommonMethods;

public class Gorilla extends CommonMethods {

	public static void main(String[] args) {

		setUp();
		

//		WebDriver driver = new ChromeDriver();

		String url = "https://m.fullhdfilmizlesene.com/";

		driver.get(url);
		
		driver.manage().window().fullscreen();
		driver.findElement(By.xpath("/html/body/div[1]/div[8]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[54]/a/img[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[1]/div[10]/form/div[1]/div/input")).sendKeys("Hello");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[1]/div[10]/form/div[2]/div/input")).sendKeys("ilhom@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[1]/div[10]/form/div[3]/textarea")).sendKeys("Pek iyi filim degil");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div[1]/div[10]/form/a[1]")).click();
		
		
	}

}
