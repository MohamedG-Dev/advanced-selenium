package learning.JavaScripExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshingPageUsingJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("history.go(0)");
		Thread.sleep(2000);
		driver.close();

	}

}
