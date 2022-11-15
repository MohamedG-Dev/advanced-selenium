package learning.IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IdentifyFrameIndexAndPerformOperations {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.omayo.blogspot.com");
		
		int iframesCount = driver.findElements(By.tagName("iframe")).size();
		int identifiedFrame = 0;
		
		for(int i=0;i<iframesCount;i++) {
			
			driver.switchTo().frame(i);
			
			if(driver.findElements(By.linkText("Hotels")).size()==1) {
				
				System.out.println("The required element is available in iframe having index: "+i);
				identifiedFrame = i;
			
			}
			
			driver.switchTo().defaultContent();
			
		}
		
		driver.switchTo().frame(identifiedFrame);
		
		driver.findElement(By.linkText("Hotels")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
