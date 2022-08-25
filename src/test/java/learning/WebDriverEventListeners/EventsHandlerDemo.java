package learning.WebDriverEventListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverListener;

// WebDriverEventListener - deprecated version i.e older version
// WebDriverListener is the newer Version
// Library URL - https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/events/WebDriverListener.html
public class EventsHandlerDemo implements WebDriverEventListener {

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("Before Accepting the alert");
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		System.out.println("After Accepting the alert");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("After Dismissing the alert");
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("Before Dismissing the alert");
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Navigation: "+driver.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After Navigation: "+driver.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Before Navigating back, the URL is: "+driver.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("After Navigating back, the URL is: "+driver.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Before Navigating Forward, the URL is: "+driver.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("After Navigating Forward, the URL is: "+driver.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("Before refreshing the page: "+driver.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("After refreshing the page: "+driver.getCurrentUrl());
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before Finding the element: "+element);
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("After Finding the element: "+element);
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Before clicking on the ELement: "+element);
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After clicking on the ELement: "+element);
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("Before typing the text in to the element: "+element);
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("After typing the text in to the element: "+element);
		
	}
	

	@Override
	public void beforeScript(String script, WebDriver driver) {
		System.out.println("Before Executing javascript: "+script);
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		System.out.println("After Executing javascript: "+script);
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Before switching the window, The window Name is: "+windowName);
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("After switching the window, The window Name is: "+windowName);
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("Exception Message: "+throwable.getMessage());
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		System.out.println("Before Taking the screenshot");
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		System.out.println("After Taking the screenshot");
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("Before Getting the text from the element: "+element);
		System.out.println("The text of the Element is: "+element.getText());
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("After Getting the text from the element: "+element);
		System.out.println("The text of the Element is: "+element.getText());
		
	}
}
