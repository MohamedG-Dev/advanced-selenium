package learning.HandlingCookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintPropertiesOfCookies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");

		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> itr = cookies.iterator();
		while (itr.hasNext()) {
			Cookie cookie = itr.next();
			System.out.println("Name of the Cookie: " + cookie.getName());
			System.out.println("Value of the Cookie: " + cookie.getValue());
			System.out.println("Path of the Cookie: " + cookie.getPath());
			System.out.println("Expiry date of the Cookie: " + cookie.getExpiry());
			System.out.println("Domain of the cookie: " + cookie.getDomain());
			System.out.println("-------------------------------------------------------------------");
		}
		driver.quit();
	}

}
