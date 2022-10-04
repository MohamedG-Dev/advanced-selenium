package learning.HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveRowNumberOfProvidedCellValue {
	static WebDriver driver = null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		String cellValue = "25";
		int rowNumber = getRowNumberOfCellData(cellValue);
		if (rowNumber != -1) {
			System.out
					.println("The row number in which the cell value " + cellValue + " is available is: " + rowNumber);
			String location = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + rowNumber + "]/td[3]"))
					.getText();
			System.out.println("The location of the person having the age " + cellValue + " is: " + location);
		} else {
			System.out.println("The given cell value" + cellValue + " is not available in the table");
		}

		driver.quit();
	}

	public static int getRowNumberOfCellData(String value) {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for (WebElement cell : cells) {
				if (cell.getText().equals(value)) {
					return ++i;
				}
			}
		}

		return -1;
	}

}
