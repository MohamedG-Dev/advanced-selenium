package learning.sendKeysExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingKeyboardKeysDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("ravi.kiran1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("rkiran");
		driver.findElement(By.cssSelector("input[value='Login']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.close();

	}

}
