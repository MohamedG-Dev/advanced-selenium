package learning.EncryptionAndDecription;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("ravi.kiran1@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("rkiran");
		String password = getDecryptedText("cmtpcmFu");
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[type='submit'][value='Login']")).click();
		driver.close();

	}

	public static String getDecryptedText(String value) {
		byte[] decryptedByte = Base64.getDecoder().decode(value);
		String decryptedText = new String(decryptedByte);
		return decryptedText;
	}

}
