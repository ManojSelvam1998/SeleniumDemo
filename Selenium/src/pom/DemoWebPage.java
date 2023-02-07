package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebPage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");
		
		Source src=new Source(driver);
		src.getSearchstore().sendKeys("bsksd");
		src.getReglink().click();
		src.getMale().click();
		src.getFsname().sendKeys("Manu");
		src.getLsname().sendKeys("S");
		
		
	}
}