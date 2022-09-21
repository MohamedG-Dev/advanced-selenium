package learning.sendKeysExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextAreaDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		// Typing text into Text Area field
		driver.findElement(By.id("ta1"))
				.sendKeys("Hello world, This is a sendkeys() method demo example in the Text area field."
						+ "Hello world, This is a sendkeys() method demo example in the Text area field."
						+ "Hello world, This is a sendkeys() method demo example in the Text area field."
						+ "Hello world, This is a sendkeys() method demo example in the Text area field."
						+ "Hello world, This is a sendkeys() method demo example in the Text area field.");
		Thread.sleep(5000);
		driver.close();

	}

}
