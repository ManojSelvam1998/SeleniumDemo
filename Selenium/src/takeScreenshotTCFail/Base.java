package takeScreenshotTCFail;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import Basicpro.SeleniumGetMethods;

public class Base 
{
	static WebDriver driver;
	
	public static void befMeth()
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	public static void aftMeth() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	
	public static void takeSS(String filename) throws WebDriverException, IOException
	{
		
		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Ajith\\eclipse-workspace\\Selenium\\SS\\"+filename+".png"));
		
	}
}
