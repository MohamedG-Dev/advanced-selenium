package learning.IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingToFrameWithTheHelpOfElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='iframe1']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.linkText("Hotels")).click();
	}

}
