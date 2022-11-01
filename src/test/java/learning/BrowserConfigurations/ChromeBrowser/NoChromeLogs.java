package learning.BrowserConfigurations.ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoChromeLogs {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Before logs");
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.findElement(By.name("search")).sendKeys("Samsung");
		driver.findElement(By.cssSelector("i[class$='fa-search']")).click();
		Thread.sleep(3000);
		driver.quit();
		System.out.println("After logs");

	}

}
