package learning.HandlingCalendars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCalendarDemo {

	public static void main(String[] args) throws ParseException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/p/page6.html");
		driver.switchTo().frame("dateFrame");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("datepicker")).click();
		// Code to select a date, month and a year from the calendar
		String dateToBeSelected = "29/12/2025";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(dateToBeSelected);
		// Retrieve the day in the integer format from the formattedDate
		String dayValue = new SimpleDateFormat("dd").format(date);
		int day = Integer.parseInt(dayValue);

		// Retrieve the month in the integer format from the formattedDate
		String monthValue = new SimpleDateFormat("MM").format(date);
		int month = Integer.parseInt(monthValue);

		// Retrieve the year in the integer format from the formattedDate
		String yearValue = new SimpleDateFormat("yyyy").format(date);
		int year = Integer.parseInt(yearValue);
		
		//Logic to navigate to the required year in the calendar
		while(true) {
			String displayedYear = driver.findElement(By.className("ui-datepicker-year")).getText();
			int yearDisplayed = Integer.parseInt(displayedYear);
			if(yearDisplayed==year) {
				break;
			}else if(yearDisplayed<year) {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}else if(yearDisplayed>year) {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
		}
		//Logic to navigate to the require month and select the required date
		while(true) {
			String displayedMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			SimpleDateFormat sdf2 = new SimpleDateFormat("MMMM");
			Date formatDate = sdf2.parse(displayedMonth);
			String currentMonth = new SimpleDateFormat("MM").format(formatDate);
			int monthDisplayed = Integer.parseInt(currentMonth);
			if(monthDisplayed==month) {
				// select the date
				String xpath = "//a[text()='"+day+"']";
				driver.findElement(By.xpath(xpath)).click();
				break;
			}else if(monthDisplayed<month) {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}else if(monthDisplayed>month) {
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
		}
		//driver.switchTo().defaultContent();
	//driver.quit();
	}

}
