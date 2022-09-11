package learning.JavaScripExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleAndUrlUsingJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Object title = jse.executeScript("return document.title");
		Object url = jse.executeScript("return document.URL");
		System.out.println(title.toString());
		System.out.println(url.toString());
		driver.close();
	}

}
