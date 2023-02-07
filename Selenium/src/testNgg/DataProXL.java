package testNgg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProXL 
{
	@DataProvider(name="XLRead")
	public Object m1()
	{
		Object data = getXL();
		return data;
	}
	public Object getXL()
	{
		return driver;
		
	}
	
	
	WebDriver driver;
	@Test(dataProvider = "XLRead") 
	public void Config(String email,String password)
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.name("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		driver.quit();
	}
}
