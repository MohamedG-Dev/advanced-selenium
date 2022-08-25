package learning.WebDriverEventListeners;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// EventFiringWebDriver(driver); --> Depracated Version
public class DemoClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		EventFiringWebDriver eventsDriver = new EventFiringWebDriver(driver); 
		EventsHandlerDemo listener = new EventsHandlerDemo();
		eventsDriver.register(listener);
		eventsDriver.get("http://www.omayo.blogspot.com"); //Event will be fired
		eventsDriver.navigate().to("http://www.omayo.blogspot.com");//Event will be fired
		
		WebElement searchBoxField = eventsDriver.findElement(By.name("q"));//Event will be fired
		Thread.sleep(3000);
		searchBoxField.sendKeys("Facebook.com");//Event will be fired
		searchBoxField.clear();//Event will be fired
		
		eventsDriver.findElement(By.id("alert1")).click();//Event will be fired
		Alert alert=eventsDriver.switchTo().alert();
		alert.accept();//Event will be fired
		eventsDriver.switchTo().defaultContent();
		
		eventsDriver.findElement(By.id("alert1")).click(); //Event will be fired
		Alert alert2 = eventsDriver.switchTo().alert();
		alert2.dismiss(); //Event will be fired
		eventsDriver.switchTo().defaultContent();
		
		eventsDriver.navigate().refresh(); //Event will be fired
		
		JavascriptExecutor jse=(JavascriptExecutor) eventsDriver;
		jse.executeScript("history.go(0)"); //Event will be fired
		
		eventsDriver.findElement(By.id("pah")).getText(); //Event will be fired
		
		eventsDriver.findElement(By.linkText("Open a popup window")).click(); //Event will be fired
		Set<String> windows = eventsDriver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String mainWindow = itr.next();
		String childWindow = itr.next();
		eventsDriver.switchTo().window(childWindow); //Event will be fired
		eventsDriver.close();
		eventsDriver.switchTo().window(mainWindow); //Event will be fired
		
		File file = ((TakesScreenshot)eventsDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./imageFiles/screenshot3.jpg"));
		
		eventsDriver.findElement(By.linkText("compendiumdev")).click();
		eventsDriver.navigate().back();
		eventsDriver.navigate().forward();
		
		try {
			eventsDriver.findElement(By.id("908asd78"));
		}catch(Exception e) {
			System.out.println("Exception Occured");
		}
		
		eventsDriver.unregister(listener);
		
		eventsDriver.quit();
	}

}
