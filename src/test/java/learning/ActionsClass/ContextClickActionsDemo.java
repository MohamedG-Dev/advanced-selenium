package learning.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		WebElement selenium143Link = driver.findElement(By.id("link1"));
		actions.contextClick(selenium143Link).perform();
		Thread.sleep(3000);
		//driver.close();

	}

}
