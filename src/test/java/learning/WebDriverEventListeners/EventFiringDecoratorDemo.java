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
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EventFiringDecoratorDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverListener listener = new MyListener();
		WebDriver eventsDriver = new EventFiringDecorator(listener).decorate(driver);
		eventsDriver.get("http://www.omayo.blogspot.com");
		eventsDriver.navigate().to("http://www.omayo.blogspot.com");
		
		WebElement searchBoxField = eventsDriver.findElement(By.name("q"));
		Thread.sleep(3000);
		searchBoxField.sendKeys("Facebook.com");
		
		searchBoxField.clear();
		
		eventsDriver.findElement(By.id("alert1")).click();
		Alert alert = eventsDriver.switchTo().alert();
		alert.accept();
		eventsDriver.switchTo().defaultContent();
		
		eventsDriver.findElement(By.id("alert1")).click();
		Alert alert2 = eventsDriver.switchTo().alert();
		alert2.dismiss();
		eventsDriver.switchTo().defaultContent();
		
		eventsDriver.navigate().refresh();
		
		JavascriptExecutor jse = (JavascriptExecutor) eventsDriver;
		jse.executeScript("history.go(0)");
		
		eventsDriver.findElement(By.id("pah")).getText();
		
		eventsDriver.findElement(By.linkText("Open a popup window")).click();
		Set<String> windows=eventsDriver.getWindowHandles();
		Iterator<String> itr= windows.iterator();
		String mainWindow = itr.next();
		String childWindow = itr.next();
		eventsDriver.switchTo().window(childWindow);
		eventsDriver.close();
		eventsDriver.switchTo().window(mainWindow);
		
		File file = ((TakesScreenshot)eventsDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./imageFiles/screenshot4.jpg"));
		
		eventsDriver.findElement(By.linkText("compendiumdev")).click();
		eventsDriver.navigate().back();
		eventsDriver.navigate().forward();
		
		try {
			eventsDriver.findElement(By.id("908asd78"));
		}catch(Exception e) {
			System.out.println("Exception Occured");
		}
		
		eventsDriver.quit();

	}

}
