package learning.BrowserConfigurations.FirefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserWithSpecificProfile {
//Before Launching this program create a new Profile in Firefox browser as "Profile2"
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile profile2 = profiles.getProfile("Profile2");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile2);
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		System.out.println("Before logs");
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo");
		driver.findElement(By.name("search")).sendKeys("Samsung");
		driver.findElement(By.cssSelector("i[class$='fa-search']")).click();
		driver.quit();
		System.out.println("After logs");
	}

}
