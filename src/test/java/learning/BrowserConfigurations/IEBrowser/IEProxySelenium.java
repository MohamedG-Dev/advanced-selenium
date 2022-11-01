package learning.BrowserConfigurations.IEBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEProxySelenium {

	public static void main(String[] args) {
		String PROXY = "192.168.30.2:9293";
		Proxy proxy = new Proxy();
		proxy.setAutodetect(false);
		proxy.setProxyType(Proxy.ProxyType.MANUAL);
		proxy.setHttpProxy(PROXY);
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.PROXY, proxy);
		
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.merge(capabilities);
		
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver(options);
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.findElement(By.name("search")).sendKeys("Samsung");
		driver.findElement(By.cssSelector("i[class$='fa-search']")).click();
		driver.quit();

	}

}
