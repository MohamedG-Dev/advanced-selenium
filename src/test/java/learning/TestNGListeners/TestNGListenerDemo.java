package learning.TestNGListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;


//we can comment or delete the @Listeners annotation when we don't to use this annotation at class level.
// we can use this annotation in suite level to execute multipe test classes with test methods to execute.
// refer "testng.xml" file for the configuration of @Listeners annotation.
// @Listeners(MyEventsHandler.class) // connection between the TestNGListenerDemo class and MyEventsHandler class
public class TestNGListenerDemo extends TestBase{
	
	@Test(priority = 1)
	public void testOmayoTitle() {
		driver.get("http://www.omayo.blogspot.com");
		String pageTitle = driver.getTitle();
		System.out.println("Title of the application is: " + pageTitle);
		driver.close();

	}

	@Test(priority = 2)
	public void testOmayoFail() {
		driver.get("http://www.omayo.blogspot.com");
		driver.findElement(By.id("12345"));
		driver.close();
	}

	@Test(priority = 3)
	public void testOmayoSkip() {
		driver.get("http://www.omayo.blogspot.com");
		String pageTitle = driver.getTitle();
		if (driver.getTitle().equals(pageTitle)) {
			throw new SkipException("test method is skipped");
		}
		
	}
}
