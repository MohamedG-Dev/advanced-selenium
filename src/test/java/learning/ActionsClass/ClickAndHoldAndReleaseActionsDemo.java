package learning.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHoldAndReleaseActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		WebElement homeMenu = driver.findElement(By.id("home"));
		actions.clickAndHold(homeMenu).perform();
		Thread.sleep(3000);
		actions.release().perform();
		// or we can combine the line 21 and 23 in to one single statement.
		// actions.clickAndHold(homeMenu).release().build().perform();
		driver.close();
	}

}
