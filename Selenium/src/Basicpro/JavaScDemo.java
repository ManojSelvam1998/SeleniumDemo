package Basicpro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(100,-300)");
		Thread.sleep(2000);
		 WebElement element=driver.findElement(By.id("small-searchterms"));
		 js.executeScript("arguments[0].value='hi'",element);
		 WebElement button = driver.findElement(By.xpath("//*[@class='button-1 search-box-button']"));
		 js.executeScript("arguments[0].click()",button);
		 
		 
		
	}
}
