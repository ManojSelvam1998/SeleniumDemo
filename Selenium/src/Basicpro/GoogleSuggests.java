package Basicpro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggests 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		List<WebElement> something = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		int i=0;
		for (WebElement webElement : something) 
		{i++; 
		System.out.println(webElement.getText()); 
		if(i==5) { System.out.println("  5th Element "+webElement.getText()); }}
		Thread.sleep(3000);
		driver.quit();
	}
}
