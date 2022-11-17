package learning.HandlingCookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddNewCookie {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");

		Cookie addCookie = new Cookie("automation", "coding_cookie");
		driver.manage().addCookie(addCookie);

		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> itr = cookies.iterator();
		while (itr.hasNext()) {
			Cookie cookie = itr.next();
			System.out.println(cookie.getName() + "------" + cookie.getValue());
		}
		driver.quit();
	}

}
