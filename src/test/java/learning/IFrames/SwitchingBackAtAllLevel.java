package learning.IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingBackAtAllLevel {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/p/page6.html");
		//Switch to the Parent Frame
		driver.switchTo().frame("dateFrame");
		//Switch to the Child Frame
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//Switch back to the Parent Frame
		driver.switchTo().parentFrame();
		//Type a text say hello world inside the search box field available inside the parent frame
		driver.findElement(By.name("s")).sendKeys("hello world");
		//Switch back to the main/default page
		driver.switchTo().defaultContent();
		//Perform an action by clicking on the Hyperlink selenium143 on the main page.
		driver.findElement(By.id("selenium143")).click();
		driver.quit();
	}

}
