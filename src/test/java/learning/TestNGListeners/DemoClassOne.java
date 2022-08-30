package learning.TestNGListeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(MyEventsHandler.class)
public class DemoClassOne extends TestBase {
	@Test
	public void testOne() {
		driver.get("http://www.omayo.blogspot.com");
		String pageTitle = driver.getTitle();
		System.out.println("Title of the application is: " + pageTitle);
		driver.close();
	}
}
