package learning.HandlingCookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com/");
		//Retrieving all the cookies which got dropped by ebay.com into the Chrome browser.
		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> itr = cookies.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("--------------------------------------------------------");
		}
		driver.quit();
	}

}
