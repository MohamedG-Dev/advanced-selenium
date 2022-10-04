package learning.HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveLocationBasedOnName {

	public static void main(String[] args) {
		String name = "Praveen";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		List<WebElement> locations = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
		for (int i = 0; i < names.size(); i++) {
			String retrieveName = names.get(i).getText();
			if (retrieveName.equals(name)) {
				System.out.println("The person having name " + name + " stays at " + locations.get(i).getText());
				break;
			}
		}
		driver.quit();
	}

}
