package learning.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysUpAndKeysDownActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement registerBreadCrumb = driver.findElement(By.linkText("Register"));
		actions.keyDown(Keys.CONTROL).click(registerBreadCrumb).keyUp(Keys.CONTROL).build().perform();

	}

}
