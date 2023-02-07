package Basicpro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelClsFor 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Selenium Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Ajith/OneDrive/Desktop/SelectClass.html");
		
		WebElement mul=driver.findElement(By.id("multiple"));
		Select select1=new Select(mul);
		List<WebElement> option = select1.getOptions();
		int size=option.size();
		for(int i=0;i<size;i++)
		{
			select1.selectByIndex(i);
			Thread.sleep(2000);
		}
		
	}
}
