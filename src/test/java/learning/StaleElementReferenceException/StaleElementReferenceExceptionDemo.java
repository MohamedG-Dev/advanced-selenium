package learning.StaleElementReferenceException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceExceptionDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");

		WebElement section = driver.findElement(By.xpath("//div[@id='LinkList1']/div/ul"));
		List<WebElement> links = section.findElements(By.tagName("a"));
		for (WebElement link : links) {
			link.click();
			driver.get("http://www.omayo.blogspot.com");
		}
		driver.quit();
	}

}
