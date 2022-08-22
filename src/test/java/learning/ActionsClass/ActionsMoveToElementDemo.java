package learning.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMoveToElementDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
		actions.moveToElement(blogsMenu).perform();
		Thread.sleep(3000);
		WebElement SeleniumByArunOption = driver.findElement(By.linkText("SeleniumByArun"));
		// actions.moveToElement(SeleniumByArunOption).perform();
		// actions.click().perform();
		// Optimizing the multiple actions - To perform multiple actions into one single
		// action build() method should be used.
		// Example optimizing line 24 and line 25 into one single action.
		actions.moveToElement(SeleniumByArunOption).click().build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}
