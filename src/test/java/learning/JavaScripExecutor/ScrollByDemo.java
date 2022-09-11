package learning.JavaScripExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,890)");
		// we can also use scroll method
		jse.executeScript("window.scroll(0,700)");
		Thread.sleep(4000);
		//jse.executeScript("window.scrollBy(0,-500)");
		jse.executeScript("window.scroll(0,400)");
		Thread.sleep(5000);
		driver.close();
	}

}
