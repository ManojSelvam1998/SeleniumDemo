package Basicpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframee 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.tripodeal.com/hotels");
		driver.switchTo().frame(0);
		driver.findElement(By.name("destination")).sendKeys("Banglore");
		Thread.sleep(2000);
		
		driver.get("https://snowcityblr.com/contact-us/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[text()='Directions']")).click();
		Thread.sleep(3000);
		
		driver.quit();
		//driver.switchTo().frame(index-->0,1,2)..
		//driver.switchTo().frame(String-->"Attribute value")..like(id,name,)
		//driver.switchTo().frame(WebElement-->Attribute name and Attribute value)..like(xpath by text,attribute)
		//driver.switchTo().frame();-->return(defaultContent();)
		//driver.switchTo().frame().switchTo.frame();-->return(driver.switchTo().parentFrame();
	}
}
