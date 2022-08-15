package learning.RobotClass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureFullScreenshotDemo {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qafox.com/");
		Thread.sleep(3000);
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		BufferedImage img = robot.createScreenCapture(rectangle);
		File file = new File(System.getProperty("user.dir") + "/imageFiles/fullScreenshot.png");
		Thread.sleep(5000);
		ImageIO.write(img, "png", file);
		driver.close();
	}

}
