package learning.ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PauseActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.pause(Duration.ofSeconds(5)).perform();
		WebElement homeMenu = driver.findElement(By.id("home"));
		actions.moveToElement(homeMenu).perform();
		actions.pause(Duration.ofSeconds(5)).perform();
		actions.contextClick().perform();

	}

}
