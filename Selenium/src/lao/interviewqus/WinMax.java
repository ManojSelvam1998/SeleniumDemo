package lao.interviewqus;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WinMax 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium Sw/chromeDriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--start-maximazed");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
		
		//driver.manage().window().maximize();
		
		Dimension d=new Dimension(1366, 766);
		driver.manage().window().setSize(d);
		//driver.switchTo().activeElement().sendKeys(args);
	}
}
