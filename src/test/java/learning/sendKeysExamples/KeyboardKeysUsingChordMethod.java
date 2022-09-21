package learning.sendKeysExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardKeysUsingChordMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("ta1")).sendKeys("Typing the text");
		Thread.sleep(3000);
		driver.findElement(By.id("ta1")).sendKeys(Keys.chord(Keys.CONTROL, "z"));
		Thread.sleep(3000);
		driver.close();
	}

}
