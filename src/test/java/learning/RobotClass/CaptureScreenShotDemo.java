package learning.RobotClass;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShotDemo {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qafox.com/");
		Robot robot = new Robot();
		Rectangle rectangle = new Rectangle(40, 60, 500, 800);
		BufferedImage img = robot.createScreenCapture(rectangle);
		File file = new File(System.getProperty("user.dir") + "/imageFiles/screenshot.png");
		Thread.sleep(5000);
		ImageIO.write(img, "png", file);
		driver.close();
	}

}
