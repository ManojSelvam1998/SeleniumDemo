package Basicpro;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScre
{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.cssSelector("[alt='Tricentis Demo Web Shop']"));
		
		//FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./Selenium Sw/manoj.png"));
		//FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE), new File("./Selenium Sw/Manoj1.png"));
		
		/*TakesScreenshot ts=(TakesScreenshot)driver;//Explicit type casting
		File photo=ts.getScreenshotAs(OutputType.FILE);
		File file=new File("./Selenium Sw/file1.png");
		FileUtils.copyFile(photo, file);
		
		
		File photo1=element.getScreenshotAs(OutputType.FILE);
		File file1=new File("./Selenium Sw/file2.png");
		FileUtils.copyFile(photo1, file1);
		
		driver.quit();*/
		
		
		Robot robot=new Robot();
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(size);
		BufferedImage scr = robot.createScreenCapture(rect);
		File file=new File("./SS/op.png");
		ImageIO.write(scr, "png", file);
	}

}
