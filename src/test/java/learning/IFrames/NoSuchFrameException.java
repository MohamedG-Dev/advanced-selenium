package learning.IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchFrameException {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");
		driver.switchTo().frame("iframe2");
		driver.findElement(By.linkText("Chapter1")).click();
		driver.switchTo().frame("iframe1");
		driver.findElement(By.linkText("Hotels")).click();

	}

}
