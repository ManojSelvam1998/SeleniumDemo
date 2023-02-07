package Basicpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		WebDriver a1=new ChromeDriver();
		a1.get("https://www.qspiders.com/");
		a1.manage().window().maximize();
	}

}
