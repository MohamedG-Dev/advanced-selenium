package learning.IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementAvailableOrNot {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		int count = driver.findElements(By.name("q")).size();
		if (count == 1) {
			System.out.println("Element is available on the page");
		} else if (count == 0) {
			System.out.println("Element is not available on the page");
		}
		driver.quit();
	}

}
