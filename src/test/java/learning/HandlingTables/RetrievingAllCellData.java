package learning.HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrievingAllCellData {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		List<WebElement> dataCells = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		for (WebElement cell : dataCells) {
			System.out.println(cell.getText());
		}
		driver.quit();
	}

}
