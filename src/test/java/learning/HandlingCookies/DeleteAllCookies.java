package learning.HandlingCookies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteAllCookies {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("a[title='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("ravi.kiran1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("rkiran");
		driver.findElement(By.cssSelector("input[type='submit'][value='Login']")).click();
		Thread.sleep(5*1000);
		//Delete All the cookied
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(3*1000);
		driver.quit();
	}

}
