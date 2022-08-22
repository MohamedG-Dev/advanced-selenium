package learning.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropByActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/p/page3.html");
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		WebElement leftslider = driver.findElement(By.cssSelector("a[class $='btn-null']"));
		actions.dragAndDropBy(leftslider, 100, 0).perform();
		Thread.sleep(3000);
		actions.dragAndDropBy(leftslider, -50, 0).perform();
		Thread.sleep(3000);
		driver.close();
	}

}
