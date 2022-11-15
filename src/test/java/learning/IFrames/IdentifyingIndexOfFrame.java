package learning.IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdentifyingIndexOfFrame {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		int iframesCount = driver.findElements(By.tagName("iframe")).size();
		for (int i = 0; i < iframesCount; i++) {
			driver.switchTo().frame(i);
			if (driver.findElements(By.id("datepicker")).size() == 1) {
				System.out.println("The required element is available in iframe having index: " + i);
			}
			driver.switchTo().defaultContent();
		}
		driver.quit();
	}

}
