package learning.downloadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoPreferencesDownloadFirefoxBrowser {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.in/p/page7.html");
		driver.findElement(By.linkText("ZIP file")).click();

	}

}
