//package com.syntax.crossbrowsingtest;
//
//import static org.testng.Assert.assertEquals;
//
//import java.net.MalformedURLException;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import bsh.Capabilities;
//
//public class CrossBrowsingTesting {
//
//	public static final String USERNAME = "ilhomahmadov1";
//	public static final String AUTOMATE_KEY = "Qqrxzg3UMcBXnpxLLxwZ";
//	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
//
//	@Test
//
//	public void openSTM() throws MalformedURLException {
//
//		DesiredCapabilities capability = new DesiredCapabilities();
//		capability.setPlatform(Platform.MAC);
//		capability.setBrowserName("chrome");
//		capability.setVersion("85");
//		Capabilities.stack
//
//		URL browserstackURL = new URL(URL);
//
//		WebDriver driver = new RemoteWebDrive(browserstackURL, capability);
//		driver.get("http://www.amazon.com");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		String actualURL = driver.getCurrentUrl();
//		String expectedURL = ("http://amazon.com");
//		Assert.assertEquals(actualURL, expectedURL, "Actual and Expected are not same ");
//		driver.quit();
//
//	}
//	
//	
//		
//	}
//
//}
