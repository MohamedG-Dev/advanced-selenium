package learning.WebDriverEventListeners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.support.events.WebDriverListener;

public class MyListener implements WebDriverListener {
	@Override
	public void beforeAnyNavigationCall(Navigation navigation, Method method, Object[] args) {
		// WebDriverListener.super.beforeAnyNavigationCall(navigation, method, args);
		System.out.println("Before Navigating: " + method.getName());
	}

	@Override
	public void afterAnyNavigationCall(Navigation navigation, Method method, Object[] args, Object result) {
		// WebDriverListener.super.afterAnyNavigationCall(navigation, method, args,
		// result);
		System.out.println("After Navigating: " + method.getName());
	}

	@Override
	public void beforeGet(WebDriver driver, String url) {
		// WebDriverListener.super.beforeGet(driver, url);
		System.out.println("Before Navigating: " + driver.getCurrentUrl());
	}

	@Override
	public void afterGet(WebDriver driver, String url) {
		// WebDriverListener.super.afterGet(driver, url);
		System.out.println("After Navigating: " + url);
	}

	@Override
	public void beforeFindElement(WebElement element, By locator) {
		// WebDriverListener.super.beforeFindElement(element, locator);
		System.out.println("Before Finding the element: " + element);
	}

	@Override
	public void beforeFindElement(WebDriver driver, By locator) {
		// WebDriverListener.super.beforeFindElement(driver, locator);
		System.out.println("Before Finding the element: " + locator);
	}

	@Override
	public void afterFindElement(WebDriver driver, By locator, WebElement result) {
		// WebDriverListener.super.afterFindElement(driver, locator, result);
		System.out.println("After Finding the element: " + result);
	}

	@Override
	public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
		// WebDriverListener.super.beforeSendKeys(element, keysToSend);
		System.out.println("Before Typing Text, The element's getText value is: " + element.getText());
	}

	@Override
	public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
		// WebDriverListener.super.afterSendKeys(element, keysToSend);
		System.out.println("The text sent to be in the element is : " + keysToSend[0]);
	}

	@Override
	public void beforeClear(WebElement element) {
		// WebDriverListener.super.beforeClear(element);
		System.out.println("Before Clearing the Txt: " + element);
	}

	@Override
	public void afterClear(WebElement element) {
		// WebDriverListener.super.afterClear(element);
		System.out.println("After Clearing the Txt: " + element);
	}

	@Override
	public void beforeClick(WebElement element) {
		// WebDriverListener.super.beforeClick(element);
		System.out.println("Before clicking on the ELement: " + element);
	}

	@Override
	public void afterClick(WebElement element) {
		// WebDriverListener.super.afterClick(element);
		System.out.println("After clicking on the ELement: " + element);
	}

	@Override
	public void beforeAccept(Alert alert) {
		// WebDriverListener.super.beforeAccept(alert);
		System.out.println("Before Accepting the alert");
	}

	@Override
	public void afterAccept(Alert alert) {
		// WebDriverListener.super.afterAccept(alert);
		System.out.println("Before Accepting the alert");
	}

	@Override
	public void beforeDismiss(Alert alert) {
		// WebDriverListener.super.beforeDismiss(alert);
		System.out.println("Before Dismissing the alert");
	}

	@Override
	public void afterDismiss(Alert alert) {
		// WebDriverListener.super.afterDismiss(alert);
		System.out.println("After Dismissing the alert");
	}

	@Override
	public void beforeRefresh(Navigation navigation) {
		// WebDriverListener.super.beforeRefresh(navigation);
		System.out.println("Before Refresh");
	}

	@Override
	public void afterRefresh(Navigation navigation) {
		// WebDriverListener.super.afterRefresh(navigation);
		System.out.println("After Refresh");
	}

	@Override
	public void beforeExecuteScript(WebDriver driver, String script, Object[] args) {
		// WebDriverListener.super.beforeExecuteScript(driver, script, args);
		System.out.println("Before Executing Javascript: " + script);
	}

	@Override
	public void afterExecuteScript(WebDriver driver, String script, Object[] args, Object result) {
		// WebDriverListener.super.afterExecuteScript(driver, script, args, result);
		System.out.println("After Executing Javascript: " + script);
	}

	@Override
	public void beforeGetText(WebElement element) {
		// WebDriverListener.super.beforeGetText(element);
		System.out.println("Before Getting the text from the element: " + element);
		System.out.println("The text of the Element is: " + element.getText());
	}

	@Override
	public void afterGetText(WebElement element, String result) {
		// WebDriverListener.super.afterGetText(element, result);
		System.out.println("Before Getting the text from the element: " + element);
		System.out.println("The text of the Element is: " + result);
	}

	@Override
	public void beforeGetWindowHandles(WebDriver driver) {
		// WebDriverListener.super.beforeGetWindowHandles(driver);
		System.out.println("Before Get window Handles(): " + driver.getWindowHandles().toString());
	}

	@Override
	public void afterGetWindowHandles(WebDriver driver, Set<String> result) {
		// WebDriverListener.super.afterGetWindowHandles(driver, result);
		System.out.println("After Get window Handles(): " + driver.getWindowHandles().toString());
	}

	@Override
	public void beforeBack(Navigation navigation) {
		// WebDriverListener.super.beforeBack(navigation);
		System.out.println("Before Navigation back");
	}

	@Override
	public void afterBack(Navigation navigation) {
		// WebDriverListener.super.afterBack(navigation);
		System.out.println("After Navigation back");
	}

	@Override
	public void beforeForward(Navigation navigation) {
		// WebDriverListener.super.beforeForward(navigation);
		System.out.println("Before Navigation forward");
	}

	@Override
	public void afterForward(Navigation navigation) {
		// WebDriverListener.super.afterForward(navigation);
		System.out.println("After Navigation Forward");
	}
	@Override
	public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
		//WebDriverListener.super.onError(target, method, args, e);
		System.out.println("Exception message: "+args[0]);
	}
}
