package learning.HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveAllCellDataFromAParticularColumn {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		List<WebElement> nameColumnRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		System.out.print("The table data for the Name Column are:");
		for (WebElement row : nameColumnRows) {
			System.out.print(" " + row.getText());
		}
		driver.quit();
	}

}
