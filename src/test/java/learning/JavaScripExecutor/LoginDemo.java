package learning.JavaScripExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('input-email').setAttribute('value','steve2@gmail.com')");
		jse.executeScript("document.getElementById('input-password').setAttribute('value','steve1')");
		jse.executeScript("arguments[0].click()",
				driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")));
		driver.close();
	}

}
