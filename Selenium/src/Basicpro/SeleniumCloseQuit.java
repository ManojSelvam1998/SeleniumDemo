package Basicpro;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCloseQuit 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com/");
		driver.close();
		driver.quit();
	}
	
}
