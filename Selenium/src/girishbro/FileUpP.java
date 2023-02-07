package girishbro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpP 
{
	public static void main(String[] args) throws AWTException, InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		 * driver.get("https://www.ilovepdf.com/pdf_to_word");
		 * driver.findElement(By.xpath("//*[text()='Select PDF file']")).click();
		 * Thread.sleep(2000); Robot rob=new Robot();											select the line what ever we want..
		 * rob.keyPress(KeyEvent.VK_ESCAPE);// inorder to avoid the popup by clicking on        //(Crt+Shift+/)
		 * Escape button... rob.keyRelease(KeyEvent.VK_ESCAPE);
		 */	
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		//driver.findElement(By.xpath("//*[text()='Select PDF file']")).click();
		//Thread.sleep(2000);
		
		//Runtime.getRuntime().exec("\"C:\\Users\\Ajith\\OneDrive\\Desktop\\AutoItScri\\scr2.exe\"");
		
		
		//Thread.sleep(20000);
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_P);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_P);
		
		Thread.sleep(4000);
		
		
		
		
		
		
		
		
	}
}
