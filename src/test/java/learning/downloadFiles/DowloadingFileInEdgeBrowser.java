package learning.downloadFiles;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DowloadingFileInEdgeBrowser {
//Note: Delete the existing files under the download folder before running the program
	public static void main(String[] args) throws InterruptedException {
		EdgeOptions options = new EdgeOptions();
		Map<String, Object> preferences = new HashMap<String, Object>();
		preferences.put("profile.default_content_settings.popups", 0);
		String downloadPath = System.getProperty("user.dir") + "\\downloads";
		preferences.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs", preferences);
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.linkText("ZIP file")).click();

		Thread.sleep(5000);

		File file = new File(downloadPath + "\\DownloadDemo-master.zip");

		if (file.exists()) {

			System.out.println("ZIP file got successfully downloaded");

		} else {

			System.out.println("ZIP file download failed");
		}

		driver.quit();
	}

}
