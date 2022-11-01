package learning.BrowserConfigurations.IEBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintIELogsInASeparateLogFile {

	public static void main(String[] args) {
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGLEVEL_PROPERTY, "INFO");
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGFILE_PROPERTY,
				System.getProperty("user.dir") + "\\Logs\\IELogs.log");
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.tutorialsninja.com/demo/");

		driver.findElement(By.name("search")).sendKeys("Samsung");
		driver.findElement(By.cssSelector("i[class$='fa-search']")).click();

	}

}
