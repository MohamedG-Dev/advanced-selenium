package learning.downloadFiles;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadingFileInFirefox {
//Note: Delete the existing files under the download folder before running the program
	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		String downloadPath = System.getProperty("user.dir") + "\\downloads";
		profile.setPreference("browser.download.dir", downloadPath);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		options.setProfile(profile);

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.in/p/page7.html");
		driver.findElement(By.linkText("ZIP file")).click();

		Thread.sleep(9 * 1000);
		// D:\Learning\selenium\workspace\advanced-selenium\downloads
		File file = new File(downloadPath + "\\DownloadDemo-master.zip");
		if (file.exists()) {
			System.out.println("ZIP file is donwloaded");
		} else {
			System.out.println("ZIP file failed to download");
		}

		driver.quit();
	}

}
