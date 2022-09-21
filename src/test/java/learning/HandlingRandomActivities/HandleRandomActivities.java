package learning.HandlingRandomActivities;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleRandomActivities {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		int listSize = driver.findElements(By.xpath("//div[contains(@class,'LinkList')]/div/ul/li/a")).size();
		int randomNumber = getRandomNumber(listSize);
		driver.findElement(By.xpath("(//div[contains(@class,'LinkList')]/div/ul/li/a)[" + randomNumber + "]")).click();
		Thread.sleep(4000);
		driver.quit();
	}

	public static int getRandomNumber(int number) {
		Random random = new Random();
		return random.nextInt(number) + 1;
	}

}
