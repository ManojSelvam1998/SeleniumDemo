package Basicpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait...
		Thread.sleep(2000);// Thread.sleep method...
		//Fluent wait does not have syntax..Using for change the Polling Frequency time like 500ms to something..
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));//Explicit wait...
		driver.findElement(By.name("username")).sendKeys("Manoj");
		
		
		driver.get("https://instagram.com/");
		for(int i=0;i<=100;i++)
		{
			try {
				driver.findElement(By.name("username")).sendKeys("Manoj")	;		
				break;
				}
			catch(Exception e)
				{
					System.out.println(i);
				}                        //custom wait...
		}
		driver.quit();
		
		
	}
}
