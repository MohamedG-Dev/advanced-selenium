package learning.autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItUploadDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		//driver.findElement(By.xpath("//form[@action='demo_form.asp']/input")).click();
		 driver.findElement(By.id("uploadfile")).click();
		Thread.sleep(4000);
		String auotItScriptPath = System.getProperty("user.dir") + "/AutoItCode/uploadingFileScript.exe";
		String uploadFilePath = System.getProperty("user.dir") + "/UploadFiles/testImage.png";
		String[] cmd = { auotItScriptPath, uploadFilePath };
		Runtime.getRuntime().exec(cmd);
	}

}
