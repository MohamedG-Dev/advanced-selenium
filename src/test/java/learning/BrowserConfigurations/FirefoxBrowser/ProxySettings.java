package learning.BrowserConfigurations.FirefoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProxySettings {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile profile2 = profiles.getProfile("Profile2");
		profile2.setPreference("network.proxy.type", 1);
		profile2.setPreference("netowrk.proxy.http", "192.168.30.3");
		profile2.setPreference("network.proxy.http_port", 9193);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile2);
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		//driver.quit();

	}

}
