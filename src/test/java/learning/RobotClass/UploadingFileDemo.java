package learning.RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadingFileDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(4000);
		// WebElement ele = driver.findElement(By.xpath("//input[@type='file' and
		// @id='uploadfile']"));
		Robot robot = new Robot();
		robot.mouseWheel(15);
		robot.delay(4000);
		robot.mouseMove(150, 450);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.delay(3000);
		StringSelection select = new StringSelection(System.getProperty("user.dir") + "\\UploadFiles\\testimage.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(3000);
		driver.close();
	}

}
