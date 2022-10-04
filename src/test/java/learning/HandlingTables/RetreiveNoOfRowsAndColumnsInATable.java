package learning.HandlingTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetreiveNoOfRowsAndColumnsInATable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		int rowsSize = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		int colsSize = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th")).size();
		System.out.println("Number of rows in the table are: " + rowsSize);
		System.out.println("Number of columns in the table are: " + colsSize);
		driver.quit();
	}

}
