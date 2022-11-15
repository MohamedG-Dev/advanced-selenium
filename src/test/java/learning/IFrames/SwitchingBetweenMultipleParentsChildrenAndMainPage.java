package learning.IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingBetweenMultipleParentsChildrenAndMainPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/framesdemoone_56.html");
		
		//Switching to first parent frame
		driver.switchTo().frame("frame1");
		
		//Switching to child frame of first parent frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		driver.findElement(By.id("datepicker")).click();
		
		Thread.sleep(3000);
		
		//Switching back to first parent frame
		driver.switchTo().parentFrame();
		
		driver.findElement(By.name("s")).sendKeys("QAFox.com");
		
		Thread.sleep(1000);
		
		//Switching back to main page
		driver.switchTo().defaultContent();
		
		System.out.println("Selenium143 link is displayed: "+driver.findElement(By.id("selenium143")).isDisplayed());
		

		Thread.sleep(1000);
		
		//Switching to second parent frame
		driver.switchTo().frame("frame2");
		
		System.out.println(driver.findElement(By.className("main-title")).getText());
		
		Thread.sleep(1000);
		
		//Switching to child frame of second parent frame
		driver.switchTo().frame("eastframe");
		
		Thread.sleep(1000);
		
		//Switching back to main page
		driver.switchTo().defaultContent();
		
		System.out.println("Selenium143 link is displayed: "+driver.findElement(By.id("selenium143")).isDisplayed());
		
		driver.quit();

	}

}
