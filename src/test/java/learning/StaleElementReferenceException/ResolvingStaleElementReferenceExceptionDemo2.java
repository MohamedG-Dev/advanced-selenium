package learning.StaleElementReferenceException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResolvingStaleElementReferenceExceptionDemo2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");
		int size = driver.findElements(By.xpath("//div[@id='LinkList1']/div/ul/li/a")).size();
		
		for(int i=0;i<size;i++) {
			String xPath="//div[@id='LinkList1']/div/ul/li["+(i+1)+"]/a";
			driver.findElement(By.xpath(xPath)).click();
			System.out.println(driver.getTitle());
			driver.get("http://www.omayo.blogspot.com");
		}
		driver.close();
	}

}
