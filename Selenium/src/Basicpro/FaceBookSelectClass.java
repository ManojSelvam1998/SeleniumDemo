package Basicpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSelectClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Manoj");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.name("reg_email__")).sendKeys("8056552679");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Manoj@123");
		
		WebElement date = driver.findElement(By.name("birthday_day"));
		Select dat=new Select(date);
		dat.selectByVisibleText("22");
		
		WebElement month = driver.findElement(By.id("month"));
		Select mon=new Select(month);
		mon.selectByIndex(7);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select yea=new Select(year);
		yea.selectByValue("1998");
		
		driver.findElement(By.xpath("(//*[@class='_8esa'])[2]")).click();
		//driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]"));
		
		Thread.sleep(3000);
		driver.quit();

		
		
		
		
		
		
	}
}



