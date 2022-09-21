package learning.sendKeysExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectionBoxFieldDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		// Selecting an option in the multi selection box field
		driver.findElement(By.id("multiselect1")).sendKeys("Audi");
		Thread.sleep(3000);
		driver.close();

	}

}
