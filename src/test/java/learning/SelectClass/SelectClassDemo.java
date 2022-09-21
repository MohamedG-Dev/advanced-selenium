package learning.SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com");
		WebElement multiSelect = driver.findElement(By.id("multiselect1"));
		Select select = new Select(multiSelect);
		Thread.sleep(3000);
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.deselectByIndex(2);
		Thread.sleep(2000);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByValue("swiftx");
		Thread.sleep(2000);
		select.deselectByValue("swiftx");
		Thread.sleep(2000);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("swiftx");
		WebElement firstSelectedElement = select.getFirstSelectedOption();
		System.out.println("First Selected Element is: " + firstSelectedElement.getText());
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		System.out.println("Selected Options on multiselect field are");
		for (WebElement ele : selectedOptions) {
			System.out.print(ele.getText() + ", ");
		}
		Thread.sleep(2000);
		select.deselectAll();
		Thread.sleep(2000);
		List<WebElement> selectOptions = select.getOptions();
		System.out.println("Options avilable to select from the multi select field are");
		for (WebElement element : selectOptions) {
			System.out.println(element.getText());
		}
		System.out.println("Is the multiSelect field supports multiple Selection? "+select.isMultiple());
		WebElement dropdown = driver.findElement(By.id("drop1"));
		select = new Select(dropdown);
		System.out.println("Is the dropdown field supports multiple Selection? "+select.isMultiple());
		driver.close();
	}

}
