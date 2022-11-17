package learning.HandlingCookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteASpecificCookie {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");

		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> itr = cookies.iterator();
		while (itr.hasNext()) {
			Cookie cookie = itr.next();
			if (cookie.getName().equals("ebay")) {
				System.out.println("Deleting the Cookie: "+cookie.getName());
				driver.manage().deleteCookie(cookie);
			}
		}

		Set<Cookie> afterDeleteCookies = driver.manage().getCookies();
		Iterator<Cookie> itr1 = afterDeleteCookies.iterator();
		while (itr1.hasNext()) {
			Cookie cookie = itr1.next();
			System.out.println(cookie.getName());
		}
		driver.quit();
	}

}
