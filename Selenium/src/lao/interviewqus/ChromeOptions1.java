package lao.interviewqus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions1 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./selenium Sw/chromeDriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("start-maximized");	//maxScreen..
		//co.addArguments("--headless");
		co.addArguments("--disable-notifications");	//n-disable..
		co.addArguments("incognito");	//incognito..
		
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
	}
}
