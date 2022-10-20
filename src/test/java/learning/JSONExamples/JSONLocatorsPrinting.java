package learning.JSONExamples;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jayway.jsonpath.JsonPath;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSONLocatorsPrinting {
	static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty("user.dir") + "\\jsonFiles\\objectRepository.json");
		Object myAccountMenu = JsonPath.read(file, "$." + "Home_Page.MyAccount_Menu");
		Object registerMenu = JsonPath.read(file, "$." + "Home_Page.Register_MenuOption");
		Object loginMenu = JsonPath.read(file, "$." + "Home_Page.Login_MenuOption");
		Object emailTextBox = JsonPath.read(file, "$." + "Login_Page.Email_TextBox");
		Object passwordTextBox = JsonPath.read(file, "$." + "Login_Page.Password_TextBox");
		Object loginButton = JsonPath.read(file, "$." + "Login_Page.Login_Button");
		Object registerAffiliate = JsonPath.read(file, "$." + "Account_Page.RegisterAffiliate_Link");
		System.out.println(myAccountMenu);
		System.out.println(registerMenu);
		System.out.println(loginMenu);
		System.out.println(emailTextBox);
		System.out.println(passwordTextBox);
		System.out.println(loginButton);
		System.out.println(registerAffiliate);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo");
		objectToElement(myAccountMenu).click();
		objectToElement(loginMenu).click();
		objectToElement(emailTextBox).sendKeys("ravi.kiran1@gmail.com");
		objectToElement(passwordTextBox).sendKeys("rkiran");
		objectToElement(loginButton).click();
		if (objectToElement(registerAffiliate).isDisplayed()) {
			System.out.println("Login Successful - User is able to login");
		} else {
			System.out.println("Login Failed - User is unable to login");
		}
		driver.quit();
	}

	public static WebElement objectToElement(Object obj) {
		WebElement element = null;
		String locatorTypeAndValue = obj.toString();
		String[] locatorArray = locatorTypeAndValue.split(";");
		String locatorType = locatorArray[0];
		String locatorValue = locatorArray[1];
		if (locatorType.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locatorValue));
		} else if (locatorType.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locatorValue));
		} else if (locatorType.equalsIgnoreCase("link")) {
			element = driver.findElement(By.linkText(locatorValue));
		} else if (locatorType.equalsIgnoreCase("classname")) {
			element = driver.findElement(By.className(locatorValue));
		} else if (locatorType.equalsIgnoreCase("css")) {
			element = driver.findElement(By.cssSelector(locatorValue));
		} else if (locatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(locatorValue));
		}
		return element;
	}

}
