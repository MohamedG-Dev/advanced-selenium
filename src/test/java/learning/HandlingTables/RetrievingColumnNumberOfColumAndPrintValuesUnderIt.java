package learning.HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrievingColumnNumberOfColumAndPrintValuesUnderIt {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		String columnName = "Place";
		int headingColumnIndex = 0;
		List<WebElement> tableHeadings = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		for (WebElement heading : tableHeadings) {
			headingColumnIndex++;
			if (heading.getText().equals(columnName)) {
				break;
			}
		}
		System.out.println("The Column index for the column " + columnName + " is " + headingColumnIndex);
		List<WebElement> columnValues = driver
				.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[" + headingColumnIndex + "]"));
		System.out.print("The data available under the Column " + columnName + " are:");
		for (WebElement cell : columnValues) {
			System.out.print(" " + cell.getText());
		}
		driver.quit();
	}

}
