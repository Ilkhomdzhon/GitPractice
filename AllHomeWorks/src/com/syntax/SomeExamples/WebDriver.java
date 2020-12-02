package com.syntax.SomeExamples;

public class WebDriver {

	public void openBrowser() {

		System.out.println("Opening  the browser");
	}
}

class Chrome extends WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Opening Chrome driver");
	}
}

class Firefox extends WebDriver {

	public void openBrowser() {
		System.out.println("Opening Firefox driver");
	}
}