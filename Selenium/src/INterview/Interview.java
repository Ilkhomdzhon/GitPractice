package INterview;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Interview {

	private static final String TimeUnits = null;
	WebDriver driver;

	public boolean isAlerPresent() {
		try {
			driver.switchTo().alert();
			return true;

		} catch (Exception e) {
			return false;

		}

	}

	@Test
	public void InterviewQuestions() throws IOException {

		System.out.println("------------------Alert--------------------");

		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

		String text = driver.switchTo().alert().getText();

		System.out.println(text);

		System.out.println("--------------switch frame-----------------");

		driver.switchTo().frame(0);
		driver.switchTo().frame("frame");
		driver.switchTo().frame(driver.findElement(By.xpath("")));

		System.out.println("---------------Window Handle------------------------");

		String pwindow = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		Iterator<String> allWindow = allWindows.iterator();

		String ParentWindow = allWindow.next();

		driver.switchTo().window(ParentWindow);

		String childWindow = allWindow.next();
		driver.switchTo().window(childWindow);

		driver.switchTo().defaultContent();

		System.out.println("--------------------Waits in Selenium--------------------------");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));

		
		System.out.println("-------------------MouseHover---------------------------");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		
		 System.out.println("------------------ Select data in dropdowns ----------------------");
		 
		 Select select = new Select(driver.findElement(By.xpath("")));
		 
		  select.selectByIndex(0);
		  select.selectByValue("Ilhom");
		  select.selectByVisibleText("Text");
		  List<WebElement> option = select.getOptions();
		  
		   System.out.println("----------------Drap and Drop ------------------");
		   
		 Actions actions = new Actions(driver);
		 
		 actions.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath("")));
		 
		 
		System.out.println("--------Screeen Shot ---------------------");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File srcFile = null;
		FileUtils.copyFile(srcFile, new File("Desktop:\\test\\Screenshot\\login "+".png"));
		
		
		driver.navigate().back();
		driver.navigate().forward();
		
		String url = driver.getCurrentUrl();
		driver.getTitle();
		
		
	}

}
