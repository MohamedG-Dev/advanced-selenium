package learning.HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicHandlingWebTableExample {
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		String companyName = "M&M Fin.Services";
		int companyColumnNumber = getColumnNumberOfGivenColumn("Company");
		int currentPriceColumnNumber = getColumnNumberOfGivenColumn("Current Price (Rs)");
		if ((companyColumnNumber != -1) && (currentPriceColumnNumber != -1)) {
			int rowNumber = getRowNumberOfCellValue(companyName, companyColumnNumber);
			if (rowNumber != -1) {
				WebElement currentPrice = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["
						+ rowNumber + "]/td[" + currentPriceColumnNumber + "]"));
				String currentPriceValue = currentPrice.getText();
				highlightElement(currentPrice);
				Thread.sleep(4000);
				System.out.println("The current price of Company " + companyName + " is: " + currentPriceValue);
			} else {
				System.out.println("The company name " + companyName + " is not available in the table data");
			}
		} else {
			System.out.println("Company or Current Price Rs headings may not be avialable in the table headings");
		}
		driver.quit();
	}

	public static int getColumnNumberOfGivenColumn(String columnName) {
		List<WebElement> columnNames = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		for (int i = 0; i < columnNames.size(); i++) {
			if (columnNames.get(i).getText().equals(columnName)) {
				return ++i;
			}
		}

		return -1;
	}

	public static int getRowNumberOfCellValue(String companyName, int columnNumber) {
		List<WebElement> columnValues = driver
				.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[" + columnNumber + "]"));
		for (int i = 0; i < columnValues.size(); i++) {
			if (columnValues.get(i).getText().equals(companyName)) {
				return ++i;
			}
		}
		return -1;
	}

	public static void highlightElement(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].style.border='5px solid red';", element);
	}
}
