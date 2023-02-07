package avactis;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selec3Class 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		
		String dayXpath="//select[@id='day']//option";
		String monthXpath="//select[@id='month']//option";
		String yearXpath="//select[@id='year']//option";
		
		dob(dayXpath, "22");
		dob(monthXpath, "Aug");
		dob(yearXpath, "1998");
		
	}
	public static void dob(String xpath, String value)
	{
		List<WebElement> list = driver.findElements(By.xpath(xpath));
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equals(value))
			{
				list.get(i).click();
			}
		}
	}
	
	
}
