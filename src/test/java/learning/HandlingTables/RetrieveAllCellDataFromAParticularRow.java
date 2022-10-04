package learning.HandlingTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetrieveAllCellDataFromAParticularRow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		List<WebElement> secondRow = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[2]/td"));
		System.out.print("The second Row Data are:");
		for (WebElement cell : secondRow) {
			System.out.print(" " + cell.getText());
		}
		driver.quit();
	}

}
