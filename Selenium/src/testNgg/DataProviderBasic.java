package testNgg;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBasic 
{
	WebDriver driver;
	
	String [][] data= {
			{"Manoj","Man"},
			{"Ajith","Aji"},
	};
	
	@DataProvider(name="basic")
	public String[][] basicDataProvider()
	{
		return data;
	}

	@BeforeClass
	public void bef()
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");	
	}
	
	@Test(dataProvider = "basic") 
	public void Config(String email,String password)
	{
		driver.findElement(By.name("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	@AfterClass
	public void aftm()
	{
		driver.quit();
	}
	
}
