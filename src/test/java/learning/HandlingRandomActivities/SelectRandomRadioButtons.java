package learning.HandlingRandomActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectRandomRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		int noOfRadioOptions = driver.findElements(By.xpath("//input[@name='gender']")).size();
		int randomNumber = HandleRandomActivities.getRandomNumber(noOfRadioOptions);
		driver.findElement(By.xpath("//input[@name='gender'][" + randomNumber + "]")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
