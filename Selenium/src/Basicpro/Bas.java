package Basicpro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bas 
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ilovepdf.com/compress_pdf");
		driver.findElement(By.linkText("Select PDF files")).click();
		Robot robo=new Robot();
		/*robo.keyPress(KeyEvent.VK_M);
		robo.keyRelease(KeyEvent.VK_M);
		robo.keyPress(KeyEvent.VK_TAB);
		robo.keyRelease(KeyEvent.VK_TAB);
		*/ 
	}
}
