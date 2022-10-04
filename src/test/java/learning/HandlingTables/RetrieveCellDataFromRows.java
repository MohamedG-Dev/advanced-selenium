package learning.HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveCellDataFromRows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			for (WebElement cell : cells) {
				System.out.print(cell.getText() + " ");
			}
			System.out.println();
		}
		driver.quit();
	}

}
