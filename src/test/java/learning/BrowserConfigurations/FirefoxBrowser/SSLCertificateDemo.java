package learning.BrowserConfigurations.FirefoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCertificateDemo {

	public static void main(String[] args) {
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile profile2=profiles.getProfile("Profile2");
		profile2.setPreference("dom.webnotifications.enabled",false);
		//profile2.setAcceptUntrustedCertificates(true);
		//profile2.setAssumeUntrustedCertificateIssuer(false);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile2);
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		System.out.println("Before logs");
		driver.manage().window().maximize();
		driver.get("https://www.cacert.org/");
		//driver.quit();
		System.out.println("After logs");

	}

}
