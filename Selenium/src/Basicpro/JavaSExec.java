package Basicpro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSExec 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(100,200)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(100,-200)");
		Thread.sleep(2000);
		js.executeScript("history.go()");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//*[@name='q']"));
		js.executeScript("arguments[0].value='Nandhini'", element);
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//*[@class='button-1 search-box-button']"));
		js.executeScript("arguments[0].click()", search);
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(100,300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(100,-300)");
		Thread.sleep(2000);
		driver.quit();
		//Handle Disabled Elements also using this method like(js.executeScript("arguments[0].value=' '",element));...
		
		
	}
}
