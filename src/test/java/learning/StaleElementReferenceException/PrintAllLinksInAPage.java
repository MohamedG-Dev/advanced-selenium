package learning.StaleElementReferenceException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinksInAPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");
		List<WebElement> hyperLinks = driver.findElements(By.tagName("a"));
		for (WebElement link : hyperLinks) {
			String linkText = link.getText();
			if(!linkText.isEmpty()) {
				System.out.println(linkText);
			}
			
		}
		driver.close();
	}

}
