package com.syntax.Interface;

public interface WebDriver {

	public void openBrowser();

	public void closeBrowser();

	public void maximizeWindow();

	public void findElement();

}

interface TakeScreenShot {

	public void takeScreenShot();

}

class ChromeDriver implements WebDriver ,TakeScreenShot{

	@Override
	public void openBrowser() {
		System.out.println("Open Chrome browser");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome browser");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize the window ");

	}

	@Override
	public void findElement() {
		System.out.println("Find web element in DOM");

	}

	@Override
	public void takeScreenShot() {
		System.out.println("If the test case fail take screen shot");
	}

}

class FirefoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Open Firefox browser");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Firefox browser");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximize window in Firefox");

	}

	@Override
	public void findElement() {
		System.out.println("Using ChroPath find element in dom");

	}

}
