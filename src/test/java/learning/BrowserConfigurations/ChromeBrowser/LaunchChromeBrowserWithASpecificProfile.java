package learning.BrowserConfigurations.ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowserWithASpecificProfile {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Users\\OSAMA\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1\\");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.myntra.com/");

	}

}
